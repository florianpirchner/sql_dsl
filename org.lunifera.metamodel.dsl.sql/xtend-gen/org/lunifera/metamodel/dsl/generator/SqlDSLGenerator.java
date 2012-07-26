package org.lunifera.metamodel.dsl.generator;

import com.google.common.collect.Iterables;
import com.google.common.collect.Iterators;
import com.google.inject.Inject;
import java.util.Arrays;
import java.util.Iterator;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.lunifera.metamodel.dsl.generator.HelperExtensions;
import org.lunifera.metamodel.dsl.sqlDSL.SArtifact;
import org.lunifera.metamodel.dsl.sqlDSL.SColumn;
import org.lunifera.metamodel.dsl.sqlDSL.SJoinColumn;
import org.lunifera.metamodel.dsl.sqlDSL.SModel;
import org.lunifera.metamodel.dsl.sqlDSL.SSettings;
import org.lunifera.metamodel.dsl.sqlDSL.STable;
import org.lunifera.metamodel.dsl.sqlDSL.STableMember;

@SuppressWarnings("all")
public class SqlDSLGenerator implements IGenerator {
  @Inject
  private IterableExtensions _iterableExtensions;
  
  @Inject
  private HelperExtensions _helperExtensions;
  
  private int indexLeft;
  
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    TreeIterator<EObject> _allContents = resource.getAllContents();
    Iterator<SModel> _filter = Iterators.<SModel>filter(_allContents, SModel.class);
    Iterable<SModel> _iterable = IteratorExtensions.<SModel>toIterable(_filter);
    for (final SModel model : _iterable) {
      {
        String generatedFile = model.getGeneratedFile();
        String _concat = generatedFile.concat(".sql");
        CharSequence _generate = this.generate(model);
        fsa.generateFile(_concat, _generate);
      }
    }
  }
  
  protected CharSequence _generate(final SModel model) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("-- schema --");
    _builder.newLine();
    SSettings _settings = model.getSettings();
    CharSequence _generateSchema = this.generateSchema(_settings);
    _builder.append(_generateSchema, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    {
      EList<SArtifact> _artifact = model.getArtifact();
      Iterable<STable> _filter = Iterables.<STable>filter(_artifact, STable.class);
      for(final STable table : _filter) {
        CharSequence _generate = this.generate(table);
        _builder.append(_generate, "");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    {
      EList<SArtifact> _artifact_1 = model.getArtifact();
      Iterable<STable> _filter_1 = Iterables.<STable>filter(_artifact_1, STable.class);
      final Function1<STable,Boolean> _function = new Function1<STable,Boolean>() {
          public Boolean apply(final STable it) {
            boolean _shouldGenerateForeignKey = SqlDSLGenerator.this._helperExtensions.shouldGenerateForeignKey(it);
            return Boolean.valueOf(_shouldGenerateForeignKey);
          }
        };
      Iterable<STable> _filter_2 = IterableExtensions.<STable>filter(_filter_1, _function);
      for(final STable table_1 : _filter_2) {
        String _generateForeignKey = this.generateForeignKey(table_1);
        _builder.append(_generateForeignKey, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence generateSchema(final SSettings settings) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("CREATE SCHEMA IF NOT EXISTS ");
    String _dBSchemaString = this._helperExtensions.toDBSchemaString(settings);
    _builder.append(_dBSchemaString, "");
    _builder.append(" CHARACTER SET = utf8;");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _generate(final STable table) {
    StringConcatenation _builder = new StringConcatenation();
    this.initIndexCounter(table);
    _builder.newLineIfNotEmpty();
    CharSequence _comment = this._helperExtensions.toComment(table);
    _builder.append(_comment, "");
    _builder.newLineIfNotEmpty();
    _builder.append("CREATE TABLE ");
    String _dBSchemaString = this._helperExtensions.toDBSchemaString(table);
    _builder.append(_dBSchemaString, "");
    _builder.append(".");
    String _dBTableString = this._helperExtensions.toDBTableString(table);
    _builder.append(_dBTableString, "");
    _builder.append("(");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _columnPrefix = this._helperExtensions.toColumnPrefix(table);
    _builder.append(_columnPrefix, "	");
    _builder.append("_ID int NOT NULL AUTO_INCREMENT COMMENT \'id\',");
    _builder.newLineIfNotEmpty();
    {
      EList<STableMember> _columns = table.getColumns();
      for(final STableMember column : _columns) {
        _builder.append("\t");
        CharSequence _generate = this.generate(column);
        _builder.append(_generate, "	");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    CharSequence _columnPrefix_1 = this._helperExtensions.toColumnPrefix(table);
    _builder.append(_columnPrefix_1, "	");
    _builder.append("_CREATED_BY int NOT NULL COMMENT \'createdBy\',");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _columnPrefix_2 = this._helperExtensions.toColumnPrefix(table);
    _builder.append(_columnPrefix_2, "	");
    _builder.append("_CREATED_AT datetime NOT NULL COMMENT \'createdAt\',");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _columnPrefix_3 = this._helperExtensions.toColumnPrefix(table);
    _builder.append(_columnPrefix_3, "	");
    _builder.append("_CHANGED_BY int NOT NULL COMMENT \'changedAt\',");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _columnPrefix_4 = this._helperExtensions.toColumnPrefix(table);
    _builder.append(_columnPrefix_4, "	");
    _builder.append("_CHANGED_AT datetime NOT NULL COMMENT \'changedAt\',");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _columnPrefix_5 = this._helperExtensions.toColumnPrefix(table);
    _builder.append(_columnPrefix_5, "	");
    _builder.append("_VERSION mediumint NOT NULL COMMENT \'version\',");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("PRIMARY KEY (MDE_ID),");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("KEY MDE_ID (MDE_ID)");
    {
      boolean _indexLeft = this.indexLeft();
      if (_indexLeft) {
        _builder.append(",");
      }
    }
    _builder.newLineIfNotEmpty();
    {
      EList<STableMember> _columns_1 = table.getColumns();
      final Function1<STableMember,Boolean> _function = new Function1<STableMember,Boolean>() {
          public Boolean apply(final STableMember it) {
            boolean _isIndexed = SqlDSLGenerator.this._helperExtensions.isIndexed(it);
            return Boolean.valueOf(_isIndexed);
          }
        };
      Iterable<STableMember> _filter = IterableExtensions.<STableMember>filter(_columns_1, _function);
      for(final STableMember column_1 : _filter) {
        _builder.append("\t");
        CharSequence _generateIndex = this.generateIndex(column_1);
        _builder.append(_generateIndex, "	");
        this.decreaseIndexCounter();
        {
          boolean _indexLeft_1 = this.indexLeft();
          if (_indexLeft_1) {
            _builder.append(",");
          }
        }
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append(") ENGINE = ");
    String _dBEngineString = this._helperExtensions.toDBEngineString(table);
    _builder.append(_dBEngineString, "");
    _builder.append(" DEFAULT CHARSET = utf8;");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public void initIndexCounter(final STable table) {
    EList<STableMember> _columns = table.getColumns();
    final Function1<STableMember,Boolean> _function = new Function1<STableMember,Boolean>() {
        public Boolean apply(final STableMember it) {
          boolean _isIndexed = SqlDSLGenerator.this._helperExtensions.isIndexed(it);
          return Boolean.valueOf(_isIndexed);
        }
      };
    Iterable<STableMember> _filter = IterableExtensions.<STableMember>filter(_columns, _function);
    int _size = IterableExtensions.size(_filter);
    this.indexLeft = _size;
  }
  
  public void decreaseIndexCounter() {
    int _minus = (this.indexLeft - 1);
    this.indexLeft = _minus;
  }
  
  public boolean indexLeft() {
    return (this.indexLeft > 0);
  }
  
  protected CharSequence _generate(final SColumn column) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _columnName = this._helperExtensions.toColumnName(column);
    _builder.append(_columnName, "");
    _builder.append(" ");
    CharSequence _columnType = this._helperExtensions.toColumnType(column);
    _builder.append(_columnType, "");
    _builder.append(" ");
    CharSequence _nullableModifier = this._helperExtensions.toNullableModifier(column);
    _builder.append(_nullableModifier, "");
    CharSequence _aESModifier = this._helperExtensions.toAESModifier(column);
    _builder.append(_aESModifier, "");
    CharSequence _comment = this._helperExtensions.toComment(column);
    _builder.append(_comment, "");
    _builder.append(", ");
    Object _finishColumn = this._helperExtensions.finishColumn(column);
    _builder.append(_finishColumn, "");
    return _builder;
  }
  
  protected CharSequence _generate(final SJoinColumn column) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _columnName = this._helperExtensions.toColumnName(column);
    _builder.append(_columnName, "");
    CharSequence _columnType = this._helperExtensions.toColumnType(column);
    _builder.append(_columnType, "");
    CharSequence _nullableModifier = this._helperExtensions.toNullableModifier(column);
    _builder.append(_nullableModifier, "");
    CharSequence _aESModifier = this._helperExtensions.toAESModifier(column);
    _builder.append(_aESModifier, "");
    CharSequence _comment = this._helperExtensions.toComment(column);
    _builder.append(_comment, "");
    _builder.append(",");
    return _builder;
  }
  
  protected CharSequence _generateIndex(final SColumn column) {
    StringConcatenation _builder = new StringConcatenation();
    String _indexType = this._helperExtensions.toIndexType(column);
    _builder.append(_indexType, "");
    _builder.append(" KEY IDX_");
    CharSequence _columnName = this._helperExtensions.toColumnName(column);
    _builder.append(_columnName, "");
    _builder.append(" (");
    CharSequence _columnName_1 = this._helperExtensions.toColumnName(column);
    _builder.append(_columnName_1, "");
    _builder.append(")");
    return _builder;
  }
  
  protected CharSequence _generateIndex(final SJoinColumn column) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("KEY IDX_");
    CharSequence _columnName = this._helperExtensions.toColumnName(column);
    _builder.append(_columnName, "");
    _builder.append(" (");
    CharSequence _columnName_1 = this._helperExtensions.toColumnName(column);
    _builder.append(_columnName_1, "");
    _builder.append(")");
    return _builder;
  }
  
  public String generateForeignKey(final STable table) {
    StringBuilder _stringBuilder = new StringBuilder();
    StringBuilder builder = _stringBuilder;
    EList<STableMember> _columns = table.getColumns();
    Iterable<SJoinColumn> _filter = Iterables.<SJoinColumn>filter(_columns, SJoinColumn.class);
    for (final SJoinColumn joinColumn : _filter) {
      {
        STable referencedTable = joinColumn.getReferencedType();
        CharSequence _generateForeignKey = this.generateForeignKey(table, referencedTable);
        StringBuilder _append = builder.append(_generateForeignKey);
        _append.append("\n");
      }
    }
    return builder.toString();
  }
  
  public CharSequence generateForeignKey(final STable table, final STable refTable) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("ALTER TABLE ");
    String _dBSchemaString = this._helperExtensions.toDBSchemaString(table);
    _builder.append(_dBSchemaString, "");
    _builder.append(".");
    String _dBTableString = this._helperExtensions.toDBTableString(table);
    _builder.append(_dBTableString, "");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("ADD CONSTRAINT FK_");
    CharSequence _columnPrefix = this._helperExtensions.toColumnPrefix(table);
    _builder.append(_columnPrefix, "	");
    _builder.append("_");
    CharSequence _columnPrefix_1 = this._helperExtensions.toColumnPrefix(refTable);
    _builder.append(_columnPrefix_1, "	");
    _builder.append("_ID FOREIGN KEY (");
    CharSequence _columnPrefix_2 = this._helperExtensions.toColumnPrefix(table);
    _builder.append(_columnPrefix_2, "	");
    _builder.append("_");
    CharSequence _columnPrefix_3 = this._helperExtensions.toColumnPrefix(refTable);
    _builder.append(_columnPrefix_3, "	");
    _builder.append("_ID)");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("REFERENCES ");
    String _dBSchemaString_1 = this._helperExtensions.toDBSchemaString(refTable);
    _builder.append(_dBSchemaString_1, "	");
    _builder.append(".");
    String _dBTableString_1 = this._helperExtensions.toDBTableString(refTable);
    _builder.append(_dBTableString_1, "	");
    _builder.append("(");
    CharSequence _columnPrefix_4 = this._helperExtensions.toColumnPrefix(refTable);
    _builder.append(_columnPrefix_4, "	");
    _builder.append("_ID)");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence generate(final EObject column) {
    if (column instanceof SColumn) {
      return _generate((SColumn)column);
    } else if (column instanceof SJoinColumn) {
      return _generate((SJoinColumn)column);
    } else if (column instanceof STable) {
      return _generate((STable)column);
    } else if (column instanceof SModel) {
      return _generate((SModel)column);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(column).toString());
    }
  }
  
  public CharSequence generateIndex(final STableMember column) {
    if (column instanceof SColumn) {
      return _generateIndex((SColumn)column);
    } else if (column instanceof SJoinColumn) {
      return _generateIndex((SJoinColumn)column);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(column).toString());
    }
  }
}

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
    _builder.append("\uFFFDmodel.settings.generateSchema\uFFFD");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\uFFFDFOR table : model.artifact.filter(typeof(STable))\uFFFD");
    _builder.newLine();
    _builder.append("\uFFFDtable.generate\uFFFD");
    _builder.newLine();
    _builder.append("\uFFFDENDFOR\uFFFD");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\uFFFDFOR table : model.artifact.filter(typeof(STable)).filter([it.shouldGenerateForeignKey])\uFFFD");
    _builder.newLine();
    _builder.append("\uFFFDtable.generateForeignKey\uFFFD");
    _builder.newLine();
    _builder.append("\uFFFDENDFOR\uFFFD");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateSchema(final SSettings settings) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("CREATE SCHEMA IF NOT EXISTS \uFFFDsettings.toDBSchemaString\uFFFD CHARACTER SET = utf8;");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generate(final STable table) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\uFFFDtable.initIndexCounter\uFFFD");
    _builder.newLine();
    _builder.append("\uFFFDtable.toComment\uFFFD");
    _builder.newLine();
    _builder.append("CREATE TABLE \uFFFDtable.toDBSchemaString\uFFFD.\uFFFDtable.toDBTableString\uFFFD(");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\uFFFDtable.toColumnPrefix\uFFFD_ID int NOT NULL AUTO_INCREMENT COMMENT \'id\',");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\uFFFDFOR column : table.columns\uFFFD");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\uFFFDcolumn.generate\uFFFD");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\uFFFDENDFOR\uFFFD");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\uFFFDtable.toColumnPrefix\uFFFD_CREATED_BY int NOT NULL COMMENT \'createdBy\',");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\uFFFDtable.toColumnPrefix\uFFFD_CREATED_AT datetime NOT NULL COMMENT \'createdAt\',");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\uFFFDtable.toColumnPrefix\uFFFD_CHANGED_BY int NOT NULL COMMENT \'changedAt\',");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\uFFFDtable.toColumnPrefix\uFFFD_CHANGED_AT datetime NOT NULL COMMENT \'changedAt\',");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\uFFFDtable.toColumnPrefix\uFFFD_VERSION mediumint NOT NULL COMMENT \'version\',");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("PRIMARY KEY (MDE_ID),");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("KEY MDE_ID (MDE_ID)\uFFFDIF indexLeft()\uFFFD,\uFFFDENDIF\uFFFD");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\uFFFDFOR column : table.columns.filter([it.isIndexed])\uFFFD");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\uFFFDcolumn.generateIndex\uFFFD\uFFFDdecreaseIndexCounter\uFFFD\uFFFDIF indexLeft()\uFFFD,\uFFFDENDIF\uFFFD");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\uFFFDENDFOR\uFFFD");
    _builder.newLine();
    _builder.append(") ENGINE = \uFFFDtable.toDBEngineString\uFFFD DEFAULT CHARSET = utf8;");
    _builder.newLine();
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
    _builder.append("\uFFFDcolumn.toColumnName\uFFFD \uFFFDcolumn.toColumnType\uFFFD \uFFFDcolumn.toNullableModifier\uFFFD\uFFFDcolumn.toAESModifier\uFFFD\uFFFDcolumn.toComment\uFFFD, \uFFFDcolumn.finishColumn\uFFFD");
    return _builder;
  }
  
  protected CharSequence _generate(final SJoinColumn column) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\uFFFDcolumn.toColumnName\uFFFD\uFFFDcolumn.toColumnType\uFFFD\uFFFDcolumn.toNullableModifier\uFFFD\uFFFDcolumn.toAESModifier\uFFFD\uFFFDcolumn.toComment\uFFFD,");
    return _builder;
  }
  
  protected CharSequence _generateIndex(final SColumn column) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\uFFFDcolumn.toIndexType\uFFFD KEY IDX_\uFFFDcolumn.toColumnName\uFFFD (\uFFFDcolumn.toColumnName\uFFFD)");
    return _builder;
  }
  
  protected CharSequence _generateIndex(final SJoinColumn column) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("KEY IDX_\uFFFDcolumn.toColumnName\uFFFD (\uFFFDcolumn.toColumnName\uFFFD)");
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
    _builder.append("ALTER TABLE \uFFFDtable.toDBSchemaString\uFFFD.\uFFFDtable.toDBTableString\uFFFD");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ADD CONSTRAINT FK_\uFFFDtable.toColumnPrefix\uFFFD_\uFFFDrefTable.toColumnPrefix\uFFFD_ID FOREIGN KEY (\uFFFDtable.toColumnPrefix\uFFFD_\uFFFDrefTable.toColumnPrefix\uFFFD_ID)");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("REFERENCES \uFFFDrefTable.toDBSchemaString\uFFFD.\uFFFDrefTable.toDBTableString\uFFFD(\uFFFDrefTable.toColumnPrefix\uFFFD_ID)");
    _builder.newLine();
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

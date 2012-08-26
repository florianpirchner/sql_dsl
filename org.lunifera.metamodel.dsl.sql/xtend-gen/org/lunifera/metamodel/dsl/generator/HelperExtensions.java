package org.lunifera.metamodel.dsl.generator;

import com.google.common.base.Objects;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.lunifera.metamodel.dsl.sqlDSL.SColumn;
import org.lunifera.metamodel.dsl.sqlDSL.SColumnProps;
import org.lunifera.metamodel.dsl.sqlDSL.SDBEngine;
import org.lunifera.metamodel.dsl.sqlDSL.SDecimal;
import org.lunifera.metamodel.dsl.sqlDSL.SEnum;
import org.lunifera.metamodel.dsl.sqlDSL.SEnumLiteral;
import org.lunifera.metamodel.dsl.sqlDSL.SExtDeclaredSQLType;
import org.lunifera.metamodel.dsl.sqlDSL.SIndex;
import org.lunifera.metamodel.dsl.sqlDSL.SInlinedSQLType;
import org.lunifera.metamodel.dsl.sqlDSL.SJoinColumn;
import org.lunifera.metamodel.dsl.sqlDSL.SModel;
import org.lunifera.metamodel.dsl.sqlDSL.SSettings;
import org.lunifera.metamodel.dsl.sqlDSL.SSimpleTypes;
import org.lunifera.metamodel.dsl.sqlDSL.SString;
import org.lunifera.metamodel.dsl.sqlDSL.STable;
import org.lunifera.metamodel.dsl.sqlDSL.STableMember;

@SuppressWarnings("all")
public class HelperExtensions {
  public String toDBEngineString(final SSettings settings) {
    SDBEngine _engine = settings.getEngine();
    String _dBEngineString = this.toDBEngineString(_engine);
    return _dBEngineString;
  }
  
  public String toDBEngineString(final STable table) {
    boolean _and = false;
    SSettings _settings = table.getSettings();
    boolean _notEquals = (!Objects.equal(_settings, null));
    if (!_notEquals) {
      _and = false;
    } else {
      SSettings _settings_1 = table.getSettings();
      SDBEngine _engine = _settings_1.getEngine();
      boolean _notEquals_1 = (!Objects.equal(_engine, null));
      _and = (_notEquals && _notEquals_1);
    }
    if (_and) {
      SSettings _settings_2 = table.getSettings();
      SDBEngine _engine_1 = _settings_2.getEngine();
      return this.toDBEngineString(_engine_1);
    } else {
      EObject _eContainer = table.eContainer();
      SSettings _settings_3 = ((SModel) _eContainer).getSettings();
      return this.toDBEngineString(_settings_3);
    }
  }
  
  public SDBEngine toDBEngine(final STable table) {
    boolean _and = false;
    SSettings _settings = table.getSettings();
    boolean _notEquals = (!Objects.equal(_settings, null));
    if (!_notEquals) {
      _and = false;
    } else {
      SSettings _settings_1 = table.getSettings();
      SDBEngine _engine = _settings_1.getEngine();
      boolean _notEquals_1 = (!Objects.equal(_engine, null));
      _and = (_notEquals && _notEquals_1);
    }
    if (_and) {
      SSettings _settings_2 = table.getSettings();
      return _settings_2.getEngine();
    } else {
      EObject _eContainer = table.eContainer();
      SSettings _settings_3 = ((SModel) _eContainer).getSettings();
      return _settings_3.getEngine();
    }
  }
  
  public String toDBEngineString(final SDBEngine engine) {
    boolean _matched = false;
    if (!_matched) {
      if (Objects.equal(engine,SDBEngine.INNODB)) {
        _matched=true;
        return "InnoDB";
      }
    }
    if (!_matched) {
      if (Objects.equal(engine,SDBEngine.MYISAM)) {
        _matched=true;
        return "MyISAM";
      }
    }
    return "InnoDB";
  }
  
  public String toDBSchemaString(final STable table) {
    boolean _and = false;
    SSettings _settings = table.getSettings();
    boolean _notEquals = (!Objects.equal(_settings, null));
    if (!_notEquals) {
      _and = false;
    } else {
      SSettings _settings_1 = table.getSettings();
      String _schema = _settings_1.getSchema();
      boolean _notEquals_1 = (!Objects.equal(_schema, null));
      _and = (_notEquals && _notEquals_1);
    }
    if (_and) {
      SSettings _settings_2 = table.getSettings();
      return this.toDBSchemaString(_settings_2);
    } else {
      EObject _eContainer = table.eContainer();
      final SModel model = ((SModel) _eContainer);
      boolean _equals = Objects.equal(model, null);
      if (_equals) {
        return "";
      }
      SSettings _settings_3 = model.getSettings();
      return this.toDBSchemaString(_settings_3);
    }
  }
  
  public String toDBSchemaString(final SSettings settings) {
    boolean _and = false;
    boolean _notEquals = (!Objects.equal(settings, null));
    if (!_notEquals) {
      _and = false;
    } else {
      String _schema = settings.getSchema();
      boolean _notEquals_1 = (!Objects.equal(_schema, null));
      _and = (_notEquals && _notEquals_1);
    }
    if (_and) {
      String _schema_1 = settings.getSchema();
      return _schema_1.toUpperCase();
    }
    return "";
  }
  
  public String toDBTableString(final STable table) {
    boolean _or = false;
    boolean _equals = Objects.equal(table, null);
    if (_equals) {
      _or = true;
    } else {
      String _name = table.getName();
      boolean _equals_1 = Objects.equal(_name, null);
      _or = (_equals || _equals_1);
    }
    if (_or) {
      return "";
    }
    String _name_1 = table.getName();
    return _name_1.toUpperCase();
  }
  
  protected CharSequence _toColumnName(final SColumn column) {
    StringConcatenation _builder = new StringConcatenation();
    STable _table = this.table(column);
    CharSequence _columnPrefix = this.toColumnPrefix(_table);
    _builder.append(_columnPrefix, "");
    _builder.append("_");
    String _name = column.getName();
    String _upperCase = _name.toUpperCase();
    _builder.append(_upperCase, "");
    return _builder;
  }
  
  protected CharSequence _toColumnName(final SJoinColumn column) {
    StringConcatenation _builder = new StringConcatenation();
    STable _table = this.table(column);
    CharSequence _columnPrefix = this.toColumnPrefix(_table);
    _builder.append(_columnPrefix, "");
    _builder.append("_");
    STable _referencedType = column.getReferencedType();
    CharSequence _columnPrefix_1 = this.toColumnPrefix(_referencedType);
    _builder.append(_columnPrefix_1, "");
    _builder.append("_");
    String _name = column.getName();
    String _upperCase = _name.toUpperCase();
    _builder.append(_upperCase, "");
    return _builder;
  }
  
  protected CharSequence _toColumnPrefix(final SColumn column) {
    StringConcatenation _builder = new StringConcatenation();
    STable _table = this.table(column);
    CharSequence _columnPrefix = this.toColumnPrefix(_table);
    _builder.append(_columnPrefix, "");
    return _builder;
  }
  
  protected CharSequence _toColumnPrefix(final SJoinColumn column) {
    StringConcatenation _builder = new StringConcatenation();
    STable _table = this.table(column);
    CharSequence _columnPrefix = this.toColumnPrefix(_table);
    _builder.append(_columnPrefix, "");
    return _builder;
  }
  
  protected CharSequence _toNullableModifier(final SColumn column) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _and = false;
      SColumnProps _props = column.getProps();
      boolean _notEquals = (!Objects.equal(_props, null));
      if (!_notEquals) {
        _and = false;
      } else {
        SColumnProps _props_1 = column.getProps();
        boolean _isNullable = _props_1.isNullable();
        boolean _not = (!_isNullable);
        _and = (_notEquals && _not);
      }
      if (_and) {
        _builder.append("NOT NULL ");
      } else {
      }
    }
    return _builder;
  }
  
  protected CharSequence _toNullableModifier(final SJoinColumn column) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _and = false;
      SColumnProps _props = column.getProps();
      boolean _notEquals = (!Objects.equal(_props, null));
      if (!_notEquals) {
        _and = false;
      } else {
        SColumnProps _props_1 = column.getProps();
        boolean _isNullable = _props_1.isNullable();
        boolean _not = (!_isNullable);
        _and = (_notEquals && _not);
      }
      if (_and) {
        _builder.append("NOT NULL ");
      } else {
      }
    }
    return _builder;
  }
  
  protected boolean _isIndexed(final SColumn column) {
    boolean _and = false;
    boolean _and_1 = false;
    SColumnProps _props = column.getProps();
    boolean _notEquals = (!Objects.equal(_props, null));
    if (!_notEquals) {
      _and_1 = false;
    } else {
      SColumnProps _props_1 = column.getProps();
      SIndex _index = _props_1.getIndex();
      boolean _notEquals_1 = (!Objects.equal(_index, null));
      _and_1 = (_notEquals && _notEquals_1);
    }
    if (!_and_1) {
      _and = false;
    } else {
      SColumnProps _props_2 = column.getProps();
      SIndex _index_1 = _props_2.getIndex();
      boolean _notEquals_2 = (!Objects.equal(_index_1, SIndex.NO));
      _and = (_and_1 && _notEquals_2);
    }
    return _and;
  }
  
  protected boolean _isIndexed(final SJoinColumn column) {
    boolean _and = false;
    boolean _and_1 = false;
    SColumnProps _props = column.getProps();
    boolean _notEquals = (!Objects.equal(_props, null));
    if (!_notEquals) {
      _and_1 = false;
    } else {
      SColumnProps _props_1 = column.getProps();
      SIndex _index = _props_1.getIndex();
      boolean _notEquals_1 = (!Objects.equal(_index, null));
      _and_1 = (_notEquals && _notEquals_1);
    }
    if (!_and_1) {
      _and = false;
    } else {
      SColumnProps _props_2 = column.getProps();
      SIndex _index_1 = _props_2.getIndex();
      boolean _notEquals_2 = (!Objects.equal(_index_1, SIndex.NO));
      _and = (_and_1 && _notEquals_2);
    }
    return _and;
  }
  
  protected String _toIndexType(final SColumn column) {
    boolean _or = false;
    SColumnProps _props = column.getProps();
    boolean _equals = Objects.equal(_props, null);
    if (_equals) {
      _or = true;
    } else {
      SColumnProps _props_1 = column.getProps();
      SIndex _index = _props_1.getIndex();
      boolean _equals_1 = Objects.equal(_index, null);
      _or = (_equals || _equals_1);
    }
    if (_or) {
      return "";
    }
    SColumnProps _props_2 = column.getProps();
    SIndex _index_1 = _props_2.getIndex();
    final SIndex _switchValue = _index_1;
    boolean _matched = false;
    if (!_matched) {
      if (Objects.equal(_switchValue,SIndex.SPATIAL)) {
        _matched=true;
        return "SPATIAL";
      }
    }
    if (!_matched) {
      if (Objects.equal(_switchValue,SIndex.UNIQUE)) {
        _matched=true;
        return "UNIQUE";
      }
    }
    return "";
  }
  
  protected String _toIndexType(final SJoinColumn column) {
    boolean _or = false;
    SColumnProps _props = column.getProps();
    boolean _equals = Objects.equal(_props, null);
    if (_equals) {
      _or = true;
    } else {
      SColumnProps _props_1 = column.getProps();
      SIndex _index = _props_1.getIndex();
      boolean _equals_1 = Objects.equal(_index, null);
      _or = (_equals || _equals_1);
    }
    if (_or) {
      return "";
    }
    SColumnProps _props_2 = column.getProps();
    SIndex _index_1 = _props_2.getIndex();
    final SIndex _switchValue = _index_1;
    boolean _matched = false;
    if (!_matched) {
      if (Objects.equal(_switchValue,SIndex.SPATIAL)) {
        _matched=true;
        return "SPATIAL";
      }
    }
    if (!_matched) {
      if (Objects.equal(_switchValue,SIndex.UNIQUE)) {
        _matched=true;
        return "UNIQUE";
      }
    }
    return "";
  }
  
  protected CharSequence _toComment(final SColumn column) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _and = false;
      SColumnProps _props = column.getProps();
      boolean _notEquals = (!Objects.equal(_props, null));
      if (!_notEquals) {
        _and = false;
      } else {
        SColumnProps _props_1 = column.getProps();
        String _javacolumn = _props_1.getJavacolumn();
        boolean _notEquals_1 = (!Objects.equal(_javacolumn, null));
        _and = (_notEquals && _notEquals_1);
      }
      if (_and) {
        _builder.append("COMMENT \'");
        SColumnProps _props_2 = column.getProps();
        String _javacolumn_1 = _props_2.getJavacolumn();
        _builder.append(_javacolumn_1, "");
        _builder.append("\'");
      } else {
      }
    }
    return _builder;
  }
  
  protected CharSequence _toComment(final SJoinColumn column) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _and = false;
      SColumnProps _props = column.getProps();
      boolean _notEquals = (!Objects.equal(_props, null));
      if (!_notEquals) {
        _and = false;
      } else {
        SColumnProps _props_1 = column.getProps();
        String _javacolumn = _props_1.getJavacolumn();
        boolean _notEquals_1 = (!Objects.equal(_javacolumn, null));
        _and = (_notEquals && _notEquals_1);
      }
      if (_and) {
        _builder.append("COMMENT\'");
        SColumnProps _props_2 = column.getProps();
        String _javacolumn_1 = _props_2.getJavacolumn();
        _builder.append(_javacolumn_1, "");
        _builder.append("\'");
      } else {
      }
    }
    return _builder;
  }
  
  protected CharSequence _toComment(final STable table) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/*");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Table: ");
    String _dBTableString = this.toDBTableString(table);
    _builder.append(_dBTableString, "	");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("Prefix: ");
    CharSequence _columnPrefix = this.toColumnPrefix(table);
    _builder.append(_columnPrefix, "	");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("Entity: ");
    String _entityname = table.getEntityname();
    _builder.append(_entityname, "	");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("Cached: ");
    boolean _isCached = table.isCached();
    _builder.append(_isCached, "	");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    String _dBEngineString = this.toDBEngineString(table);
    _builder.append(_dBEngineString, "	");
    _builder.newLineIfNotEmpty();
    _builder.append("*/");
    return _builder;
  }
  
  protected CharSequence _toAESModifier(final SColumn column) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  protected CharSequence _toAESModifier(final SJoinColumn column) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  protected STable _table(final SColumn column) {
    EObject _eContainer = column.eContainer();
    return ((STable) _eContainer);
  }
  
  protected STable _table(final SJoinColumn column) {
    EObject _eContainer = column.eContainer();
    return ((STable) _eContainer);
  }
  
  protected CharSequence _toColumnType(final SColumn column) {
    SExtDeclaredSQLType _extType = column.getExtType();
    boolean _notEquals = (!Objects.equal(_extType, null));
    if (_notEquals) {
      SExtDeclaredSQLType _extType_1 = column.getExtType();
      return this.toExtType(_extType_1);
    } else {
      SInlinedSQLType _inlinedType = column.getInlinedType();
      boolean _notEquals_1 = (!Objects.equal(_inlinedType, null));
      if (_notEquals_1) {
        SInlinedSQLType _inlinedType_1 = column.getInlinedType();
        return this.toColumnType(_inlinedType_1);
      } else {
        SSimpleTypes _simpleType = column.getSimpleType();
        boolean _notEquals_2 = (!Objects.equal(_simpleType, null));
        if (_notEquals_2) {
          SSimpleTypes _simpleType_1 = column.getSimpleType();
          return this.toColumnType(_simpleType_1);
        }
      }
    }
    return "missing";
  }
  
  protected String _toExtType(final SExtDeclaredSQLType enum_) {
    return null;
  }
  
  protected String _toExtType(final SEnum enumx) {
    return "int";
  }
  
  public Object finishColumn(final SColumn column) {
    SExtDeclaredSQLType _extType = column.getExtType();
    boolean _notEquals = (!Objects.equal(_extType, null));
    if (_notEquals) {
      SExtDeclaredSQLType _extType_1 = column.getExtType();
      return this.toColumnFinishing(_extType_1);
    } else {
      SInlinedSQLType _inlinedType = column.getInlinedType();
      boolean _notEquals_1 = (!Objects.equal(_inlinedType, null));
      if (_notEquals_1) {
      } else {
        SSimpleTypes _simpleType = column.getSimpleType();
        boolean _notEquals_2 = (!Objects.equal(_simpleType, null));
        if (_notEquals_2) {
        }
      }
    }
    return "";
  }
  
  protected StringBuilder _toColumnFinishing(final SExtDeclaredSQLType enumx) {
    return null;
  }
  
  protected StringBuilder _toColumnFinishing(final SEnum enumx) {
    StringBuilder _xblockexpression = null;
    {
      StringBuilder _stringBuilder = new StringBuilder();
      final StringBuilder builder = _stringBuilder;
      EList<SEnumLiteral> _literals = enumx.getLiterals();
      for (final SEnumLiteral literal : _literals) {
        {
          int _length = builder.length();
          boolean _equals = (_length == 0);
          if (_equals) {
            builder.append("/* ENUM ");
          } else {
            builder.append(", ");
          }
          int _value = literal.getValue();
          builder.append(_value);
          builder.append("=");
          String _name = literal.getName();
          builder.append(_name);
        }
      }
      StringBuilder _append = builder.append("*/");
      _xblockexpression = (_append);
    }
    return _xblockexpression;
  }
  
  protected CharSequence _toColumnType(final SSimpleTypes type) {
    String _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      if (Objects.equal(type,SSimpleTypes.BLOB)) {
        _matched=true;
        return "blob";
      }
    }
    if (!_matched) {
      if (Objects.equal(type,SSimpleTypes.BOOLEAN)) {
        _matched=true;
        return "boolean";
      }
    }
    if (!_matched) {
      if (Objects.equal(type,SSimpleTypes.COORDINATE)) {
        _matched=true;
        return "double precision(11,6)";
      }
    }
    if (!_matched) {
      if (Objects.equal(type,SSimpleTypes.CURRENCY)) {
        _matched=true;
        return "double precision(11,2)";
      }
    }
    if (!_matched) {
      if (Objects.equal(type,SSimpleTypes.DATE)) {
        _matched=true;
        return "date";
      }
    }
    if (!_matched) {
      if (Objects.equal(type,SSimpleTypes.DATETIME)) {
        _matched=true;
        return "datetime";
      }
    }
    if (!_matched) {
      if (Objects.equal(type,SSimpleTypes.FOTO)) {
        _matched=true;
        return "blob";
      }
    }
    if (!_matched) {
      if (Objects.equal(type,SSimpleTypes.INT)) {
        _matched=true;
        return "int";
      }
    }
    if (!_matched) {
      if (Objects.equal(type,SSimpleTypes.MEDIUM_INT)) {
        _matched=true;
        return "mediumint";
      }
    }
    if (!_matched) {
      if (Objects.equal(type,SSimpleTypes.POINT)) {
        _matched=true;
        return "point";
      }
    }
    if (!_matched) {
      if (Objects.equal(type,SSimpleTypes.POLYGON)) {
        _matched=true;
        return "polygon";
      }
    }
    if (!_matched) {
      if (Objects.equal(type,SSimpleTypes.SMALL_INT)) {
        _matched=true;
        return "smallint";
      }
    }
    if (!_matched) {
      if (Objects.equal(type,SSimpleTypes.TIME)) {
        _matched=true;
        return "time";
      }
    }
    if (!_matched) {
      if (Objects.equal(type,SSimpleTypes.TINY_INT)) {
        _matched=true;
        return "tinyint";
      }
    }
    return _switchResult;
  }
  
  protected CharSequence _toColumnType(final SDecimal type) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("double precision(11,");
    int _value = type.getValue();
    _builder.append(_value, "");
    _builder.append(")");
    return _builder;
  }
  
  protected CharSequence _toColumnType(final SString type) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("varchar(");
    int _value = type.getValue();
    _builder.append(_value, "");
    _builder.append(")");
    return _builder;
  }
  
  protected CharSequence _toColumnType(final SJoinColumn column) {
    return "int";
  }
  
  protected CharSequence _toColumnPrefix(final STable table) {
    boolean _and = false;
    boolean _notEquals = (!Objects.equal(table, null));
    if (!_notEquals) {
      _and = false;
    } else {
      String _prefix = table.getPrefix();
      boolean _notEquals_1 = (!Objects.equal(_prefix, null));
      _and = (_notEquals && _notEquals_1);
    }
    if (_and) {
      String _prefix_1 = table.getPrefix();
      return _prefix_1.toUpperCase();
    }
    return "";
  }
  
  public boolean shouldGenerateForeignKey(final STable table) {
    boolean _and = false;
    boolean _isInnoDB = this.isInnoDB(table);
    if (!_isInnoDB) {
      _and = false;
    } else {
      boolean _containsJoinColumn = this.containsJoinColumn(table);
      _and = (_isInnoDB && _containsJoinColumn);
    }
    return _and;
  }
  
  public boolean isInnoDB(final STable table) {
    SDBEngine _dBEngine = this.toDBEngine(table);
    boolean _equals = Objects.equal(_dBEngine, SDBEngine.INNODB);
    return _equals;
  }
  
  public boolean containsJoinColumn(final STable table) {
    EList<STableMember> _columns = table.getColumns();
    final Function1<STableMember,Boolean> _function = new Function1<STableMember,Boolean>() {
        public Boolean apply(final STableMember it) {
          return Boolean.valueOf((it instanceof SJoinColumn));
        }
      };
    boolean _exists = IterableExtensions.<STableMember>exists(_columns, _function);
    return _exists;
  }
  
  public CharSequence toColumnName(final STableMember column) {
    if (column instanceof SColumn) {
      return _toColumnName((SColumn)column);
    } else if (column instanceof SJoinColumn) {
      return _toColumnName((SJoinColumn)column);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(column).toString());
    }
  }
  
  public CharSequence toColumnPrefix(final EObject column) {
    if (column instanceof SColumn) {
      return _toColumnPrefix((SColumn)column);
    } else if (column instanceof SJoinColumn) {
      return _toColumnPrefix((SJoinColumn)column);
    } else if (column instanceof STable) {
      return _toColumnPrefix((STable)column);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(column).toString());
    }
  }
  
  public CharSequence toNullableModifier(final STableMember column) {
    if (column instanceof SColumn) {
      return _toNullableModifier((SColumn)column);
    } else if (column instanceof SJoinColumn) {
      return _toNullableModifier((SJoinColumn)column);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(column).toString());
    }
  }
  
  public boolean isIndexed(final STableMember column) {
    if (column instanceof SColumn) {
      return _isIndexed((SColumn)column);
    } else if (column instanceof SJoinColumn) {
      return _isIndexed((SJoinColumn)column);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(column).toString());
    }
  }
  
  public String toIndexType(final STableMember column) {
    if (column instanceof SColumn) {
      return _toIndexType((SColumn)column);
    } else if (column instanceof SJoinColumn) {
      return _toIndexType((SJoinColumn)column);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(column).toString());
    }
  }
  
  public CharSequence toComment(final EObject column) {
    if (column instanceof SColumn) {
      return _toComment((SColumn)column);
    } else if (column instanceof SJoinColumn) {
      return _toComment((SJoinColumn)column);
    } else if (column instanceof STable) {
      return _toComment((STable)column);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(column).toString());
    }
  }
  
  public CharSequence toAESModifier(final STableMember column) {
    if (column instanceof SColumn) {
      return _toAESModifier((SColumn)column);
    } else if (column instanceof SJoinColumn) {
      return _toAESModifier((SJoinColumn)column);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(column).toString());
    }
  }
  
  public STable table(final STableMember column) {
    if (column instanceof SColumn) {
      return _table((SColumn)column);
    } else if (column instanceof SJoinColumn) {
      return _table((SJoinColumn)column);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(column).toString());
    }
  }
  
  public CharSequence toColumnType(final Object column) {
    if (column instanceof SColumn) {
      return _toColumnType((SColumn)column);
    } else if (column instanceof SDecimal) {
      return _toColumnType((SDecimal)column);
    } else if (column instanceof SJoinColumn) {
      return _toColumnType((SJoinColumn)column);
    } else if (column instanceof SString) {
      return _toColumnType((SString)column);
    } else if (column instanceof SSimpleTypes) {
      return _toColumnType((SSimpleTypes)column);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(column).toString());
    }
  }
  
  public String toExtType(final SExtDeclaredSQLType enumx) {
    if (enumx instanceof SEnum) {
      return _toExtType((SEnum)enumx);
    } else if (enumx != null) {
      return _toExtType(enumx);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(enumx).toString());
    }
  }
  
  public StringBuilder toColumnFinishing(final SExtDeclaredSQLType enumx) {
    if (enumx instanceof SEnum) {
      return _toColumnFinishing((SEnum)enumx);
    } else if (enumx != null) {
      return _toColumnFinishing(enumx);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(enumx).toString());
    }
  }
}

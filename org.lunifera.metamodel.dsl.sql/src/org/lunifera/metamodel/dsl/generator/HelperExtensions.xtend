package org.lunifera.metamodel.dsl.generator

import org.lunifera.metamodel.dsl.sqlDSL.SColumn
import org.lunifera.metamodel.dsl.sqlDSL.SDBEngine
import org.lunifera.metamodel.dsl.sqlDSL.SDecimal
import org.lunifera.metamodel.dsl.sqlDSL.SEnum
import org.lunifera.metamodel.dsl.sqlDSL.SExtDeclaredSQLType
import org.lunifera.metamodel.dsl.sqlDSL.SIndex
import org.lunifera.metamodel.dsl.sqlDSL.SJoinColumn
import org.lunifera.metamodel.dsl.sqlDSL.SModel
import org.lunifera.metamodel.dsl.sqlDSL.SSettings
import org.lunifera.metamodel.dsl.sqlDSL.SSimpleTypes
import org.lunifera.metamodel.dsl.sqlDSL.SString
import org.lunifera.metamodel.dsl.sqlDSL.STable

class HelperExtensions {
	
	def toDBEngineString(SSettings settings){
		settings.engine.toDBEngineString
	}
	
	def toDBEngineString(STable table){
		if(table.settings != null && table.settings.engine != null){
			return table.settings.engine.toDBEngineString
		} else {
			return (table.eContainer as SModel).settings.toDBEngineString
		}
	}
	
	def toDBEngine(STable table){
		if(table.settings != null && table.settings.engine != null){
			return table.settings.engine
		} else {
			return (table.eContainer as SModel).settings.engine
		}
	}
	
	def toDBEngineString(SDBEngine engine){
		switch(engine){
			case SDBEngine::INNODB:
				return "InnoDB"
			case SDBEngine::MYISAM:
				return "MyISAM"
		}
		return "InnoDB"
	}
	
	def toDBSchemaString(STable table){
		if(table.settings != null && table.settings.schema != null){
			return table.settings.toDBSchemaString
		} else {
			return (table.eContainer as SModel).settings.toDBSchemaString
		}
	}
	
	def toDBSchemaString(SSettings settings){
		if(settings != null && settings.schema != null){
			return settings.schema.toUpperCase
		}
		return ""
	}
	
	def toDBTableString(STable table){
		return table.name.toUpperCase
	}
	
	def dispatch toColumnName(SColumn column)'''
	�column.table.toColumnPrefix�_�column.name.toUpperCase�'''
	
	def dispatch toColumnName(SJoinColumn column)'''
		�column.table.toColumnPrefix�_�column.name.toUpperCase�'''
	
	def dispatch toColumnPrefix(SColumn column)'''
		�column.table.toColumnPrefix�'''
	
	def dispatch toColumnPrefix(SJoinColumn column)'''
		�column.table.toColumnPrefix�'''
		
	def dispatch toNullableModifier(SColumn column)'''
	�IF column.props != null && !column.props.nullable�NOT NULL �ELSE��ENDIF�'''
	
	def dispatch toNullableModifier(SJoinColumn column)'''
	�IF column.props != null && !column.props.nullable�NOT NULL �ELSE��ENDIF�'''
	
	def dispatch isIndexed(SColumn column){
		column.props != null && column.props.index != null && column.props.index != SIndex::NO	
	}
	
	def dispatch isIndexed(SJoinColumn column){
		column.props != null && column.props.index != null && column.props.index != SIndex::NO	
	}
	
	def dispatch toIndexType(SColumn column){
		if(column.props == null || column.props.index == null){
			return ""
		}
		switch(column.props.index){
			case SIndex::SPATIAL:
				return "SPATIAL"
			case SIndex::UNIQUE:
				return "UNIQUE"	
		}
		return ""
	}
	
	def dispatch toIndexType(SJoinColumn column){
		if(column.props == null || column.props.index == null){
			return ""
		}
		switch(column.props.index){
			case SIndex::SPATIAL:
				return "SPATIAL"
			case SIndex::UNIQUE:
				return "UNIQUE"	
		}
		return ""
	}
	
	def dispatch toComment(SColumn column)'''
	�IF column.props != null && column.props.javacolumn != null�COMMENT �column.props.javacolumn��ELSE��ENDIF�'''
	
	def dispatch toComment(SJoinColumn column)'''
	�IF column.props != null && column.props.javacolumn != null�COMMENT �column.props.javacolumn��ELSE��ENDIF�'''
	
	def dispatch toComment(STable table)'''
	/*
		Table: �table.toDBTableString�
		Prefix: �table.toColumnPrefix�
		Entity: �table.entityname�
		Cached: �table.cached�
		�table.toDBEngineString�
	*/'''
		
	def dispatch toAESModifier(SColumn column)'''
	'''
	
	def dispatch toAESModifier(SJoinColumn column)'''
	'''
	
	def dispatch table(SColumn column){
		column.eContainer as STable
	}
	
	def dispatch table(SJoinColumn column){
		column.eContainer as STable
	}
	
	def dispatch toColumnType(SColumn column){
		if(column.extType != null){
			return column.extType.toExtType
		} else if(column.inlinedType != null){
			return column.inlinedType.toColumnType
		} else if(column.simpleType != null){
			return column.simpleType.toColumnType
		}
		return "missing"
	}
	
	def dispatch toExtType(SExtDeclaredSQLType enum){
		return "int"
	}
	
	def dispatch toExtType(SEnum enumx){
	}
	
	def dispatch toColumnFinishing(SColumn column){
		if(column.extType != null){
			return column.extType.toColumnFinishing
		} else if(column.inlinedType != null){
			// not used yet
		} else if(column.simpleType != null){
			// not used yet
		}
		return "";
	}
	
	def dispatch toColumnFinishing(SEnum enumx){
		val StringBuilder builder = new StringBuilder
		for(literal : enumx.literals){
			if(builder.length == 0){
				builder.append("/* ENUM ");
			}else{
				builder.append(", ");
			}
			builder.append(literal.value);
			builder.append("=");
			builder.append(literal.name);
		}
		
		builder.append("*/");
	}
	
	def dispatch toColumnType(SSimpleTypes type){
		switch(type){
			case SSimpleTypes::BLOB:
				return "blob" 
			case SSimpleTypes::BOOLEAN:
				return "boolean" 
			case SSimpleTypes::COORDINATE:
				return "double precision(11,6)" 
			case SSimpleTypes::CURRENCY:
				return "double precision(11,2)" 
			case SSimpleTypes::DATE:
				return "date" 
			case SSimpleTypes::DATETIME:
				return "datetime" 
			case SSimpleTypes::FOTO:
				return "blob" 
			case SSimpleTypes::INT:
				return "int" 
			case SSimpleTypes::MEDIUM_INT:
				return "mediumint" 
			case SSimpleTypes::POINT:
				return "point" 
			case SSimpleTypes::POLYGON:
				return "polygon" 
			case SSimpleTypes::SMALL_INT:
				return "smallint" 
			case SSimpleTypes::TIME:
				return "time" 
			case SSimpleTypes::TINY_INT:
				return "tinyint" 
		}
	}
	
	
	def dispatch toColumnType(SDecimal type)'''
		double precision(11,�type.value�)'''
	
	def dispatch toColumnType(SString type)'''
		varchar(�type.value�)'''
	
	def dispatch toColumnType(SJoinColumn column){
		return "int"
	}
	
	def dispatch toColumnPrefix(STable table){
		if(table != null && table.prefix != null){
			return table.prefix.toUpperCase
		}
		
		return ""
	}
	
	def shouldGenerateForeignKey(STable table){
		table.innoDB && table.containsJoinColumn
	}

	def isInnoDB(STable table){
		table.toDBEngine == SDBEngine::INNODB
	}
	
	def containsJoinColumn(STable table){
		table.columns.exists([it instanceof SJoinColumn]);
	}
}
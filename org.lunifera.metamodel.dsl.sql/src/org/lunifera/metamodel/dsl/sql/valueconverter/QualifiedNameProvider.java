/**
 * Copyright (c) 2011 - 2012, Florian Pirchner - lunifera.org
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * 		Hans Georg Glöckler - Initial implementation
 * 		Florian Pirchner - Initial implementation
 */
package org.lunifera.metamodel.dsl.sql.valueconverter;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.naming.SimpleNameProvider;
import org.lunifera.metamodel.dsl.generator.HelperExtensions;
import org.lunifera.metamodel.dsl.sqlDSL.SEnum;
import org.lunifera.metamodel.dsl.sqlDSL.SModel;
import org.lunifera.metamodel.dsl.sqlDSL.STable;

import com.google.inject.Inject;

public class QualifiedNameProvider extends SimpleNameProvider {

	@Inject
	private IQualifiedNameConverter qualifiedNameConverter;

	@Inject
	HelperExtensions helper;

	@Override
	public QualifiedName getFullyQualifiedName(EObject obj) {
		if (obj == null) {
			return QualifiedName.create("");
		}

		if (obj instanceof STable) {
			STable table = (STable) obj;
			return QualifiedName.create(helper.toDBSchemaString(table),
					helper.toDBTableString(table));
		} else if (obj instanceof SEnum) {
			SEnum enumx = (SEnum) obj;
			SModel model = (SModel) enumx.eContainer();
			if (model != null) {
				return QualifiedName.create(
						helper.toDBSchemaString(model.getSettings()),
						enumx.getName());
			} else {
				if (enumx.getName() != null) {
					return QualifiedName.create(enumx.getName());
				} else {
					return QualifiedName.create("");
				}
			}
		}
		return super.getFullyQualifiedName(obj);
	}
}

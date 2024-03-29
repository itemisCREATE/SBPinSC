/**
 * Copyright (c) 2016 committers of YAKINDU and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of YAKINDU - initial API and implementation
 */
package com.yakindu.sct.scenario.generator.java;

import org.yakindu.sct.generator.core.IExecutionFlowGenerator;
import org.yakindu.sct.generator.core.IGeneratorModule;
import org.yakindu.sct.generator.core.types.ICodegenTypeSystemAccess;
import org.yakindu.sct.model.sexec.naming.INamingService;
import org.yakindu.sct.model.sgen.GeneratorEntry;

import com.google.inject.Binder;
import com.google.inject.Scopes;
import com.yakindu.sct.scenario.generator.java.types.JavaTypeSystemAccess;
import com.yakindu.sct.scenario.generator.java.types.OldJavaTypeSystemAccess;

/**
 * 
 * @author andreas muelder - Initial contribution and API
 * 
 */
public class JavaGeneratorModule implements IGeneratorModule {

	@Override
	public void configure(GeneratorEntry entry, Binder binder) {
		binder.bind(IExecutionFlowGenerator.class).to(JavaGenerator.class);
		final GenmodelEntries entries = new GenmodelEntries();
		if (entries.useJavaInt(entry)) {
			binder.bind(ICodegenTypeSystemAccess.class).to(OldJavaTypeSystemAccess.class);
		} else {
			binder.bind(ICodegenTypeSystemAccess.class).to(JavaTypeSystemAccess.class);
		}
		binder.bind(INamingService.class).to(JavaNamingService.class).in(Scopes.SINGLETON);
	}
}

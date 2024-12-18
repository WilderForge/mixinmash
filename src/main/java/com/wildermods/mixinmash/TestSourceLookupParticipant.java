package com.wildermods.mixinmash;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.ILog;
import org.eclipse.debug.core.sourcelookup.AbstractSourceLookupParticipant;
import org.eclipse.jdt.debug.core.IJavaStackFrame;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

public class TestSourceLookupParticipant extends AbstractSourceLookupParticipant {

	private static final Bundle BUNDLE = FrameworkUtil.getBundle(TestSourceLookupParticipant.class);
	private static final ILog LOG = ILog.get();
	
	@Override
	public String getSourceName(Object object) throws CoreException {
		if(object instanceof IJavaStackFrame) {
			IJavaStackFrame frame = (IJavaStackFrame) object;
			String name = frame.getDeclaringTypeName().replace('.', '/') + ".java";
			LOG.info("Name of type: " + name);
			return name;
		}
		
		System.out.println("[TRACE] Unknown type to lookup: " + object.getClass().getCanonicalName());
		
		return null;
	}

	@Override
	public Object[] findSourceElements(Object object) {
		LOG.info("Looking for source elements for " + object);
		if (object instanceof IJavaStackFrame) {
			String testSource = 
			"""
			/**
			* The test Was successful!
			**/		
			""";
			return new Object[] {new TestSourceStorage(testSource)};
		}
		return new Object[] {};
	}
	
}

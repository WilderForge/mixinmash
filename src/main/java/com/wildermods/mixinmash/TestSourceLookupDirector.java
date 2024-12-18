package com.wildermods.mixinmash;

import org.eclipse.core.runtime.ILog;
import org.eclipse.core.runtime.Platform;
import org.eclipse.debug.core.sourcelookup.AbstractSourceLookupDirector;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

public class TestSourceLookupDirector extends AbstractSourceLookupDirector {

	private static final Bundle BUNDLE = FrameworkUtil.getBundle(TestSourceLookupDirector.class);
	private static final ILog LOG = Platform.getLog(BUNDLE);
	
	@Override
	public void initializeParticipants() {
		LOG.info("Adding Participant!");
		addParticipants(new TestSourceLookupParticipant[] {
			new TestSourceLookupParticipant()	
		});
		throw new Error();
	}

}

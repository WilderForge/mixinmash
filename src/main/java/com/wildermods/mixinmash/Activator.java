package com.wildermods.mixinmash;

import org.eclipse.core.runtime.ILog;
import org.eclipse.core.runtime.Plugin;

import org.osgi.framework.BundleContext;

public class Activator extends Plugin {

	private static final String PLUGIN_ID = "mixinmash";
	private static Activator plugin;
	
	private BundleContext context;
	private ILog LOG;
	
	private static TestSourceLookupDirector testDirector;
	
	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
		
		this.context = context;
		this.LOG = ILog.of(context.getBundle());
		
		LOG.info("Activator started for plugin " + PLUGIN_ID);
		System.out.println("TEST TEST TEST TEST TEST TEST");
		if(testDirector == null) {
			testDirector = new TestSourceLookupDirector();
		}
	}
	
	@Override
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}
	
	public static Activator getDefault() {
		return plugin;
	}
}

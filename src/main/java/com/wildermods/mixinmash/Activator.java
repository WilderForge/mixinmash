package com.wildermods.mixinmash;

import org.eclipse.core.runtime.ILog;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

public class Activator extends AbstractUIPlugin {

	private static final String PLUGIN_ID = "mixinmash";
	private static ILog LOGGER;
	private static Activator plugin;
	
	@Override
	public void start(BundleContext context) throws Exception {
	    plugin = this;
	    LOGGER = ILog.of(Activator.class);
	    LOGGER.info("Activator started for plugin " + PLUGIN_ID);
	    super.start(context);

	    // Add more diagnostics
	    LOGGER.info("Plugin started. Bundle state: " + context.getBundle().getState());
	}
	
	@Override
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}
	
	public static Activator getDefault() {
		return plugin;
	}
	
	public static ILog getLogger() {
		return LOGGER;
	}
}

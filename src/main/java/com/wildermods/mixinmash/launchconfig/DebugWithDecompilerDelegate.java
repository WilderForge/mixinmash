package com.wildermods.mixinmash.launchconfig;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.model.LaunchConfigurationDelegate;

import com.wildermods.mixinmash.Activator;
import com.wildermods.mixinmash.TestSourceLookupDirector;

public class DebugWithDecompilerDelegate extends LaunchConfigurationDelegate {

	@Override
	public void launch(ILaunchConfiguration configuration, String mode, ILaunch launch, IProgressMonitor monitor) throws CoreException {
		TestSourceLookupDirector sourceLocator = new TestSourceLookupDirector();
		
		sourceLocator.initializeDefaults(configuration);
		launch.setSourceLocator(sourceLocator);
		
		Activator.getLogger().info("Launching DebugWithDecompiler in " + mode + " mode...");
	}

}

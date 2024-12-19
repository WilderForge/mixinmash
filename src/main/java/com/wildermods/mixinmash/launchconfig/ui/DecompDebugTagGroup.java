package com.wildermods.mixinmash.launchconfig.ui;

import java.util.ArrayList;
import java.util.Arrays;

import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.ui.AbstractLaunchConfigurationTab;
import org.eclipse.debug.ui.ILaunchConfigurationDialog;
import org.eclipse.debug.ui.ILaunchConfigurationTab;
import org.eclipse.swt.widgets.Composite;

import org.eclipse.jdt.internal.debug.ui.launcher.LocalJavaApplicationTabGroup;

@SuppressWarnings("restriction")
public class DecompDebugTagGroup extends LocalJavaApplicationTabGroup {

	@Override
	public void createTabs(ILaunchConfigurationDialog dialog, String mode) {
		LocalJavaApplicationTabGroup parent = new LocalJavaApplicationTabGroup();
		parent.createTabs(dialog, mode);
		
		ArrayList<ILaunchConfigurationTab> tabs = new ArrayList<>();
		tabs.add(new DecompilerTab());
		tabs.addAll(Arrays.asList(parent.getTabs()));

		setTabs(tabs.toArray(new ILaunchConfigurationTab[0]));
	}

	public static class DecompilerTab extends AbstractLaunchConfigurationTab {

		@Override
		public void createControl(Composite parent) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void setDefaults(ILaunchConfigurationWorkingCopy configuration) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void initializeFrom(ILaunchConfiguration configuration) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void performApply(ILaunchConfigurationWorkingCopy configuration) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public String getName() {
			return "Decompiler";
		}
		
	}
	
}

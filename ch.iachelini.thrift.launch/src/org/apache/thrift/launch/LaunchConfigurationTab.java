package org.apache.thrift.launch;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.ui.ILaunchConfigurationDialog;
import org.eclipse.debug.ui.ILaunchConfigurationTab;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

public class LaunchConfigurationTab implements ILaunchConfigurationTab {

	private Image image;

	@Override
	public void createControl(Composite parent) {
	}

	@Override
	public Control getControl() {
		return null;
	}

	@Override
	public void setDefaults(ILaunchConfigurationWorkingCopy configuration) {

	}

	@Override
	public void initializeFrom(ILaunchConfiguration configuration) {
	}

	@Override
	public void dispose() {
		if (image != null) {
			image.dispose();
		}
	}

	@Override
	public void performApply(ILaunchConfigurationWorkingCopy configuration) {
	}

	@Override
	public String getErrorMessage() {
		return null;
	}

	@Override
	public String getMessage() {
		return null;
	}

	@Override
	public boolean isValid(ILaunchConfiguration launchConfig) {
		return true;
	}

	@Override
	public boolean canSave() {
		return true;
	}

	@Override
	public void setLaunchConfigurationDialog(ILaunchConfigurationDialog dialog) {
	}

	@Override
	public void launched(ILaunch launch) {
	}

	@Override
	public String getName() {
		return "Common";
	}

	@Override
	public Image getImage() {
		if (image == null) {
			image = ImageDescriptor.createFromURL(
					FileLocator.find(Activator.plugin.getBundle(), new Path(
							"icons/favicon.ico"), null)).createImage();
		}
		return image;
	}

	@Override
	public void activated(ILaunchConfigurationWorkingCopy workingCopy) {
	}

	@Override
	public void deactivated(ILaunchConfigurationWorkingCopy workingCopy) {
	}
}
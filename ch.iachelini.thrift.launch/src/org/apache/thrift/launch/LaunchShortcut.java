package org.apache.thrift.launch;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationType;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.debug.ui.DebugUITools;
import org.eclipse.debug.ui.ILaunchShortcut2;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IEditorPart;

public class LaunchShortcut implements ILaunchShortcut2 {

	@Override
	public void launch(ISelection selection, String mode) {
		IFile file = adaptToFile(selection);
		ILaunchConfiguration launchConfiguration = null;
		try {
			launchConfiguration = createLaunchConfiguration(file.getName());
		} catch (CoreException e) {
			e.printStackTrace(System.err);
		}
		DebugUITools.launch(launchConfiguration, mode);
	}

	@Override
	public void launch(IEditorPart editor, String mode) {
		launch(new StructuredSelection(editor.getEditorInput()), mode);
	}

	@Override
	public ILaunchConfiguration[] getLaunchConfigurations(ISelection selection) {
		return new ILaunchConfiguration[0];
	}

	@Override
	public ILaunchConfiguration[] getLaunchConfigurations(IEditorPart editorpart) {
		return new ILaunchConfiguration[0];
	}

	@Override
	public IResource getLaunchableResource(ISelection selection) {
		return adaptToFile(selection);
	}

	@Override
	public IResource getLaunchableResource(IEditorPart editor) {
		return getLaunchableResource(new StructuredSelection(
				editor.getEditorInput()));
	}

	private IFile adaptToFile(ISelection selection) {
		Object element = ((IStructuredSelection) selection).getFirstElement();
		return (IFile) ((IAdaptable) element).getAdapter(IFile.class);
	}

	private ILaunchConfiguration createLaunchConfiguration(String name)
			throws CoreException {
		final ILaunchManager lm = DebugPlugin.getDefault().getLaunchManager();
		final ILaunchConfigurationType type = lm
				.getLaunchConfigurationType("org.apache.thrift.launch.type");
		String launchConfigName = lm.generateLaunchConfigurationName(name);
		final ILaunchConfigurationWorkingCopy wc = type.newInstance(null, launchConfigName);
		return wc.doSave();
	}
}
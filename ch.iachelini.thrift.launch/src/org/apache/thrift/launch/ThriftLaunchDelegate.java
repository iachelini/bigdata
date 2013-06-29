package org.apache.thrift.launch;

import java.io.File;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.model.IProcess;
import org.eclipse.debug.core.model.LaunchConfigurationDelegate;

public class ThriftLaunchDelegate extends LaunchConfigurationDelegate {

	@Override
	public void launch(ILaunchConfiguration configuration, String mode,
			ILaunch launch, IProgressMonitor monitor) throws CoreException {
		Process p = DebugPlugin
				.exec(new String[] { "thrift --gen java dummy.thrift" },
						new File(
								"/Users/gilles/Development/bigdata/runtime-EclipseApplication/thrift.test/src/thrift/test"));
		IProcess process= DebugPlugin.newProcess(launch, p, "Thrifting the file, yo");	
	}
}
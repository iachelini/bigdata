package ch.iachelini.pail;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import ch.iachelini.pail.internal.PailIO;

public class Activator implements BundleActivator {

	private static BundleContext context;

	public Activator() {
	}

	static BundleContext getContext() {
		return context;
	}

	public void start(BundleContext bundleContext) throws Exception {
		Activator.context = bundleContext;

		PailIO pailO = new PailIO();
		pailO.writeLogins();
		pailO.readLogins();
	}

	public void stop(BundleContext bundleContext) throws Exception {
		Activator.context = null;
	}
}
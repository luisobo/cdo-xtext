/*
 * generated by Xtext
 */
package net.winklerweb.cdoxtext.example.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import net.winklerweb.cdoxtext.example.ui.internal.GraphixActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class GraphixExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return GraphixActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return GraphixActivator.getInstance().getInjector(GraphixActivator.NET_WINKLERWEB_CDOXTEXT_EXAMPLE_GRAPHIX);
	}
	
}

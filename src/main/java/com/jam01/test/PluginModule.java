package com.jam01.test;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

import javax.inject.Named;

@Named
public class PluginModule extends AbstractModule {

    @Override
    public void configure() {
        System.out.println("PluginModule configured");
        bind(AbstractPrinter.class).annotatedWith(Names.named("best-one")).to(SystemPrinter.class);
    }
}

package com.jam01.test;


import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.ResolutionScope;

import javax.inject.Inject;
import javax.inject.Named;

@Mojo(name = "print", requiresProject = false, requiresDependencyResolution = ResolutionScope.COMPILE_PLUS_RUNTIME)
public class PrintMojo extends AbstractMojo {
    private final AbstractPrinter component;

    @Inject
    public PrintMojo(@Named("best-one") AbstractPrinter component) {
        this.component = component;
    }

    public void execute() throws MojoExecutionException {
        component.print();
    }
}

package org.vaadin.guice.tutorial.di;

import com.vaadin.guice.security.SecurityModule;

import org.vaadin.guice.tutorial.security.MyPermissionEvaluator;

public class TutorialSecurityModule extends SecurityModule {
    public TutorialSecurityModule() {
        super(MyPermissionEvaluator.class);
    }
}

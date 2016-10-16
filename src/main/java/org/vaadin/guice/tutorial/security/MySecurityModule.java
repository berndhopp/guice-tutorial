package org.vaadin.guice.tutorial.security;

import com.vaadin.guice.security.SecurityModule;

public class MySecurityModule extends SecurityModule {
    public MySecurityModule() {
        super(MyPermissionEvaluator.class);
    }
}

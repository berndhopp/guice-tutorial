package org.vaadin.guice.tutorial;

import com.vaadin.guice.security.SecurityModule;

public class MySecurityModule extends SecurityModule {
    public MySecurityModule(){
        super(MyPermissionEvaluator.class);
    }
}

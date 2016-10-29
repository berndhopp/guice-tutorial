package org.vaadin.guice.tutorial.security;

import com.vaadin.guice.annotation.UIScope;
import com.vaadin.server.VaadinSession;

import org.vaadin.security.api.PermissionEvaluator;

@UIScope
public class MyPermissionEvaluator implements PermissionEvaluator {
    @Override
    public boolean hasPermission(String permission) {

        //don't try this in production mode, but for the sake of simplicity..
        switch (permission) {
            case "admin":
                return VaadinSession.getCurrent().getAttribute(CurrentUserRole.class) == CurrentUserRole.ADMIN;
            default:
                return true;
        }
    }
}

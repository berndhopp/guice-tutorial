package org.vaadin.guice.tutorial.components;

import com.google.inject.Inject;

import com.vaadin.data.Property;
import com.vaadin.guice.annotation.UIScope;
import com.vaadin.guice.security.PermissionEnforcer;
import com.vaadin.server.VaadinSession;
import com.vaadin.ui.NativeSelect;

import org.vaadin.guice.tutorial.security.CurrentUserRole;

@UIScope
public class UserSelector extends NativeSelect implements Property.ValueChangeListener{

    @Inject
    private PermissionEnforcer permissionEnforcer;

    UserSelector(){
        addItems(CurrentUserRole.USER, CurrentUserRole.ADMIN);
        VaadinSession.getCurrent().setAttribute(CurrentUserRole.class, CurrentUserRole.USER);
        setValue(CurrentUserRole.USER);
        addValueChangeListener(this);
    }

    @Override
    public void valueChange(Property.ValueChangeEvent event) {
        final CurrentUserRole currentUserRole = (CurrentUserRole) getValue();

        VaadinSession.getCurrent().setAttribute(CurrentUserRole.class, currentUserRole);

        permissionEnforcer.enforce();
    }
}

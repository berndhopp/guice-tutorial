package org.vaadin.guice.tutorial.components;

import com.google.inject.Inject;

import com.vaadin.data.Property;
import com.vaadin.guice.annotation.UIScope;
import com.vaadin.server.VaadinSession;
import com.vaadin.ui.NativeSelect;

import org.vaadin.guice.tutorial.security.CurrentUserRole;
import org.vaadin.security.api.PermissionEnforcer;

@UIScope
class UserSelector extends NativeSelect implements Property.ValueChangeListener {

    private final PermissionEnforcer permissionEnforcer;

    @Inject
    UserSelector(PermissionEnforcer permissionEnforcer) {
        this.permissionEnforcer = permissionEnforcer;
        addItems(CurrentUserRole.USER, CurrentUserRole.ADMIN);
        VaadinSession.getCurrent().setAttribute(CurrentUserRole.class, CurrentUserRole.USER);
        addValueChangeListener(this);
        setNullSelectionAllowed(false);
        setValue(CurrentUserRole.USER);
    }

    @Override
    public void valueChange(Property.ValueChangeEvent event) {
        final CurrentUserRole currentUserRole = (CurrentUserRole) getValue();

        VaadinSession.getCurrent().setAttribute(CurrentUserRole.class, currentUserRole);

        permissionEnforcer.enforce();
    }
}

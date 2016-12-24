package org.vaadin.guice.tutorial.views;

import com.google.inject.Inject;

import com.vaadin.guice.annotation.GuiceView;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.server.VaadinSession;
import com.vaadin.ui.VerticalLayout;

import org.vaadin.guice.tutorial.components.AdminViewLabel;
import org.vaadin.guice.tutorial.security.CurrentUserRole;
import org.vaadin.security.api.SecureView;

@GuiceView(AdminView.VIEW_NAME)
public class AdminView extends VerticalLayout implements SecureView {
    public static final String VIEW_NAME = "adminView";

    @Inject
    AdminView(AdminViewLabel adminViewLabel){
       addComponent(adminViewLabel);
    }

    public void enter(ViewChangeEvent event) {
        // This view is constructed in the init() method()
    }

    @Override
    public boolean canAccess(String parameters) {
        return VaadinSession.getCurrent().getAttribute(CurrentUserRole.class).equals(CurrentUserRole.ADMIN);
    }
}
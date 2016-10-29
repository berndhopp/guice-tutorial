package org.vaadin.guice.tutorial.views;

import com.google.inject.Inject;

import com.vaadin.guice.annotation.GuiceView;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.server.VaadinSession;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

import org.vaadin.guice.tutorial.security.CurrentUserRole;
import org.vaadin.guice.tutorial.services.Greeter;
import org.vaadin.guice.tutorial.services.ViewGreeter;
import org.vaadin.security.api.SecureView;

@GuiceView(AnotherViewScopedView.VIEW_NAME)
public class AnotherViewScopedView extends VerticalLayout implements SecureView {
    public static final String VIEW_NAME = "anotherView";

    @Inject
    AnotherViewScopedView(Greeter uiGreeter, ViewGreeter viewGreeter) {
        setMargin(true);
        setSpacing(true);
        addComponent(new Label("This is another view scoped view"));
        addComponent(new Label(uiGreeter.sayHello()));
        addComponent(new Label(viewGreeter.sayHello()));
    }

    public void enter(ViewChangeEvent event) {
        // This view is constructed in the init() method()
    }

    @Override
    public boolean canAccess(String parameters) {
        return VaadinSession.getCurrent().getAttribute(CurrentUserRole.class).equals(CurrentUserRole.ADMIN);
    }
}
package org.vaadin.guice.tutorial.views;

import com.google.inject.Inject;

import com.vaadin.guice.annotation.GuiceView;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

import org.vaadin.guice.tutorial.components.AnotherViewScopedViewLabel;
import org.vaadin.guice.tutorial.services.Greeter;
import org.vaadin.guice.tutorial.services.ViewGreeter;

@GuiceView(AnotherViewScopedView.VIEW_NAME)
public class AnotherViewScopedView extends VerticalLayout implements View {
    public static final String VIEW_NAME = "anotherView";

    @Inject
    AnotherViewScopedView(AnotherViewScopedViewLabel anotherViewScopedViewLabel, Greeter uiGreeter, ViewGreeter viewGreeter) {
        setMargin(true);
        setSpacing(true);
        addComponent(anotherViewScopedViewLabel);
        addComponent(new Label(uiGreeter.sayHello()));
        addComponent(new Label(viewGreeter.sayHello()));
    }

    public void enter(ViewChangeEvent event) {
        // This view is constructed in the init() method()
    }
}
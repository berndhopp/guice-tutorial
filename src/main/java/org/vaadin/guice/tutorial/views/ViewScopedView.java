package org.vaadin.guice.tutorial.views;

import com.google.inject.Inject;

import com.vaadin.guice.annotation.GuiceView;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

import org.vaadin.guice.tutorial.services.Greeter;
import org.vaadin.guice.tutorial.services.ViewGreeter;
import org.vaadin.guice.tutorial.components.ViewScopedViewLabel;

@GuiceView(ViewScopedView.VIEW_NAME)
public class ViewScopedView extends VerticalLayout implements View {
    public static final String VIEW_NAME = "view";

    @Inject
    ViewScopedView(Greeter uiGreeter, ViewGreeter viewGreeter, ViewScopedViewLabel viewScopedViewLabel) {
        setMargin(true);
        setSpacing(true);
        addComponent(viewScopedViewLabel);
        addComponent(new Label(uiGreeter.sayHello()));
        addComponent(new Label(viewGreeter.sayHello()));
    }

    public void enter(ViewChangeEvent event) {
    }
}
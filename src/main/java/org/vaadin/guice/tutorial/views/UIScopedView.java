package org.vaadin.guice.tutorial.views;

import com.google.inject.Inject;

import com.vaadin.guice.annotation.GuiceView;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

import org.vaadin.guice.tutorial.components.UIScopedViewLabel;
import org.vaadin.guice.tutorial.services.Greeter;

@GuiceView(UIScopedView.VIEW_NAME)
public class UIScopedView extends VerticalLayout implements View {
    public static final String VIEW_NAME = "ui";

    @Inject
    UIScopedView(UIScopedViewLabel uiScopedViewLabel, Greeter uiGreeter) {
        setMargin(true);
        setSpacing(true);
        addComponent(uiScopedViewLabel);
        addComponent(new Label(uiGreeter.sayHello()));
    }

    public void enter(ViewChangeEvent event) {
    }
}
package org.vaadin.guice.tutorial;

import com.google.inject.Inject;

import com.vaadin.guice.annotation.GuiceView;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

@GuiceView(name = DefaultView.VIEW_NAME)
public class DefaultView extends VerticalLayout implements View {
    public static final String VIEW_NAME = "";

    @Inject
    DefaultView(DefaultViewLabel defaultViewLabel) {
        addComponent(defaultViewLabel);
    }

    public void enter(ViewChangeEvent event) {
        // This view is constructed in the init() method()
    }
}

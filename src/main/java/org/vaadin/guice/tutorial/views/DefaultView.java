package org.vaadin.guice.tutorial.views;

import com.google.inject.Inject;

import com.vaadin.guice.annotation.GuiceView;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.VerticalLayout;

import org.vaadin.guice.tutorial.components.DefaultViewLabel;

@GuiceView
public class DefaultView extends VerticalLayout implements View {

    @Inject
    DefaultView(DefaultViewLabel defaultViewLabel) {
        addComponent(defaultViewLabel);
    }

    public void enter(ViewChangeEvent event) {
        // This view is constructed in the init() method()
    }
}

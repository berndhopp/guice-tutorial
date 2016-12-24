package org.vaadin.guice.tutorial.views;

import com.google.inject.Inject;

import com.vaadin.guice.annotation.GuiceView;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.ui.VerticalLayout;

import org.vaadin.guice.tutorial.components.ErrorViewLabel;

@GuiceView("error")
public class ErrorView extends VerticalLayout implements View {

    @Inject
    ErrorView(ErrorViewLabel errorViewLabel){
        addComponent(errorViewLabel);
    }

    @Override
    public void enter(ViewChangeListener.ViewChangeEvent event) {
    }
}

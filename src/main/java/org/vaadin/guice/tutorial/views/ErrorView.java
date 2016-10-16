package org.vaadin.guice.tutorial.views;

import com.vaadin.guice.annotation.Caption;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.ui.Label;

@Caption("error")
public class ErrorView extends Label implements View {

    @Override
    public void enter(ViewChangeListener.ViewChangeEvent event) {
    }
}

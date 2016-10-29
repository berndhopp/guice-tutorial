package org.vaadin.guice.tutorial.views;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.ui.Label;

import org.vaadin.i18n.annotation.Caption;

@Caption("error")
public class ErrorView extends Label implements View {

    @Override
    public void enter(ViewChangeListener.ViewChangeEvent event) {
    }
}

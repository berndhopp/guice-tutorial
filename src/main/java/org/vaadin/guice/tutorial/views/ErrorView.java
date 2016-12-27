package org.vaadin.guice.tutorial.views;

import com.google.inject.Inject;

import com.vaadin.guice.annotation.GuiceView;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.ui.VerticalLayout;

import org.vaadin.guice.tutorial.components.ErrorViewLabel;
import org.vaadin.i18n.annotation.Caption;
import org.vaadin.i18n.api.TranslationBinder;

@GuiceView("error")
@Caption("txt.not_found")
public class ErrorView extends VerticalLayout implements View{

    private final ErrorViewLabel errorViewLabel;
    private final TranslationBinder translationBinder;

    @Inject
    ErrorView(ErrorViewLabel errorViewLabel, TranslationBinder translationBinder){
        this.errorViewLabel = errorViewLabel;
        this.translationBinder = translationBinder;
        addComponent(errorViewLabel);
    }

    @Override
    public void enter(ViewChangeListener.ViewChangeEvent event) {
        translationBinder.bind(errorViewLabel);
    }
}

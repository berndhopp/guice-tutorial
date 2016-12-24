package org.vaadin.guice.tutorial.di;

import com.vaadin.guice.i18n.TranslationModule;

import org.vaadin.guice.tutorial.i18n.MyTranslator;

public class TutorialTranslationModule extends TranslationModule {

    public TutorialTranslationModule() {
        super(MyTranslator.class);
    }
}

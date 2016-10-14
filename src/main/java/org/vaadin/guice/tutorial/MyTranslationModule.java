package org.vaadin.guice.tutorial;

import com.vaadin.guice.i18n.TranslationModule;
import com.vaadin.guice.i18n.Translator;

public class MyTranslationModule extends TranslationModule {
    @Override
    protected Class<? extends Translator> getTranslatorClass() {
        return MyTranslator.class;
    }
}

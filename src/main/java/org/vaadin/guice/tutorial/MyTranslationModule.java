package org.vaadin.guice.tutorial;

import com.vaadin.guice.i18n.TranslationModule;

public class MyTranslationModule extends TranslationModule {

    public MyTranslationModule() {
        super(MyTranslator.class);
    }
}

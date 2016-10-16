package org.vaadin.guice.tutorial.components;

import com.google.common.collect.ImmutableList;
import com.google.inject.Inject;
import com.google.inject.Provider;

import com.vaadin.data.Property;
import com.vaadin.guice.annotation.UIScope;
import com.vaadin.guice.i18n.TranslationBinder;
import com.vaadin.server.VaadinSession;
import com.vaadin.ui.NativeSelect;

import java.util.Locale;

@UIScope
public class LanguageSelector extends NativeSelect {

    private final Provider<TranslationBinder> translationBinder;

    @Inject
    LanguageSelector(Provider<TranslationBinder> translationBinder){
        super(null, ImmutableList.of("german", "english"));
        this.translationBinder = translationBinder;
        setNullSelectionAllowed(false);
        addValueChangeListener(this);
        setValue("english");
    }

    @Override
    public void valueChange(Property.ValueChangeEvent event) {

        switch ((String)getValue()){
            case "german":
                VaadinSession.getCurrent().setLocale(Locale.GERMAN);
                break;
            case "english":
                VaadinSession.getCurrent().setLocale(Locale.ENGLISH);
                break;
        }

        translationBinder.get().bind();
    }
}

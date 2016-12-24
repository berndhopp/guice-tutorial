package org.vaadin.guice.tutorial.components;

import com.google.common.collect.ImmutableList;
import com.google.inject.Inject;
import com.google.inject.Provider;

import com.vaadin.data.Property;
import com.vaadin.guice.annotation.UIScope;
import com.vaadin.server.VaadinSession;
import com.vaadin.ui.NativeSelect;

import org.vaadin.i18n.api.TranslationBinder;

import java.util.Locale;

@UIScope
public class LanguageSelector extends NativeSelect {

    private final Provider<TranslationBinder> translationBinder;

    @Inject
    LanguageSelector(Provider<TranslationBinder> translationBinder) {
        super(null, ImmutableList.of(Locale.GERMAN, Locale.ENGLISH));
        this.translationBinder = translationBinder;
        setNullSelectionAllowed(false);
        addValueChangeListener(this);
        setValue(Locale.ENGLISH);
    }

    @Override
    public void valueChange(Property.ValueChangeEvent event) {

        VaadinSession.getCurrent().setLocale((Locale) event.getProperty().getValue());

        translationBinder.get().bind();
    }
}

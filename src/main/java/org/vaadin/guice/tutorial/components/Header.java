package org.vaadin.guice.tutorial.components;

import com.google.inject.Inject;

import com.vaadin.guice.annotation.UIScope;
import com.vaadin.ui.HorizontalLayout;

import org.vaadin.guice.tutorial.components.nav.NavigationBar;

@UIScope
class Header extends HorizontalLayout {

    @Inject
    Header(NavigationBar navigationBar, LanguageSelector languageSelector, UserSelector userSelector) {
        addComponents(navigationBar, languageSelector, userSelector);
        setExpandRatio(navigationBar, 1);
        setWidth("100%");
        setSpacing(true);
    }
}

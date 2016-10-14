package org.vaadin.guice.tutorial;

import com.google.inject.Inject;

import com.vaadin.guice.annotation.UIScope;
import com.vaadin.ui.Button;
import com.vaadin.ui.CssLayout;
import com.vaadin.ui.themes.ValoTheme;

@UIScope
public class NavigationBar extends CssLayout{

    @Inject
    NavigationBar(UIScopedViewButton uiScopedViewButton, ViewScopedViewButton viewScopedViewButton, AnotherViewScopedViewButton anotherViewScopedViewButton){
        addComponents(uiScopedViewButton, viewScopedViewButton, anotherViewScopedViewButton);
    }
}

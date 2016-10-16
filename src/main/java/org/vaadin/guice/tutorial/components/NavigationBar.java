package org.vaadin.guice.tutorial.components;

import com.google.inject.Inject;

import com.vaadin.guice.annotation.UIScope;
import com.vaadin.ui.CssLayout;

@UIScope
public class NavigationBar extends CssLayout{

    @Inject
    NavigationBar(UIScopedViewButton uiScopedViewButton, ViewScopedViewButton viewScopedViewButton, AnotherViewScopedViewButton anotherViewScopedViewButton){
        addComponents(uiScopedViewButton, viewScopedViewButton, anotherViewScopedViewButton);
    }
}

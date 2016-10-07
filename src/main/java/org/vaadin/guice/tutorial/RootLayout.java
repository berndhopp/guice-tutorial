package org.vaadin.guice.tutorial;

import com.google.inject.Inject;

import com.vaadin.guice.annotation.UIScope;
import com.vaadin.ui.VerticalLayout;

@UIScope
public class RootLayout extends VerticalLayout {

    @Inject
    RootLayout(NavigationBar navigationBar, ViewContainer viewContainer){
        setSizeFull();
        setMargin(true);
        setSpacing(true);
        addComponents(navigationBar, viewContainer);
        setExpandRatio(viewContainer, 1);
    }
}

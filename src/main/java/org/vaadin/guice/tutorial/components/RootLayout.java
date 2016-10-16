package org.vaadin.guice.tutorial.components;

import com.google.inject.Inject;

import com.vaadin.guice.annotation.UIScope;
import com.vaadin.ui.VerticalLayout;

@UIScope
public class RootLayout extends VerticalLayout {

    @Inject
    RootLayout(Header header, ViewContainer viewContainer) {
        setSizeFull();
        setMargin(true);
        setSpacing(true);
        addComponents(header, viewContainer);
        setExpandRatio(viewContainer, 1);
    }
}

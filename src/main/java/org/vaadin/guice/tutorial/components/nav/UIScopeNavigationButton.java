package org.vaadin.guice.tutorial.components.nav;

import org.vaadin.guice.tutorial.views.UIScopedView;

public class UIScopeNavigationButton extends NavigationButton {
    UIScopeNavigationButton() {
        super(UIScopedView.VIEW_NAME);
    }
}

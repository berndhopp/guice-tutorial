package org.vaadin.guice.tutorial.components.nav;

import org.vaadin.guice.tutorial.views.AnotherViewScopedView;

public class AnotherViewScopeNavigationButton extends NavigationButton {
    AnotherViewScopeNavigationButton() {
        super(AnotherViewScopedView.VIEW_NAME);
    }
}

package org.vaadin.guice.tutorial.components.nav;

import org.vaadin.guice.tutorial.views.ViewScopedView;

public class ViewScopeNavigationButton extends NavigationButton {
    ViewScopeNavigationButton() {
        super(ViewScopedView.VIEW_NAME);
    }
}

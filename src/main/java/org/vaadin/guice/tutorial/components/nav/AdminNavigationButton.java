package org.vaadin.guice.tutorial.components.nav;

import com.vaadin.guice.annotation.UIScope;

import org.vaadin.guice.tutorial.views.AdminView;
import org.vaadin.security.annotation.Restricted;

@UIScope
@Restricted("admin")
class AdminNavigationButton extends NavigationButton {
    AdminNavigationButton() {
        super(AdminView.VIEW_NAME);
    }
}

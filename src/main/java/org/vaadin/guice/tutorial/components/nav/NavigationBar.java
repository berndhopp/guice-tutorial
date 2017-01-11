package org.vaadin.guice.tutorial.components.nav;

import com.google.inject.Inject;

import com.vaadin.guice.annotation.UIScope;
import com.vaadin.ui.HorizontalLayout;
import org.vaadin.guice.tutorial.components.CurrentUserLabel;

@UIScope
public class NavigationBar extends HorizontalLayout {

    @Inject
    NavigationBar(
        DefaultNavigationButton defaultNavigationButton,
        UIScopeNavigationButton uiScopeNavigationButton,
        ViewScopeNavigationButton viewScopeNavigationButton,
        AnotherViewScopeNavigationButton anotherViewScopeNavigationButton,
        AdminNavigationButton adminNavigationButton,
        UnknownViewButton unknownViewButton,
        CurrentUserLabel currentUserLabel
        ) {
        addComponents(
                defaultNavigationButton,
                uiScopeNavigationButton,
                viewScopeNavigationButton,
                anotherViewScopeNavigationButton,
                adminNavigationButton,
                unknownViewButton,
                currentUserLabel
        );

        setSpacing(true);
    }
}

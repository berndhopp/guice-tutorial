package org.vaadin.guice.tutorial.components.nav;

import com.google.inject.Inject;

import com.vaadin.guice.annotation.UIScope;
import com.vaadin.ui.HorizontalLayout;

@UIScope
public class NavigationBar extends HorizontalLayout {

    @Inject
    NavigationBar(
        DefaultNavigationButton defaultNavigationButton,
        UIScopeNavigationButton uiScopeNavigationButton,
        ViewScopeNavigationButton viewScopeNavigationButton,
        AnotherViewScopeNavigationButton anotherViewScopeNavigationButton,
        AdminNavigationButton adminNavigationButton,
        UnknownViewButton unknownViewButton
    ) {
        addComponents(
                defaultNavigationButton,
                uiScopeNavigationButton,
                viewScopeNavigationButton,
                anotherViewScopeNavigationButton,
                adminNavigationButton,
                unknownViewButton
        );

        setSpacing(true);
    }
}

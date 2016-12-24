package org.vaadin.guice.tutorial.components.nav;

import com.google.common.collect.ImmutableList;

import com.vaadin.guice.annotation.UIScope;
import com.vaadin.ui.Button;

import org.vaadin.i18n.annotation.Caption;
import org.vaadin.i18n.api.ParametrizedTranslatedComponent;

import java.util.Collection;

import static com.vaadin.ui.themes.ValoTheme.BUTTON_SMALL;

@UIScope
@Caption("txt.navigation_button")
abstract class NavigationButton extends Button implements ParametrizedTranslatedComponent, Button.ClickListener{

    private final String viewName;

    NavigationButton(String viewName){
        this.viewName = viewName;
        addStyleName(BUTTON_SMALL);
        addClickListener(this);
    }

    @Override
    public Collection<Object> parameters() {
        return ImmutableList.of(viewName);
    }

    @Override
    public void buttonClick(ClickEvent event) {
        getUI().getNavigator().navigateTo(viewName);
    }
}

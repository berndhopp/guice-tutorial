package org.vaadin.guice.tutorial.components.nav;

import com.vaadin.guice.annotation.UIScope;
import com.vaadin.ui.Button;

import org.vaadin.i18n.annotation.Caption;
import org.vaadin.i18n.api.ParametrizedTranslatedComponent;

import static com.vaadin.ui.themes.ValoTheme.BUTTON_SMALL;

@UIScope
@Caption("txt.navigation_button")
abstract class NavigationButton extends Button implements ParametrizedTranslatedComponent, Button.ClickListener{

    private final String viewName;
    private final Object[] parameters;

    NavigationButton(String viewName){
        this.viewName = viewName;
        this.parameters = new Object[]{viewName};
        addStyleName(BUTTON_SMALL);
        addClickListener(this);
    }

    @Override
    public Object[] parameters() {
        return parameters;
    }

    @Override
    public void buttonClick(ClickEvent event) {
        getUI().getNavigator().navigateTo(viewName);
    }
}

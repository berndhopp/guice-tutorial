package org.vaadin.guice.tutorial.components;

import com.vaadin.guice.annotation.UIScope;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;

import org.vaadin.i18n.annotation.Caption;
import org.vaadin.i18n.api.ParametrizedTranslatedComponent;

@UIScope
@Caption("txt.not_found")
public class ErrorViewLabel extends Label implements ParametrizedTranslatedComponent{

    @Override
    public Object[] parameters() {
        return new Object[]{UI.getCurrent().getNavigator().getState()};
    }
}

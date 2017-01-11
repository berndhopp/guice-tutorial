package org.vaadin.guice.tutorial.components;

import com.vaadin.guice.annotation.UIScope;
import com.vaadin.server.VaadinSession;
import com.vaadin.ui.Label;
import org.vaadin.guice.tutorial.security.CurrentUserRole;
import org.vaadin.i18n.annotation.Caption;
import org.vaadin.i18n.api.HasParameters;

import java.util.Objects;

import static com.vaadin.ui.themes.ValoTheme.BUTTON_SMALL;

@UIScope
@Caption("txt.current_user")
public class CurrentUserLabel extends Label implements HasParameters{

    CurrentUserLabel(){
        addStyleName(BUTTON_SMALL);
    }

    @Override
    public Object[] getParameters() {
        return new Object[]{
                Objects.toString(VaadinSession.getCurrent().getAttribute(CurrentUserRole.class))
        };
    }
}

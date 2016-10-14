package org.vaadin.guice.tutorial;

import com.vaadin.guice.annotation.Caption;
import com.vaadin.guice.annotation.UIScope;
import com.vaadin.ui.Button;
import com.vaadin.ui.themes.ValoTheme;

@UIScope
@Caption("another_view_scoped_view_button_text")
public class AnotherViewScopedViewButton extends Button implements Button.ClickListener{

    AnotherViewScopedViewButton(){
        addStyleName(ValoTheme.BUTTON_SMALL);
        addClickListener(this);
    }

    @Override
    public void buttonClick(ClickEvent event) {
        getUI().getNavigator().navigateTo(AnotherViewScopedView.VIEW_NAME);
    }
}

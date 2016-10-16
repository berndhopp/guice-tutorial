package org.vaadin.guice.tutorial.components;

import com.vaadin.guice.annotation.Caption;
import com.vaadin.guice.annotation.UIScope;
import com.vaadin.ui.Button;
import com.vaadin.ui.themes.ValoTheme;

import org.vaadin.guice.tutorial.views.UIScopedView;

@UIScope
@Caption("ui_scoped_view_button_text")
public class UIScopedViewButton extends Button implements Button.ClickListener {

    UIScopedViewButton() {
        addStyleName(ValoTheme.BUTTON_SMALL);
        addClickListener(this);
    }

    @Override
    public void buttonClick(ClickEvent event) {
        getUI().getNavigator().navigateTo(UIScopedView.VIEW_NAME);
    }
}

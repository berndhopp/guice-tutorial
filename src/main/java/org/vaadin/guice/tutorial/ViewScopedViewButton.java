package org.vaadin.guice.tutorial;

import com.vaadin.guice.annotation.UIScope;
import com.vaadin.guice.i18n.Caption;
import com.vaadin.ui.Button;
import com.vaadin.ui.themes.ValoTheme;

@UIScope
@Caption("view_scoped_view_button_text")
public class ViewScopedViewButton extends Button implements Button.ClickListener{

    ViewScopedViewButton(){
        addStyleName(ValoTheme.BUTTON_SMALL);
        addClickListener(this);
    }

    @Override
    public void buttonClick(ClickEvent event) {
        getUI().getNavigator().navigateTo(ViewScopedView.VIEW_NAME);
    }
}

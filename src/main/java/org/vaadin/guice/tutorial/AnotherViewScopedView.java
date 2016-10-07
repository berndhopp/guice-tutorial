package org.vaadin.guice.tutorial;

import com.google.inject.Inject;

import com.vaadin.guice.annotation.GuiceView;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

@GuiceView(name = AnotherViewScopedView.VIEW_NAME)
public class AnotherViewScopedView extends VerticalLayout implements View {
    public static final String VIEW_NAME = "anotherView";

    @Inject
    AnotherViewScopedView(Greeter uiGreeter, ViewGreeter viewGreeter) {
        setMargin(true);
        setSpacing(true);
        addComponent(new Label("This is another view scoped view"));
        addComponent(new Label(uiGreeter.sayHello()));
        addComponent(new Label(viewGreeter.sayHello()));
    }

    public void enter(ViewChangeEvent event) {
        // This view is constructed in the init() method()
    }
}
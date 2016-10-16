package org.vaadin.guice.tutorial.services;

import com.vaadin.guice.annotation.ViewScope;

@ViewScope
public class ViewGreeter {
    public String sayHello() {
        return "Hello from a view scoped bean " + toString();
    }
}

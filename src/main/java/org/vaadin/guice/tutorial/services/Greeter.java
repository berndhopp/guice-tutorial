package org.vaadin.guice.tutorial.services;

import com.vaadin.guice.annotation.UIScope;

@UIScope
public class Greeter {
    public String sayHello() {
        return "Hello from bean " + toString();
    }
}
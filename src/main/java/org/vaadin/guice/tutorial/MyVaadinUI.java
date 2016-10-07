package org.vaadin.guice.tutorial;

import com.google.inject.Inject;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.guice.annotation.Configuration;
import com.vaadin.guice.annotation.GuiceUI;
import com.vaadin.guice.server.GuiceVaadinServlet;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.UI;

import javax.servlet.annotation.WebServlet;

@Theme("valo")
@GuiceUI(viewContainer = ViewContainer.class)
public class MyVaadinUI extends UI {

    @Inject
    private RootLayout root;

    @Override
    protected void init(VaadinRequest request) {
        setContent(root);
    }

    @WebServlet(urlPatterns = "/*", name = "MyVaadinServlet", asyncSupported = true)
    @VaadinServletConfiguration(ui = MyVaadinUI.class, productionMode = false)
    @Configuration(basePackages = "org.vaadin.guice.tutorial")
    public static class MyVaadinServlet extends GuiceVaadinServlet{
    }
}
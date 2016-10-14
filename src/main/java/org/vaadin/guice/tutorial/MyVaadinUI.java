package org.vaadin.guice.tutorial;

import com.google.inject.Inject;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.guice.annotation.Configuration;
import com.vaadin.guice.annotation.GuiceUI;
import com.vaadin.guice.i18n.TranslationBinder;
import com.vaadin.guice.security.PermissionEnforcer;
import com.vaadin.guice.server.GuiceVaadinServlet;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinSession;
import com.vaadin.ui.UI;

import javax.servlet.annotation.WebServlet;

@Theme("valo")
@GuiceUI(viewContainer = ViewContainer.class)
public class MyVaadinUI extends UI {

    @Inject
    private RootLayout root;

    @Inject
    private TranslationBinder translationBinder;

    @Inject
    private PermissionEnforcer permissionEnforcer;

    @Override
    protected void init(VaadinRequest request) {
        setContent(root);
        translationBinder.bind();

        VaadinSession.getCurrent().setAttribute(CurrentUserRole.class, CurrentUserRole.USER);

        permissionEnforcer.enforce();
    }

    @WebServlet(urlPatterns = "/*", name = "MyVaadinServlet", asyncSupported = true)
    @VaadinServletConfiguration(ui = MyVaadinUI.class, productionMode = false)
    @Configuration(modules = {MyTranslationModule.class, MySecurityModule.class}, basePackages = "org.vaadin.guice.tutorial")
    public static class MyVaadinServlet extends GuiceVaadinServlet{
    }
}
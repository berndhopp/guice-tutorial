package org.vaadin.guice.tutorial.i18n;

import com.vaadin.guice.annotation.UIScope;

import org.vaadin.i18n.impl.ResourceTranslator;

@UIScope
public class MyTranslator extends ResourceTranslator {
    public MyTranslator() {
        super("translations");
    }
}

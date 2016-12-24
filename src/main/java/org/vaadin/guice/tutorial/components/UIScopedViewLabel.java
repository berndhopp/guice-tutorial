package org.vaadin.guice.tutorial.components;

import com.vaadin.guice.annotation.UIScope;
import com.vaadin.ui.Label;

import org.vaadin.i18n.annotation.Caption;

@UIScope
@Caption("txt.ui_scoped_view")
public class UIScopedViewLabel extends Label {
}

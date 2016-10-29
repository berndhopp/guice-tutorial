package org.vaadin.guice.tutorial.components;

import com.vaadin.guice.annotation.UIScope;
import com.vaadin.ui.Label;

import org.vaadin.i18n.annotation.Caption;

@UIScope
@Caption("view_scoped_view_label")
public class ViewScopedViewLabel extends Label {
}

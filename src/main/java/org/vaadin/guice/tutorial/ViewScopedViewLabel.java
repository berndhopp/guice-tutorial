package org.vaadin.guice.tutorial;

import com.vaadin.guice.annotation.UIScope;
import com.vaadin.guice.i18n.Caption;
import com.vaadin.ui.Label;

@UIScope
@Caption("view_scoped_view_label")
public class ViewScopedViewLabel extends Label{
}

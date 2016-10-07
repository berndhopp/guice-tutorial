package org.vaadin.guice.tutorial;

import com.vaadin.guice.annotation.UIScope;
import com.vaadin.ui.Panel;

@UIScope
public class ViewContainer extends Panel {
    ViewContainer(){
        setSizeFull();
    }
}

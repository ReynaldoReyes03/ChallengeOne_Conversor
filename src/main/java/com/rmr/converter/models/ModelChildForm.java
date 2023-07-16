package com.rmr.converter.models;

import java.awt.Component;

/**
 *
 * @author Reynaldo Martínez Reyes
 */
public class ModelChildForm {
    
    private Component component;
    private String title;

    public ModelChildForm(Component component, String title) {
        this.component = component;
        this.title = title;
    }

    // <editor-fold defaultstate="collapsed" desc="Getters and Setters">
    public Component getComponent() {
        return component;
    }

    public void setComponent(Component component) {
        this.component = component;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    // </editor-fold>
    
}

package com.rmr.converter.models;

import com.rmr.converter.interfaces.IController;
import javax.swing.JPanel;

/**
 *
 * @author Reynaldo Martínez Reyes
 */
public class ModelChildForm {
    
    private JPanel view;
    private IController controller;
    private String title;

    public ModelChildForm(JPanel view, IController controller, String title) {
        this.view = view;
        this.controller = controller;
        this.title = title;
    }

    // <editor-fold defaultstate="collapsed" desc="Getters and Setters">
    public JPanel getView() {
        return view;
    }

    public void setView(JPanel view) {
        this.view = view;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public IController getController() {
        return controller;
    }

    public void setController(IController controller) {
        this.controller = controller;
    }
    // </editor-fold>
    
}

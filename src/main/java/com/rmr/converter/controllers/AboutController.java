package com.rmr.converter.controllers;

import com.rmr.converter.interfaces.IController;
import com.rmr.converter.views.AboutView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Reynaldo Martínez Reyes
 */
public class AboutController implements IController, ActionListener {

    public AboutView view;

    public AboutController(AboutView view) {
        this.view = view;
    }
    
    @Override
    public void init() {
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
}

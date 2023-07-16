package com.rmr.converter.controllers;

import com.rmr.converter.interfaces.IController;
import com.rmr.converter.views.TemperatureView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Reynaldo Martínez Reyes
 */
public class TemperatureController implements IController, ActionListener {

    public TemperatureView view;

    public TemperatureController(TemperatureView view) {
        this.view = view;
    }
    
    @Override
    public void init() {
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
}

package com.rmr.converter.controllers;

import com.rmr.converter.interfaces.IController;
import com.rmr.converter.views.LengthView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Reynaldo Martínez Reyes
 */
public class LengthController implements IController, ActionListener {

    public LengthView view;

    public LengthController(LengthView view) {
        this.view = view;
    }
    
    @Override
    public void init() {
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
}

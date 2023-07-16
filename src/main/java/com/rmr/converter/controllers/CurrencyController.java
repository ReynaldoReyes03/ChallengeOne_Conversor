package com.rmr.converter.controllers;

import com.rmr.converter.interfaces.IController;
import com.rmr.converter.views.CurrencyView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Reynaldo Martínez Reyes
 */
public class CurrencyController implements IController, ActionListener {

    public CurrencyView view;

    public CurrencyController(CurrencyView view) {
        this.view = view;
    }
    
    @Override
    public void init() {
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
}

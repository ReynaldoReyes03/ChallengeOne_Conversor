package com.rmr.converter.controllers;

import com.rmr.converter.interfaces.IController;
import com.rmr.converter.views.HomeView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Reynaldo Martínez Reyes
 */
public class HomeController implements IController, ActionListener {

    public HomeView view;

    public HomeController(HomeView view) {
        this.view = view;
    }
    
    @Override
    public void init() {
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
}

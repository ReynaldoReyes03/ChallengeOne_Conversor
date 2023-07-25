package com.rmr.converter.controllers;

import com.rmr.converter.interfaces.IController;
import com.rmr.converter.utilities.FontLoader;
import com.rmr.converter.views.HomeView;
import java.awt.Font;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;

/**
 *
 * @author Reynaldo Martínez Reyes
 */
public class HomeController implements IController {
    
    private final String text = "This is a project of a course guided by ALURA Latam and by Oracle with its education program called ONE.\n\nThis system is developed in Java and uses the Java Swing library for the user interface. I hope you can use it in your day to day and that it will be useful when you need help when it comes to conversions between units.";
    
    public HomeView view;

    public HomeController(HomeView view) {
        this.view = view;
    }
    
    @Override
    public void init() {
        initTextPane();
    }
    
    private void initTextPane() {
        view.textPane_text.setText("This is a project of a course guided by ALURA Latam and by Oracle with its education program called ONE. This system is developed in Java and uses the Java Swing library for the user interface. I hope you can use it in your day to day and that it will be useful when you need help when it comes to conversions between units.");
        
        updateTextPaneFont();
    }
    
    public void updateTextPaneFont() {
        SimpleAttributeSet attributeSet = new SimpleAttributeSet();
        Font font = FontLoader.getRegularBigFont();
        
        StyleConstants.setAlignment(attributeSet, StyleConstants.ALIGN_CENTER);
        StyleConstants.setFontFamily(attributeSet, font.getFamily());
        StyleConstants.setFontSize(attributeSet, font.getSize());
        
        view.textPane_text.setParagraphAttributes(attributeSet, true);
    }

    @Override
    public void updateFont() {
        updateTextPaneFont();
    }
    
}

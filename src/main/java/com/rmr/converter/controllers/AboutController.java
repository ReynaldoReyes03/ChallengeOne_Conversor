package com.rmr.converter.controllers;

import com.rmr.converter.interfaces.IController;
import com.rmr.converter.utilities.FontLoader;
import com.rmr.converter.views.AboutView;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.time.Year;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;

/**
 *
 * @author Reynaldo Martínez Reyes
 */
public class AboutController implements IController, ActionListener {
    
    private final String aboutText = "You can contact me through the following links to my social networks. Also, if you have any problems using the converter or any feature of the converter, you can contact me by email and send me a message with your problem or appreciation.";
    private final String copyrightText = "© Copyright " + Year.now().getValue() + " Reynaldo Martínez Reyes - All rights reserved ";
    
    public AboutView view;

    public AboutController(AboutView view) {
        this.view = view;
    }
    
    @Override
    public void init() {
        initTextPane();
        initButtons();
    }
    
    private void initButtons() {
        view.button_discord.addActionListener(this);
        view.button_github.addActionListener(this);
        view.button_email.addActionListener(this);
        view.button_website.addActionListener(this);
        view.button_linkedin.addActionListener(this);
        view.button_youtube.addActionListener(this);
    }
    
    private void initTextPane() {
        view.textPane_text.setText(aboutText);
        view.label_copyright.setText(copyrightText);
        
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
        
        view.button_discord.setFont(FontLoader.getBoldSmallFont());
        view.button_github.setFont(FontLoader.getBoldSmallFont());
        view.button_email.setFont(FontLoader.getBoldSmallFont());
        view.button_website.setFont(FontLoader.getBoldSmallFont());
        view.button_linkedin.setFont(FontLoader.getBoldSmallFont());
        view.button_youtube.setFont(FontLoader.getBoldSmallFont());
        
        view.label_copyright.setFont(FontLoader.getRegularMediumFont());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        
        String link = "";
        
        if (source == view.button_discord) {
            link = "https://www.discordapp.com/users/1091315250210549816";
        } else if (source == view.button_github) {
            link = "https://github.com/ReynaldoReyes03";
        } else if (source == view.button_email) {
            link = "mailto:mr026812@gmail.com";
        } else if (source == view.button_website) {
            link = "https://reynaldo-reyes.netlify.app/";
        } else if (source == view.button_linkedin) {
            link = "https://www.linkedin.com/in/reynaldo-martinez-reyes";
        } else if (source == view.button_youtube) {
            link = "https://www.youtube.com/@reynaldomartinezreyes4391";
        }
        
        System.out.println(link);
        
        try {
            Desktop.getDesktop().browse(new URI(link));
        } catch (URISyntaxException | IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
}

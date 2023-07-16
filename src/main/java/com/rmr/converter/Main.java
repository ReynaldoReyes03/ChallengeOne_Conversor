package com.rmr.converter;

import com.rmr.converter.main.App;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Reynaldo Martínez Reyes
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Starting the Alura converter challenge...");
        
        setLookAndFeel();
        new App().setVisible(true);
    }
    
    private static void setLookAndFeel() {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException e) {
            System.out.println(e.getMessage());
        }
    }
}

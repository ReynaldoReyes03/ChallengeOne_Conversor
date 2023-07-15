package com.rmr.converter.swing.button;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JButton;

/**
 *
 * @author Reynaldo Martínez Reyes
 */
public class ButtonCustom extends JButton {
    
    public ButtonCustom() {
        setBackground(new Color(103, 58, 140));
        setContentAreaFilled(false);
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }
    
    // <editor-fold defaultstate="collapsed" desc="Override methods">
    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D graphics2D = (Graphics2D) g;
        
        graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        graphics2D.setColor(getBackground());
        graphics2D.fillRoundRect(10, 10, getWidth() - 20, getHeight() - 20, 20, 20);
        
        super.paintComponent(g);
    }
    // </editor-fold>
    
}

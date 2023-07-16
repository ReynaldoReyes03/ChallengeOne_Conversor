package com.rmr.converter.swing.buttons;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JButton;

/**
 *
 * @author Reynaldo Martínez Reyes
 */
public class RoundedButton extends JButton {
    
    private int rounded = 40;

    public RoundedButton() {
        setContentAreaFilled(false);
        setCursor(new Cursor(Cursor.HAND_CURSOR));
        setForeground(Color.WHITE);
        setOpaque(false);
        setPreferredSize(new Dimension(150, 40));
    }

    // <editor-fold defaultstate="collapsed" desc="Getters and Setters">
    public int getRounded() {
        return rounded;
    }

    public void setRounded(int rounded) {
        this.rounded = rounded;
    }
    // </editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Override methods">
    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D graphics2D = (Graphics2D) g;
        
        graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        graphics2D.setColor(getBackground());
        graphics2D.fillRoundRect(0, 0, getWidth(), getHeight(), this.rounded, this.rounded);
        
        super.paintComponent(g);
    }
    //</editor-fold>
    
}

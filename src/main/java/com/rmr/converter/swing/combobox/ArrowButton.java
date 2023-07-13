package com.rmr.converter.swing.combobox;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JButton;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author Reynaldo Martínez Reyes
 */
public class ArrowButton extends JButton {
    
    public ArrowButton(Color arrowColor) {
        setBackground(arrowColor);
        setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentAreaFilled(false);
    }
    
    // <editor-fold defaultstate="collpased" desc="Override methods">
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        
        Graphics2D graphics2D = (Graphics2D) g;
        
        int size = 10;
        
        int x = (getWidth() - size) / 2;
        int y = (getHeight() - size) / 2 + 5;
        
        int xPoints[] = {x, x + size, x + size / 2};
        int yPoints[] = {y, y, y + size / 2};
        
        graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        graphics2D.setColor(getBackground());
        graphics2D.fillPolygon(xPoints, yPoints, xPoints.length);
        graphics2D.dispose();
    }
    // </editor-fold>

}

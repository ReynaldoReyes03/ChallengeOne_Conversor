package com.rmr.converter.swing;

import com.rmr.converter.utilities.Gradient;
import java.awt.Dimension;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

/**
 *
 * @author Reynaldo Martínez Reyes
 */
public class GradientHeader extends JPanel {

    public GradientHeader() {
        setOpaque(false);
        setPreferredSize(new Dimension(100, 51));
    }
    
    // <editor-fold defaultstate="collapsed" desc="Override methods">
    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D graphics2D = (Graphics2D) g;
        GradientPaint gradient = new GradientPaint(0, 0, Gradient.gradientColor1, 0, Gradient.height, Gradient.gradientColor2);
        
        graphics2D.setPaint(gradient);
        graphics2D.fillRect(0, 0, getWidth(), getHeight());
        
        super.paintComponent(g);
    }
    // </editor-fold>

    
}

package com.rmr.converter.swing;

import com.rmr.converter.utilities.Gradient;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JPanel;

/**
 *
 * @author Reynaldo Martínez Reyes
 */
public class GradientRoundedPanel extends JPanel {
    
    private int roundedValue = 20;
    private int menuHeight;
    
    private Color gradientColor1 = new Color(144, 107, 255);
    private Color gradientColor2 = new Color(151, 20, 255);
    
    
    public GradientRoundedPanel() {
        setOpaque(false);
    }

    // <editor-fold defaultstate="collapsed" desc="Getters and Setters">
    public int getRoundedValue() {
        return roundedValue;
    }

    public void setRoundedValue(int roundedValue) {
        this.roundedValue = roundedValue;
    }
    
    public void setMenuHeight(int menuHeight) {
        this.menuHeight = menuHeight;
    }

    public void setGradientColor1(Color gradientColor1) {
        this.gradientColor1 = gradientColor1;
    }

    public void setGradientColor2(Color gradientColor2) {
        this.gradientColor2 = gradientColor2;
    }
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Override methods">
    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D graphics2D = (Graphics2D) g;
        
        int y = -getBounds().y - 51;
        
        GradientPaint gradient = new GradientPaint(0, y, Gradient.gradientColor1, 0, y + Gradient.height, Gradient.gradientColor2);
        
        graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        graphics2D.setPaint(gradient);
        graphics2D.fillRoundRect(0, 0, getWidth(), getHeight(), roundedValue, roundedValue);
        
        super.paintComponent(g);
    }    
    // </editor-fold>

}

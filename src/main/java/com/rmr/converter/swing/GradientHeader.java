package com.rmr.converter.swing;

import java.awt.Color;
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
    
    private int menuHeight;
    
    private Color gradientColor1 = new Color(144, 107, 255);
    private Color gradientColor2 = new Color(151, 20, 255);

    public GradientHeader() {
        setOpaque(false);
        setPreferredSize(new Dimension(100, 51));
        
        menuHeight = getHeight();
    }

    // <editor-fold defaultstate="collapsed" desc="Getters and Setters">
    public int getMenuHeight() {
        return menuHeight;
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
        GradientPaint gradient = new GradientPaint(0, 0, gradientColor1, 0, menuHeight, gradientColor2);
        
        graphics2D.setPaint(gradient);
        graphics2D.fillRect(0, 0, getWidth(), getHeight());
        
        super.paintComponent(g);
    }
    // </editor-fold>

    
}

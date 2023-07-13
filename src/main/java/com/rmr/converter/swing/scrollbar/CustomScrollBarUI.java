package com.rmr.converter.swing.scrollbar;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JScrollBar;
import javax.swing.plaf.basic.BasicScrollBarUI;

/**
 *
 * @author Reynaldo Martínez Reyes
 */
public class CustomScrollBarUI extends BasicScrollBarUI {
    
    private Color trackColor;
    private Color thumbColor;
    
    private final int THUMB_SIZE = 40;

    public CustomScrollBarUI(Color trackColor, Color thumbColor) {
        this.trackColor = trackColor;
        this.thumbColor = thumbColor;
    }

    // <editor-fold defaultstate="collapsed" desc="Getters and Setters">
    public Color getTrackColor() {
        return trackColor;
    }

    public void setTrackColor(Color trackColor) {
        this.trackColor = trackColor;
    }

    public Color getThumbColor() {
        return thumbColor;
    }

    public void setThumbColor(Color thumbColor) {
        this.thumbColor = thumbColor;
    }
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Override methods">
    @Override
    protected Dimension getMaximumThumbSize() {
        Dimension dimension;
        
        if (scrollbar.getOrientation() == JScrollBar.VERTICAL) {
            dimension = new Dimension(0, THUMB_SIZE);
        } else {
            dimension = new Dimension(THUMB_SIZE, 0);
        }
        
        return dimension;
    }

    @Override
    public Dimension getMinimumThumbSize() {
        Dimension dimension;
        
        if (scrollbar.getOrientation() == JScrollBar.VERTICAL) {
            dimension = new Dimension(0, THUMB_SIZE);
        } else {
            dimension = new Dimension(THUMB_SIZE, 0);
        }
        
        return dimension;
    }
    
    @Override
    protected JButton createDecreaseButton(int orientation) {
        return new CustomScrollBarButton();
    }

    @Override
    protected JButton createIncreaseButton(int orientation) {
        return new CustomScrollBarButton();
    }

    @Override
    protected void paintTrack(Graphics g, JComponent component, Rectangle trackBounds) {
        Graphics2D graphics2D = (Graphics2D) g;
        
        int size, x, y, width, height;
        
        if (scrollbar.getOrientation() == JScrollBar.VERTICAL) {
            size = trackBounds.width / 2;
            
            x = trackBounds.x + ((trackBounds.width - size) / 2);
            y = trackBounds.y;
            
            width = size;
            height = trackBounds.height;
        } else {
            size = trackBounds.height / 2;
            
            x = trackBounds.x;
            y = trackBounds.y + ((trackBounds.height - size) / 2);
            
            width = trackBounds.width;
            height = size;
        }
        
        graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        graphics2D.setColor(trackColor);
        graphics2D.fillRect(x, y, width, height);
    }

    @Override
    protected void paintThumb(Graphics g, JComponent component, Rectangle thumbBounds) {
        Graphics2D graphics2D = (Graphics2D) g;
        
        int x = thumbBounds.x;
        int y = thumbBounds.y;
        
        int width = thumbBounds.width;
        int height = thumbBounds.height;
        
        if (scrollbar.getOrientation() == JScrollBar.VERTICAL) {
            y += 8;
            height -= 16;
        } else {
            x += 8;
            width -= 16;
        }
        
        graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        graphics2D.setColor(thumbColor);
        graphics2D.fillRoundRect(x, y, width, height, 10, 10);
    }
    // </editor-fold>
    
}

package com.rmr.converter.swing.scrollbar;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JScrollBar;

/**
 *
 * @author Reynaldo Martínez Reyes
 */
public class ScrollBar extends JScrollBar {
    
    private Color trackColor = new Color(240, 240, 240);
    private Color thumbColor = new Color(151, 20, 255);
    
    private final CustomScrollBarUI scrollBarUI = new CustomScrollBarUI(trackColor, thumbColor);

    public ScrollBar() {
        setBackground(Color.WHITE);
        setPreferredSize(new Dimension(8, 8));
        setUI(scrollBarUI);
    }

    // <editor-fold defaultstate="collapsed" desc="Getters and Setters">
    public Color getTrackColor() {
        return trackColor;
    }

    public void setTrackColor(Color trackColor) {
        this.trackColor = trackColor;
        
        scrollBarUI.setTrackColor(trackColor);
    }

    public Color getThumbColor() {
        return thumbColor;
    }

    public void setThumbColor(Color thumbColor) {
        this.thumbColor = thumbColor;
        
        scrollBarUI.setThumbColor(thumbColor);
    }
    // </editor-fold>
    
}

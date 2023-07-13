package com.rmr.converter.swing.combobox;

import java.awt.Color;
import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author Reynaldo Martínez Reyes
 */
public class ListCellRenderer extends DefaultListCellRenderer {
    
    private Color listItemsBackground;
    private Color listItemsForeground;
    private Color listItemHoverBackground;
    private Color listItemHoverForeground;
    
    // <editor-fold defaultstate="collapsed" desc="Getters and Setters">
    public Color getListItemsBackground() {
        return listItemsBackground;
    }

    public void setListItemsBackground(Color listItemsBackground) {
        this.listItemsBackground = listItemsBackground;
    }

    public Color getListItemsForeground() {
        return listItemsForeground;
    }

    public void setListItemsForeground(Color listItemsForeground) {
        this.listItemsForeground = listItemsForeground;
    }

    public Color getListItemHoverBackground() {
        return listItemHoverBackground;
    }

    public void setListItemHoverBackground(Color listItemHoverBackground) {
        this.listItemHoverBackground = listItemHoverBackground;
    }

    public Color getListItemHoverForeground() {
        return listItemHoverForeground;
    }

    public void setListItemHoverForeground(Color listItemHoverForeground) {
        this.listItemHoverForeground = listItemHoverForeground;
    }
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Override methods"> 
    @Override
    public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        Component component = super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
        
        setBorder(new EmptyBorder(5, 5, 5, 5));
        
        component.setBackground(isSelected ? listItemHoverBackground : listItemsBackground);
        component.setForeground(isSelected ? listItemHoverForeground : listItemsForeground);
        
        return component;
    }
    // </editor-fold>
    
}

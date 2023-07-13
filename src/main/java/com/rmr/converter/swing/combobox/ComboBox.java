package com.rmr.converter.swing.combobox;

import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author Reynaldo Martínez Reyes
 */
public class ComboBox extends JComboBox<Object> {
    
    private String labelText = "Label";
    
    private Color normalColor = new Color(150, 150, 150);
    private Color activeColor = new Color(151, 20, 255);
    
    private Color verticalScrollBarThumbColor = activeColor;
    private Color verticalScrollBarTrackColor = normalColor;
    
    private Color horizontalScrollBarThumbColor = activeColor;
    private Color horizontalScrollBarTrackColor = normalColor;
    
    private Color listItemsBackground = Color.WHITE;
    private Color listItemsForeground = new Color(32, 32, 32);
    private Color listItemHoverBackground = new Color(240, 240, 240);
    private Color listItemHoverForeground = activeColor;
    
    private Color comboPopupBorderColor = new Color(240, 240, 240);
    
    private final ComboBoxUI comboBoxUI;
    private final ListCellRenderer listCellRenderer;

    public ComboBox() {
        this.comboBoxUI = new ComboBoxUI(this);
        this.listCellRenderer = new ListCellRenderer();
        
        configureScrollBars();
        configureListItems();
        init();
    }
    
    // <editor-fold defaultstate="collapsed" desc="Getters and Setters">
    public String getLabelText() {
        return labelText;
    }

    public void setLabelText(String labelText) {
        this.labelText = labelText;
    }

    public Color getNormalColor() {
        return normalColor;
    }

    public void setNormalColor(Color normalColor) {
        this.normalColor = normalColor;
    }

    public Color getActiveColor() {
        return activeColor;
    }

    public void setActiveColor(Color activeColor) {
        this.activeColor = activeColor;
    }

    public Color getVerticalScrollBarThumbColor() {
        return verticalScrollBarThumbColor;
    }

    public void setVerticalScrollBarThumbColor(Color verticalScrollBarThumbColor) {
        this.verticalScrollBarThumbColor = verticalScrollBarThumbColor;
        
        comboBoxUI.setVerticalScrollBarThumbColor(verticalScrollBarThumbColor);
    }

    public Color getVerticalScrollBarTrackColor() {
        return verticalScrollBarTrackColor;
    }

    public void setVerticalScrollBarTrackColor(Color verticalScrollBarTrackColor) {
        this.verticalScrollBarTrackColor = verticalScrollBarTrackColor;
        
        comboBoxUI.setVerticalScrollBarTrackColor(verticalScrollBarTrackColor);
    }

    public Color getHorizontalScrollBarThumbColor() {
        return horizontalScrollBarThumbColor;
    }

    public void setHorizontalScrollBarThumbColor(Color horizontalScrollBarThumbColor) {
        this.horizontalScrollBarThumbColor = horizontalScrollBarThumbColor;
        
        comboBoxUI.setHorizontalScrollBarThumbColor(horizontalScrollBarThumbColor);
    }

    public Color getHorizontalScrollBarTrackColor() {
        return horizontalScrollBarTrackColor;
    }

    public void setHorizontalScrollBarTrackColor(Color horizontalScrollBarTrackColor) {
        this.horizontalScrollBarTrackColor = horizontalScrollBarTrackColor;
        
        comboBoxUI.setHorizontalScrollBarTrackColor(horizontalScrollBarTrackColor);
    }

    public Color getListItemsBackground() {
        return listItemsBackground;
    }

    public void setListItemsBackground(Color listItemsBackground) {
        this.listItemsBackground = listItemsBackground;
        listCellRenderer.setListItemsBackground(listItemsBackground);
    }

    public Color getListItemsForeground() {
        return listItemsForeground;
    }

    public void setListItemsForeground(Color listItemsForeground) {
        this.listItemsForeground = listItemsForeground;
        listCellRenderer.setListItemsForeground(listItemsForeground);
    }

    public Color getListItemHoverBackground() {
        return listItemHoverBackground;
    }

    public void setListItemHoverBackground(Color listItemHoverBackground) {
        this.listItemHoverBackground = listItemHoverBackground;
        listCellRenderer.setListItemHoverBackground(listItemHoverBackground);
    }

    public Color getListItemHoverForeground() {
        return listItemHoverForeground;
    }

    public void setListItemHoverForeground(Color listItemHoverForeground) {
        this.listItemHoverForeground = listItemHoverForeground;
        listCellRenderer.setListItemHoverForeground(listItemHoverForeground);
    }

    public Color getComboPopupBorderColor() {
        return comboPopupBorderColor;
    }

    public void setComboPopupBorderColor(Color comboPopupBorderColor) {
        this.comboPopupBorderColor = comboPopupBorderColor;
        
        comboBoxUI.setComboPopupBorderColor(comboPopupBorderColor);
    }
    // </editor-fold>
    
    private void configureScrollBars() {
        comboBoxUI.setVerticalScrollBarThumbColor(verticalScrollBarThumbColor);
        comboBoxUI.setVerticalScrollBarTrackColor(verticalScrollBarTrackColor);
        comboBoxUI.setHorizontalScrollBarThumbColor(horizontalScrollBarThumbColor);
        comboBoxUI.setHorizontalScrollBarTrackColor(horizontalScrollBarTrackColor);
        comboBoxUI.setComboPopupBorderColor(comboPopupBorderColor);
    }
    
    private void configureListItems() {
        listCellRenderer.setListItemsBackground(listItemsBackground);
        listCellRenderer.setListItemsForeground(listItemsForeground);
        listCellRenderer.setListItemHoverBackground(listItemHoverBackground);
        listCellRenderer.setListItemHoverForeground(listItemHoverForeground);
    }
    
    private void init() {
        setBackground(Color.WHITE);
        setBorder(new EmptyBorder(15, 3, 5, 3));
        setRenderer(listCellRenderer);
        setUI(comboBoxUI);
    }
    
}

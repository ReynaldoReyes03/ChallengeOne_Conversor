package com.rmr.converter.models;

import javax.swing.Icon;

/**
 *
 * @author Reynaldo Martínez Reyes
 */
public class ModelMenu {
    private String menuName;
    private Icon icon;
    private boolean selected;

    public ModelMenu(String menuName, Icon icon) {
        this.menuName = menuName;
        this.icon = icon;
    }

    public ModelMenu(String menuName, Icon icon, boolean selected) {
        this.menuName = menuName;
        this.icon = icon;
        this.selected = selected;
    }

    // <editor-fold defaultstate="collapsed" desc="Getters and Setters">
    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public Icon getIcon() {
        return icon;
    }

    public void setIcon(Icon icon) {
        this.icon = icon;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }
    // </editor-fold>
    
}

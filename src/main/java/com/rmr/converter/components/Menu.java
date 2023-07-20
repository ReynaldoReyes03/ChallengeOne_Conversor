package com.rmr.converter.components;

import com.rmr.converter.events.EventMenuSelected;
import com.rmr.converter.models.ModelMenu;
import com.rmr.converter.swing.MenuItem;
import com.rmr.converter.swing.buttons.ButtonCustom;
import com.rmr.converter.utilities.Gradient;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.layout.CC;
import net.miginfocom.swing.MigLayout;

/**
 *
 * @author Reynaldo Martínez Reyes
 */
public class Menu extends JPanel {
    
    private MigLayout layout;
    
    private JPanel panelMenu;
    
    private JButton button_menu;
    private JButton button_exit;
    
    private Header header;
    private EventMenuSelected event;

    public Menu() {
        initComponents();
        setOpaque(false);
        init();
    }
    
    private void init() {
        setLayout(new MigLayout("wrap, fillx, insets 0", "[fill]", "5[]0[]push[68]0"));
        
        createButtonMenu();
        createButtonExit();
        
        layout = new MigLayout("fillx, wrap", "0[fill]0", "0[]3[]0");
        panelMenu = new JPanel();
        header = new Header();
        
        panelMenu.setOpaque(false);
        panelMenu.setLayout(layout);
        
        add(button_menu, "pos 1al 0al 100% 50");
        add(button_exit, new CC().pos("1al", "1al", "100%", "100").height("68!"));
        add(header);
        add(panelMenu);
    }
    
    public void addMenu(ModelMenu menu) {
        MenuItem menuItem = new MenuItem(menu.getIcon(), menu.getMenuName(), panelMenu.getComponentCount(), menu.isSelected());
        
        menuItem.addEvent(this::clearMenu);
        menuItem.addEvent(event);
        
        panelMenu.add(menuItem);
    }
    
    private void clearMenu(int exceptIndex) {
        for (Component component : panelMenu.getComponents()) {
            MenuItem menuItem = (MenuItem) component;
            
            if (menuItem.getIndex() != exceptIndex) menuItem.setSelected(false);
        }
    }
    
    private void createButtonMenu() {
        button_menu = new JButton();
        
        button_menu.setBorder(new EmptyBorder(5, 12, 5, 12));
        button_menu.setContentAreaFilled(false);
        button_menu.setCursor(new Cursor(Cursor.HAND_CURSOR));
        button_menu.setIcon(new ImageIcon(getClass().getResource("/icons/menu-open.png")));
    }
    
    private void createButtonExit() {
        button_exit = new ButtonCustom();
        button_exit.setIcon(new ImageIcon(getClass().getResource("/icons/exit.png")));
    }
    
    public void setMenuButtonIcon(ImageIcon icon) {
        button_menu.setIcon(icon);
    }
    
    public void updateFont() {
        for (Component component : panelMenu.getComponents()) ((MenuItem) component).updateFont();
        
        header.updateFont();
    }
    
    public void addEventMenu(ActionListener event) {
        button_menu.addActionListener(event);
    }
    
    public void addEventExit(ActionListener event) {
        button_exit.addActionListener(event);
    }
    
    public void setEvent(EventMenuSelected event) {
        this.event = event;
    }
    
    public void setAlpha(float alpha) {
        header.setAlpha(alpha);
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
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}

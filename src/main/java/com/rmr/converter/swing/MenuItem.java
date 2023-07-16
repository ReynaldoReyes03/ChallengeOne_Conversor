package com.rmr.converter.swing;

import com.rmr.converter.events.EventMenuSelected;
import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.Icon;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 *
 * @author Reynaldo Martínez Reyes
 */
public class MenuItem extends JPanel {

    private final List<EventMenuSelected> events = new ArrayList<>();
    
    private int index;
    
    private boolean selected;
    private boolean mouseOver;
    
    private Color selectedColor = new Color(151, 20, 255);
    private Color selectedBorderColor = new Color(245, 245, 245);
    
    public MenuItem(Icon icon, String name, int index, boolean selected) {
        initComponents();
        setCursor(new Cursor(Cursor.HAND_CURSOR));
        setOpaque(false);
        
        label_icon.setIcon(icon);
        label_name.setText(name);
        
        this.index = index;
        this.selected = selected;
        
        addMouseListener();
    }

    // <editor-fold defaultstate="collapsed" desc="Getters and Setters">
    public int getIndex() {
        return index;
    }
    
    public boolean isSelected() {    
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
        repaint();
    }
    // </editor-fold>
    
    private void addMouseListener() {
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                mouseOver = true;
            }

            @Override
            public void mouseExited(MouseEvent e) {
                mouseOver = false;
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                if (SwingUtilities.isLeftMouseButton(e)) {
                    setSelected(true);
                    
                    repaint();
                    runEvent();
                }
            }
        });
    }
    
    public void addEvent(EventMenuSelected event) {
        events.add(event);
    }
    
    private void runEvent() {
        events.forEach(event -> event.selected(index));
    }

    // <editor-fold defaultstate="collapsed" desc="Override Methods">
    @Override
    protected void paintComponent(Graphics g) {
        if (!selected) return;
        
        Graphics2D graphics2D = (Graphics2D) g;
        
        graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        graphics2D.setColor(selectedColor);
        graphics2D.fillRect(0, 0, getWidth(), getHeight());
        
        graphics2D.setColor(selectedBorderColor);
        graphics2D.setComposite(AlphaComposite.SrcOver);
        graphics2D.fillRect(0, 0, 2, getHeight());
    }
    // </editor-fold>

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label_icon = new javax.swing.JLabel();
        label_name = new javax.swing.JLabel();

        label_icon.setPreferredSize(new java.awt.Dimension(30, 30));

        label_name.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label_name.setText("MENU NAME");
        label_name.setPreferredSize(new java.awt.Dimension(37, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(label_icon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(label_name, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_icon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel label_icon;
    private javax.swing.JLabel label_name;
    // End of variables declaration//GEN-END:variables
}

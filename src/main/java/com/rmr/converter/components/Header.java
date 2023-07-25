package com.rmr.converter.components;

import com.rmr.converter.utilities.FontLoader;
import java.awt.AlphaComposite;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

/**
 *
 * @author Reynaldo Martínez Reyes
 */
public class Header extends JPanel {
    
    private float alpha;

    public Header() {
        initComponents();
        setOpaque(false);
    }
    
    public void updateFont() {
        label_title.setFont(FontLoader.getBoldSmallFont());
    }
    
    // <editor-fold defaultstate="collapsed" desc="Getters and Setters">
    public float getAlpha() {
        return alpha;
    }

    public void setAlpha(float alpha) {
        this.alpha = alpha;
    }
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Override Methods">
    @Override
    public void paint(Graphics g) {
        Graphics2D graphics2D = (Graphics2D) g;
        
        graphics2D.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, alpha));
        
        super.paint(g);
    }
    // </editor-fold>

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label_title = new javax.swing.JLabel();

        label_title.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label_title.setForeground(new java.awt.Color(255, 255, 255));
        label_title.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon-27.png"))); // NOI18N
        label_title.setText("Alura Converter");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(label_title, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_title, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel label_title;
    // End of variables declaration//GEN-END:variables
}

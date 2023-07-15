package com.rmr.converter.components;

import java.awt.AlphaComposite;
import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 *
 * @author Reynaldo Martínez Reyes
 */
public class Header extends javax.swing.JPanel {
    
    private float alpha;

    public Header() {
        initComponents();
        setOpaque(false);
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

        jLabel1 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("ALURA Converter");
        jLabel1.setPreferredSize(new java.awt.Dimension(92, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}

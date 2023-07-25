package com.rmr.converter.views;

import javax.swing.JPanel;

/**
 *
 * @author Reynaldo Martínez Reyes
 */
public class HomeView extends JPanel {

    public HomeView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label_image = new javax.swing.JLabel();
        textPane_text = new javax.swing.JTextPane();

        setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        setOpaque(false);

        label_image.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/poster-200.png"))); // NOI18N

        textPane_text.setEditable(false);
        textPane_text.setBackground(new java.awt.Color(245, 245, 245));
        textPane_text.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 50, 10, 50));
        textPane_text.setFont(new java.awt.Font("Sitka Subheading", 0, 14)); // NOI18N
        textPane_text.setForeground(new java.awt.Color(30, 30, 30));
        textPane_text.setFocusCycleRoot(false);
        textPane_text.setFocusable(false);
        textPane_text.setOpaque(false);
        textPane_text.setRequestFocusEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textPane_text)
            .addComponent(label_image, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 595, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(label_image)
                .addGap(10, 10, 10)
                .addComponent(textPane_text, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel label_image;
    public javax.swing.JTextPane textPane_text;
    // End of variables declaration//GEN-END:variables
}

package com.rmr.converter.views;

import javax.swing.JPanel;

/**
 *
 * @author Reynaldo Martínez Reyes
 */
public class LengthView extends JPanel {

    public LengthView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        comboBox_from = new com.rmr.converter.swing.combobox.ComboBox();
        comboBox_to = new com.rmr.converter.swing.combobox.ComboBox();
        textfield_value = new com.rmr.converter.swing.TextField();
        button_swap = new javax.swing.JButton();
        button_convert = new com.rmr.converter.swing.buttons.GradientRoundedButton();
        panel = new com.rmr.converter.swing.GradientRoundedPanel();
        label_alert = new javax.swing.JLabel();
        label_base = new javax.swing.JLabel();
        label_result = new javax.swing.JLabel();
        label_description = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        setOpaque(false);

        comboBox_from.setBackground(new java.awt.Color(245, 245, 245));
        comboBox_from.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "Select", "Select", "Select", "Select", "Select" }));
        comboBox_from.setLabelText("From");
        comboBox_from.setOpaque(false);

        comboBox_to.setBackground(new java.awt.Color(245, 245, 245));
        comboBox_to.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "Select", "Select", "Select", "Select", "Select" }));
        comboBox_to.setLabelText("To");
        comboBox_to.setOpaque(false);

        textfield_value.setBackground(new java.awt.Color(245, 245, 245));
        textfield_value.setLabelText("Enter amount");

        button_swap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/swap.png"))); // NOI18N
        button_swap.setBorderPainted(false);
        button_swap.setContentAreaFilled(false);
        button_swap.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_swap.setFocusPainted(false);
        button_swap.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        button_convert.setText("CONVERT");
        button_convert.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        panel.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));

        label_alert.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        label_alert.setForeground(new java.awt.Color(255, 255, 255));
        label_alert.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_alert.setText("Your text here.");

        label_base.setForeground(new java.awt.Color(255, 255, 255));
        label_base.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_base.setText("? Meter");

        label_result.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        label_result.setForeground(new java.awt.Color(255, 255, 255));
        label_result.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_result.setText("? Centimetres");

        label_description.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        label_description.setForeground(new java.awt.Color(255, 255, 255));
        label_description.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_description.setText("? m = ? cm");
        label_description.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_base, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(label_result, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(label_description, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(label_alert, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addComponent(label_alert, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(label_base)
                .addGap(0, 0, 0)
                .addComponent(label_result, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(label_description, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textfield_value, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(comboBox_from, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                .addGap(9, 9, 9)
                .addComponent(button_swap, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboBox_to, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE))
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(100, Short.MAX_VALUE)
                .addComponent(button_convert, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(textfield_value, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboBox_from, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(button_swap))
                    .addComponent(comboBox_to, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(button_convert, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public com.rmr.converter.swing.buttons.GradientRoundedButton button_convert;
    public javax.swing.JButton button_swap;
    public com.rmr.converter.swing.combobox.ComboBox comboBox_from;
    public com.rmr.converter.swing.combobox.ComboBox comboBox_to;
    public javax.swing.JLabel label_alert;
    public javax.swing.JLabel label_base;
    public javax.swing.JLabel label_description;
    public javax.swing.JLabel label_result;
    public com.rmr.converter.swing.GradientRoundedPanel panel;
    public com.rmr.converter.swing.TextField textfield_value;
    // End of variables declaration//GEN-END:variables
}

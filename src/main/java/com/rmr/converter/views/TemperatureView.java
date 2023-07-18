package com.rmr.converter.views;

import javax.swing.JPanel;

/**
 *
 * @author Reynaldo Martínez Reyes
 */
public class TemperatureView extends JPanel {

    public TemperatureView() {
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
        gradientRoundedPanel1 = new com.rmr.converter.swing.GradientRoundedPanel();
        label_alert = new javax.swing.JLabel();
        label_from = new javax.swing.JLabel();
        label_to = new javax.swing.JLabel();
        label_info = new javax.swing.JLabel();

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

        gradientRoundedPanel1.setRoundedValue(20);

        label_alert.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        label_alert.setForeground(new java.awt.Color(255, 255, 255));
        label_alert.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        label_from.setForeground(new java.awt.Color(255, 255, 255));
        label_from.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_from.setText("? Kelvin");

        label_to.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label_to.setForeground(new java.awt.Color(255, 255, 255));
        label_to.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_to.setText("? Centigrades");

        label_info.setForeground(new java.awt.Color(255, 255, 255));
        label_info.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_info.setText("? K = ? ºC");

        javax.swing.GroupLayout gradientRoundedPanel1Layout = new javax.swing.GroupLayout(gradientRoundedPanel1);
        gradientRoundedPanel1.setLayout(gradientRoundedPanel1Layout);
        gradientRoundedPanel1Layout.setHorizontalGroup(
            gradientRoundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_from, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(label_to, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(label_info, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(label_alert, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        gradientRoundedPanel1Layout.setVerticalGroup(
            gradientRoundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gradientRoundedPanel1Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(label_alert)
                .addGap(0, 0, 0)
                .addComponent(label_from)
                .addGap(0, 0, 0)
                .addComponent(label_to)
                .addGap(10, 10, 10)
                .addComponent(label_info)
                .addContainerGap())
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
            .addComponent(gradientRoundedPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(gradientRoundedPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public com.rmr.converter.swing.buttons.GradientRoundedButton button_convert;
    public javax.swing.JButton button_swap;
    public com.rmr.converter.swing.combobox.ComboBox comboBox_from;
    public com.rmr.converter.swing.combobox.ComboBox comboBox_to;
    private com.rmr.converter.swing.GradientRoundedPanel gradientRoundedPanel1;
    public javax.swing.JLabel label_alert;
    public javax.swing.JLabel label_from;
    public javax.swing.JLabel label_info;
    public javax.swing.JLabel label_to;
    public com.rmr.converter.swing.TextField textfield_value;
    // End of variables declaration//GEN-END:variables
}

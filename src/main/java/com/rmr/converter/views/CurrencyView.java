package com.rmr.converter.views;

import javax.swing.JPanel;

/**
 *
 * @author Reynaldo Martínez Reyes
 */
public class CurrencyView extends JPanel {

    public CurrencyView() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textfield_value = new com.rmr.converter.swing.TextField();
        comboBox_from = new com.rmr.converter.swing.combobox.ComboBox();
        comboBox_to = new com.rmr.converter.swing.combobox.ComboBox();
        button_convert = new com.rmr.converter.swing.buttons.RoundedButton();
        label_from = new javax.swing.JLabel();
        label_to = new javax.swing.JLabel();
        label_info = new javax.swing.JLabel();
        label_date = new javax.swing.JLabel();
        button_swap = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        setOpaque(false);

        textfield_value.setBackground(new java.awt.Color(245, 245, 245));
        textfield_value.setLabelText("Enter amount");

        comboBox_from.setBackground(new java.awt.Color(245, 245, 245));
        comboBox_from.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "Select", "Select", "Select", "Select", "Select" }));
        comboBox_from.setLabelText("From");
        comboBox_from.setOpaque(false);

        comboBox_to.setBackground(new java.awt.Color(245, 245, 245));
        comboBox_to.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "Select", "Select", "Select", "Select", "Select" }));
        comboBox_to.setLabelText("To");
        comboBox_to.setOpaque(false);

        button_convert.setBackground(new java.awt.Color(144, 85, 255));
        button_convert.setText("roundedButton1");

        label_from.setForeground(new java.awt.Color(144, 85, 255));
        label_from.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_from.setText("100 USD");

        label_to.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label_to.setForeground(new java.awt.Color(144, 85, 255));
        label_to.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_to.setText("40000 COP");

        label_info.setForeground(new java.awt.Color(32, 32, 32));
        label_info.setText("1 USD = 4000 COP");

        label_date.setForeground(new java.awt.Color(32, 32, 32));
        label_date.setText("Last update: fecha de la última actualización UwU");

        button_swap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/swap.png"))); // NOI18N
        button_swap.setBorderPainted(false);
        button_swap.setContentAreaFilled(false);
        button_swap.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_swap.setFocusPainted(false);
        button_swap.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_from, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(label_to, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label_info, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textfield_value, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(comboBox_from, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(button_swap)
                                .addGap(7, 7, 7)
                                .addComponent(comboBox_to, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)))))
                .addContainerGap())
            .addComponent(label_date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(button_convert, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                .addGap(125, 125, 125))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(textfield_value, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBox_from, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBox_to, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(button_swap)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(button_convert, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(label_from, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(label_to, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(label_info, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_date, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public com.rmr.converter.swing.buttons.RoundedButton button_convert;
    public javax.swing.JButton button_swap;
    public com.rmr.converter.swing.combobox.ComboBox comboBox_from;
    public com.rmr.converter.swing.combobox.ComboBox comboBox_to;
    public javax.swing.JLabel label_date;
    public javax.swing.JLabel label_from;
    public javax.swing.JLabel label_info;
    public javax.swing.JLabel label_to;
    public com.rmr.converter.swing.TextField textfield_value;
    // End of variables declaration//GEN-END:variables
}

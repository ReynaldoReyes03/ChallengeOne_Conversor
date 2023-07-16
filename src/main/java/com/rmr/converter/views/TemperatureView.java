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

        comboBox1 = new com.rmr.converter.swing.combobox.ComboBox();
        jLabel1 = new javax.swing.JLabel();
        comboBox2 = new com.rmr.converter.swing.combobox.ComboBox();
        jLabel2 = new javax.swing.JLabel();
        buttonCustom1 = new com.rmr.converter.swing.buttons.ButtonCustom();
        jLabel3 = new javax.swing.JLabel();
        textField1 = new com.rmr.converter.swing.TextField();
        roundedButton1 = new com.rmr.converter.swing.buttons.RoundedButton();

        setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        setOpaque(false);

        comboBox1.setBackground(new java.awt.Color(245, 245, 245));
        comboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "Select", "Select", "Select", "Select", "Select" }));
        comboBox1.setLabelText("From");
        comboBox1.setOpaque(false);

        jLabel1.setForeground(new java.awt.Color(144, 85, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("? Kelvin");

        comboBox2.setBackground(new java.awt.Color(245, 245, 245));
        comboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "Select", "Select", "Select", "Select", "Select" }));
        comboBox2.setLabelText("From");
        comboBox2.setOpaque(false);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(144, 85, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("? Centigrades");

        buttonCustom1.setBackground(new java.awt.Color(204, 102, 255));
        buttonCustom1.setText("buttonCustom1");

        jLabel3.setForeground(new java.awt.Color(32, 32, 32));
        jLabel3.setText("? K = ? ºC");

        textField1.setBackground(new java.awt.Color(245, 245, 245));
        textField1.setLabelText("Enter amount");

        roundedButton1.setBackground(new java.awt.Color(144, 85, 255));
        roundedButton1.setText("roundedButton1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(roundedButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                .addGap(117, 117, 117))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textField1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(comboBox1, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                                .addGap(10, 10, 10)
                                .addComponent(buttonCustom1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboBox2, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonCustom1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addComponent(roundedButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.rmr.converter.swing.buttons.ButtonCustom buttonCustom1;
    private com.rmr.converter.swing.combobox.ComboBox comboBox1;
    private com.rmr.converter.swing.combobox.ComboBox comboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private com.rmr.converter.swing.buttons.RoundedButton roundedButton1;
    private com.rmr.converter.swing.TextField textField1;
    // End of variables declaration//GEN-END:variables
}

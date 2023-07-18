package com.rmr.converter.components;

import com.rmr.converter.models.ModelChildForm;
import java.awt.BorderLayout;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 *
 * @author Reynaldo Martínez Reyes
 */
public class MainPanel extends JPanel {
    
    private int x;
    private int y;
    
    public MainPanel() {
        initComponents();
        
        setDraggableFrame();
        setOpaque(false);
        
        panel_main.setLayout(new BorderLayout());
    }
    
    private void setDraggableFrame() {
        label_title.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                x = e.getX();
                y = e.getY();
            }
        });
        
        label_title.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                JFrame root = (JFrame) SwingUtilities.getRoot(label_title);
                Point rootLocation = root.getLocation();
                
                root.setLocation(rootLocation.x + e.getX() - x, rootLocation.y + e.getY() - y);
            }
        });
    }
    
    public void showForm(ModelChildForm form) {
        form.getController().init();
        
        form.getView().setSize(panel_main.getSize());
        form.getView().setLocation(0, 0);
        
        label_title.setText(form.getTitle());
        
        panel_main.removeAll();
        panel_main.add(form.getView(), BorderLayout.CENTER);
        panel_main.revalidate();
        panel_main.repaint();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_header = new com.rmr.converter.swing.GradientHeader();
        label_title = new javax.swing.JLabel();
        panel_main = new javax.swing.JPanel();

        label_title.setBackground(new java.awt.Color(255, 255, 255));
        label_title.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        label_title.setForeground(new java.awt.Color(245, 245, 245));
        label_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_title.setText("Form Title");

        javax.swing.GroupLayout panel_headerLayout = new javax.swing.GroupLayout(panel_header);
        panel_header.setLayout(panel_headerLayout);
        panel_headerLayout.setHorizontalGroup(
            panel_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_title, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        panel_headerLayout.setVerticalGroup(
            panel_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_title, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
        );

        panel_main.setOpaque(false);

        javax.swing.GroupLayout panel_mainLayout = new javax.swing.GroupLayout(panel_main);
        panel_main.setLayout(panel_mainLayout);
        panel_mainLayout.setHorizontalGroup(
            panel_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panel_mainLayout.setVerticalGroup(
            panel_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 243, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_header, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addComponent(panel_main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel_header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panel_main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel label_title;
    private com.rmr.converter.swing.GradientHeader panel_header;
    private javax.swing.JPanel panel_main;
    // End of variables declaration//GEN-END:variables
}

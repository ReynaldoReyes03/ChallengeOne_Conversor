/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.rmr.converter.main;

import com.rmr.converter.components.MainPanel;
import com.rmr.converter.components.Menu;
import com.rmr.converter.models.ModelMenu;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import net.miginfocom.swing.MigLayout;
import org.jdesktop.animation.timing.Animator;
import org.jdesktop.animation.timing.TimingTarget;
import org.jdesktop.animation.timing.TimingTargetAdapter;

/**
 *
 * @author Reynaldo Martínez Reyes
 */
public class App extends JFrame {

    private final Menu menu = new Menu();
    private final MainPanel mainPanel = new MainPanel();
    
    private MigLayout layout;
    private Animator animator;
    
    private int animationDuration = 550;
    
    private boolean menuShow;
    
    private Color gradientColor1 = new Color(185, 161, 255);
    private Color gradientColor2 = new Color(151, 20, 255);
    
    public App() {
        initComponents();
        init();
    }
    
    private void init() {
        layout = new MigLayout("fill", "0[]0[]0", "0[fill]0");
        
        mainPanel.setMenuHeight(getHeight());
        
        initMenu();
        initAnimator();
        configureColors();
        
        body.setLayout(layout);
        body.add(menu, "w 50!");
        body.add(mainPanel, "w 100%");
    }
    
    private void initMenu() {
        menu.addEventMenu(e -> { if (!animator.isRunning()) animator.start(); });
        menu.addEventExit(e -> System.exit(0));
        
        menu.setEvent(index -> {
            System.out.println("Menu " + index + " selected.");
            
            switch (index) {
                case 0 -> System.out.println("Button 0");
                case 1 -> System.out.println("Button 1");
                case 2 -> System.out.println("Button 2");
                case 3 -> System.out.println("Button 3");
                case 4 -> System.out.println("Button 4");
                default -> throw new AssertionError();
            }
        });
        
        menu.addMenu(new ModelMenu("Home", new ImageIcon(getClass().getResource("/icons/report.png")), true));
        menu.addMenu(new ModelMenu("Currency", new ImageIcon(getClass().getResource("/icons/report.png"))));
        menu.addMenu(new ModelMenu("Temperature", new ImageIcon(getClass().getResource("/icons/report.png"))));
        menu.addMenu(new ModelMenu("Length", new ImageIcon(getClass().getResource("/icons/report.png"))));
        menu.addMenu(new ModelMenu("About", new ImageIcon(getClass().getResource("/icons/report.png"))));
    }
    
    private void initAnimator() {
        TimingTarget target = new TimingTargetAdapter() {
            @Override
            public void timingEvent(float fraction) {
                double width = 50 + (150  * (menuShow ? 1f - fraction : fraction));
                
                if (fraction > 0) {
                    menu.setMenuButtonIcon(new ImageIcon(getClass().getResource("/icons/menu-" + (menuShow ? "open" : "close") + ".png")));
                }
                
                menu.setAlpha(menuShow ? 1f - fraction : fraction);
                layout.setComponentConstraints(menu, "w " + width + "!");
                body.revalidate();
            }

            @Override
            public void end() {
                menuShow = !menuShow;
            }
        };
        
        animator = new Animator(animationDuration, target);
        
        animator.setResolution(0);
        animator.setAcceleration(0.5f);
        animator.setDeceleration(0.5f);
    }
    
    private void configureColors() {
        menu.setMenuGradientColors(gradientColor1, gradientColor2);
        mainPanel.setHeaderGradientColor(gradientColor1, gradientColor2);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        body = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        body.setBackground(new java.awt.Color(245, 245, 245));

        javax.swing.GroupLayout bodyLayout = new javax.swing.GroupLayout(body);
        body.setLayout(bodyLayout);
        bodyLayout.setHorizontalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        bodyLayout.setVerticalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel body;
    // End of variables declaration//GEN-END:variables
}

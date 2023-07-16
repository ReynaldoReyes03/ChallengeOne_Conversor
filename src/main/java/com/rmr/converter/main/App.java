package com.rmr.converter.main;

import com.rmr.converter.components.MainPanel;
import com.rmr.converter.components.Menu;
import com.rmr.converter.controllers.AboutController;
import com.rmr.converter.controllers.CurrencyController;
import com.rmr.converter.controllers.HomeController;
import com.rmr.converter.controllers.LengthController;
import com.rmr.converter.controllers.TemperatureController;
import com.rmr.converter.models.ModelChildForm;
import com.rmr.converter.models.ModelMenu;
import com.rmr.converter.views.AboutView;
import com.rmr.converter.views.CurrencyView;
import com.rmr.converter.views.HomeView;
import com.rmr.converter.views.LengthView;
import com.rmr.converter.views.TemperatureView;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
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
    private int currentSelectedButton = 0;
    
    private boolean menuShow;
    
    private Color gradientColor1 = new Color(19, 226, 218);
    private Color gradientColor2 = new Color(144, 85, 255);
    
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
        
        JPanel view = new HomeView();
        mainPanel.showForm(new ModelChildForm(view, new HomeController((HomeView) view), "Home"));
    }
    
    private void initMenu() {
        menu.addEventMenu(e -> { if (!animator.isRunning()) animator.start(); });
        menu.addEventExit(e -> System.exit(0));
        
        menu.setEvent(index -> {
            if (currentSelectedButton == index) return;
            
            currentSelectedButton = index;
            
            switch (index) {
                case 0 -> {
                    JPanel view = new HomeView();
                    mainPanel.showForm(new ModelChildForm(view, new HomeController((HomeView) view), "Home"));
                }
                
                case 1 -> {
                    JPanel view = new CurrencyView();
                    mainPanel.showForm(new ModelChildForm(view, new CurrencyController((CurrencyView) view), "Currency"));
                }
                
                case 2 -> {
                    JPanel view = new TemperatureView();
                    mainPanel.showForm(new ModelChildForm(view, new TemperatureController((TemperatureView) view), "Temperature"));
                }
                
                case 3 -> {
                    JPanel view = new LengthView();
                    mainPanel.showForm(new ModelChildForm(view, new LengthController((LengthView) view), "Length"));
                }
                
                case 4 -> {
                    JPanel view = new AboutView();
                    mainPanel.showForm(new ModelChildForm(view, new AboutController((AboutView) view), "About"));
                }
                
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
        mainPanel.setMenuHeight(getHeight());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        body = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        body.setBackground(new java.awt.Color(245, 245, 245));

        javax.swing.GroupLayout bodyLayout = new javax.swing.GroupLayout(body);
        body.setLayout(bodyLayout);
        bodyLayout.setHorizontalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 696, Short.MAX_VALUE)
        );
        bodyLayout.setVerticalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 448, Short.MAX_VALUE)
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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel body;
    // End of variables declaration//GEN-END:variables
}

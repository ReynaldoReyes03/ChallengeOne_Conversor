package com.rmr.converter.swing.combobox;

import java.awt.Color;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Rectangle2D;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.border.LineBorder;
import javax.swing.event.PopupMenuEvent;
import javax.swing.event.PopupMenuListener;
import javax.swing.plaf.basic.BasicComboBoxUI;
import javax.swing.plaf.basic.ComboPopup;
import org.jdesktop.animation.timing.Animator;
import org.jdesktop.animation.timing.TimingTarget;
import org.jdesktop.animation.timing.TimingTargetAdapter;

/**
 *
 * @author Reynaldo Martínez Reyes
 */
public class ComboBoxUI extends BasicComboBoxUI {
    
    private Animator animator;
    
    private int animationDuration = 300;
    
    private final ComboBox comboBoxComponent;
    private final ComboBoxPopup comboBoxPopup;
    
    private Color verticalScrollBarThumbColor;
    private Color verticalScrollBarTrackColor;
    private Color horizontalScrollBarThumbColor;
    private Color horizontalScrollBarTrackColor;
    
    private Color labelColor;
    private Color comboPopupBorderColor;
    
    private float location;
    
    private boolean show = true;
    private boolean mouseOver = false;

    public ComboBoxUI(ComboBox comboBoxComponent) {
        this.comboBoxComponent = comboBoxComponent;
        this.labelColor = comboBoxComponent.getNormalColor();
        
        this.comboBoxPopup = new ComboBoxPopup(comboBoxComponent);
        
        addMouseListener();
        addFocusListener();
        addPopupMenuListener();
        configureAnimator();
    }
    
    // <editor-fold defaultstate="collpased" desc="Getters and Setters">
    public void setVerticalScrollBarThumbColor(Color verticalScrollBarThumbColor) {
        this.verticalScrollBarThumbColor = verticalScrollBarThumbColor;
    }

    public void setVerticalScrollBarTrackColor(Color verticalScrollBarTrackColor) {
        this.verticalScrollBarTrackColor = verticalScrollBarTrackColor;
    }

    public void setHorizontalScrollBarThumbColor(Color horizontalScrollBarThumbColor) {
        this.horizontalScrollBarThumbColor = horizontalScrollBarThumbColor;
    }

    public void setHorizontalScrollBarTrackColor(Color horizontalScrollBarTrackColor) {
        this.horizontalScrollBarTrackColor = horizontalScrollBarTrackColor;
    }

    public void setComboPopupBorderColor(Color comboPopupBorderColor) {
        this.comboPopupBorderColor = comboPopupBorderColor;
    }
    // </editor-fold>
    
    private void addMouseListener() {
        comboBoxComponent.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                mouseOver = true;
                comboBoxComponent.repaint();
            }

            @Override
            public void mouseExited(MouseEvent e) {
                mouseOver = false;
                comboBoxComponent.repaint();
            }
        });
    }
    
    private void addFocusListener() {
        comboBoxComponent.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                showing(false);
            }

            @Override
            public void focusLost(FocusEvent e) {
                showing(true);
            }
        });
    }
    
    private void addPopupMenuListener() {
        comboBoxComponent.addPopupMenuListener(new PopupMenuListener() {
            @Override
            public void popupMenuWillBecomeVisible(PopupMenuEvent e) {
                arrowButton.setBackground(comboBoxComponent.getActiveColor());
                
                labelColor = comboBoxComponent.getActiveColor();
            }

            @Override
            public void popupMenuWillBecomeInvisible(PopupMenuEvent e) {
                arrowButton.setBackground(comboBoxComponent.getNormalColor());
                
                labelColor = comboBoxComponent.getNormalColor();
            }

            @Override
            public void popupMenuCanceled(PopupMenuEvent e) {
                arrowButton.setBackground(comboBoxComponent.getNormalColor());
                
                labelColor = comboBoxComponent.getNormalColor();
            }
        });
    }
    
    private void configureAnimator() {
        TimingTarget target = new TimingTargetAdapter() {
            @Override
            public void timingEvent(float fraction) {
                location = fraction;
                comboBoxComponent.repaint();
            }
        };
        
        animator = new Animator(animationDuration, target);
        
        animator.setResolution(0);
        animator.setAcceleration(0.5f);
        animator.setDeceleration(0.5f);
    }
    
    private void configureCustomComboPopup() {
        comboBoxPopup.getVerticalScrollBar().setThumbColor(verticalScrollBarThumbColor);
        comboBoxPopup.getVerticalScrollBar().setTrackColor(verticalScrollBarTrackColor);
        comboBoxPopup.getHorizontalScrollBar().setThumbColor(horizontalScrollBarThumbColor);
        comboBoxPopup.getHorizontalScrollBar().setTrackColor(horizontalScrollBarTrackColor);
        
        comboBoxPopup.setBorder(new LineBorder(comboPopupBorderColor));
    }
    
    private void showing(boolean action) {
        if (animator.isRunning() && animator != null) {
            animator.stop();
        } else {
            location = 1;
        }
        
        animator.setStartFraction(1f - location);
        
        show = action;
        location = 1f - location;
        
        animator.start();
    }
    
    private void createLabel(Graphics2D graphics2D) {
        Insets insets = getInsets();
        FontMetrics fontMetrics = graphics2D.getFontMetrics();
        Rectangle2D fontBounds = fontMetrics.getStringBounds(comboBoxComponent.getLabelText(), graphics2D);
        
        double height = comboBoxComponent.getHeight() - insets.top - insets.bottom;
        double textYPosition = (height - fontBounds.getHeight()) / 2;
        double size = 18;
        
        labelColor = hasFocus || mouseOver ? comboBoxComponent.getActiveColor() : comboBoxComponent.getNormalColor();
        
        graphics2D.setColor(labelColor);
        graphics2D.drawString(comboBoxComponent.getLabelText(), insets.left, (int) (insets.top + textYPosition + fontMetrics.getAscent() - size));
    }
    
    private void createLineStyle(Graphics2D graphics2D) {
        if (!comboBoxComponent.isFocusOwner()) return;
        
        int height = comboBoxComponent.getHeight();
        double width = comboBoxComponent.getWidth() - 4;
        
        double size = width * (show ? 1 - location : location);
        double x = (width - size) / 2;
        
        graphics2D.setColor(comboBoxComponent.getActiveColor());
        graphics2D.fillRect((int) (x + 2), height - 2, (int) size, 2);
    }
    
    // <editor-fold defaultstate="collpased" desc="Override methods">
    @Override
    public void paintCurrentValueBackground(Graphics g, Rectangle bounds, boolean hasFocus) {
        
    }

    @Override
    protected JButton createArrowButton() {
        return new ArrowButton(comboBoxComponent.getNormalColor());
    }

    @Override
    protected ComboPopup createPopup() {
        return comboBoxPopup;
    }

    @Override
    public void paint(Graphics g, JComponent component) {
        super.paint(g, component);
        
        int width = component.getWidth();
        int height = component.getHeight();
        
        Graphics2D graphics2D = (Graphics2D) g;
        
        graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        graphics2D.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_LCD_HRGB);
        graphics2D.setColor(mouseOver ? comboBoxComponent.getActiveColor() : comboBoxComponent.getNormalColor());
        graphics2D.fillRect(2, height - 1, width - 4, 1);
        
        createLabel(graphics2D);
        createLineStyle(graphics2D);
        configureCustomComboPopup();
        
        graphics2D.dispose();
    }
    // </editor-fold>
    
}

package com.rmr.converter.swing;

import java.awt.Color;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.RenderingHints;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Rectangle2D;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import org.jdesktop.animation.timing.Animator;
import org.jdesktop.animation.timing.TimingTarget;
import org.jdesktop.animation.timing.TimingTargetAdapter;

/**
 *
 * @author Reynaldo Martínez Reyes
 */
public class TextField extends JTextField {
    
    private Animator animator;
    
    private int animationDuartion = 300;
    
    private float location;
    
    private boolean linkedActiveAndSelectedColor = true;
    private boolean animateHintText = true;
    private boolean show;
    private boolean mouseOver = false;
    
    private String labelText = "Label";
    
    private Color normalColor = new Color(150, 150, 150);
    private Color activeColor = new Color(151, 20, 255);

    public TextField() {
        init();
        addMouseListener();
        addFocusListener();
        configureAnimator();
    }
    
    // <editor-fold defaultstate="collapsed" desc="Getters and Setters">
    public boolean isLinkedActiveAndSelectedColor() {
        return linkedActiveAndSelectedColor;
    }

    public void setLinkedActiveAndSelectedColor(boolean linkedActiveAndSelectedColor) {
        this.linkedActiveAndSelectedColor = linkedActiveAndSelectedColor;
    }

    public String getLabelText() {
        return labelText;
    }

    public void setLabelText(String labelText) {
        this.labelText = labelText;
    }

    public Color getNormalColor() {
        return normalColor;
    }

    public void setNormalColor(Color normalColor) {
        this.normalColor = normalColor;
    }

    public Color getActiveColor() {
        return activeColor;
    }

    public void setActiveColor(Color activeColor) {
        this.activeColor = activeColor;
        
        if (this.linkedActiveAndSelectedColor) setSelectionColor(activeColor);
    }
    // </editor-fold>
    
    private void init() {
        setBorder(new EmptyBorder(20, 3, 10, 3));
        if (this.isLinkedActiveAndSelectedColor()) setSelectionColor(this.activeColor);
    }
    
    private void addMouseListener() {
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                mouseOver = true;
                repaint();
            }

            @Override
            public void mouseExited(MouseEvent e) {
                mouseOver = false;
                repaint();
            }
        });
    }
    
    private void addFocusListener() {
        addFocusListener(new FocusAdapter() {
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
    
    private void configureAnimator() {
        TimingTarget target = new TimingTargetAdapter() {
            @Override
            public void begin() {
                animateHintText = getText().equals("");
            }

            @Override
            public void timingEvent(float fraction) {
                location = fraction;
                repaint();
            }
        };
                
        animator = new Animator(animationDuartion, target);
        
        animator.setResolution(0);
        animator.setAcceleration(0.5f);
        animator.setDeceleration(0.5f);
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
    
    private void createHintText(Graphics2D graphics2D) {
        Insets insets = getInsets();
        
        Color labelColor = hasFocus() || mouseOver ? activeColor : normalColor;
        
        graphics2D.setColor(labelColor);
        
        FontMetrics fontMetrics = graphics2D.getFontMetrics();
        Rectangle2D labelBounds = fontMetrics.getStringBounds(labelText, graphics2D);
        
        double height = getHeight() - insets.top - insets.bottom;
        double textYPosition = (height - labelBounds.getHeight()) / 2;
        double size;
        
        if (animateHintText) {
            if (show) {
                size = 18 * (1 - location);
            } else {
                size = 18 * location;
            }
        } else {
            size = 18;
        }
        
        graphics2D.drawString(labelText, insets.left, (int) (insets.top + textYPosition + fontMetrics.getAscent() - size));
    }
    
    private void createLineStyle(Graphics2D graphics2D) {
        if (!isFocusOwner()) return;
        
        double width = getWidth() - 4;
        double size = width * (show ? 1 - location : location);
        double x = (width - size) / 2;

        int height = getHeight();

        graphics2D.setColor(activeColor);
        graphics2D.fillRect((int) (x + 2), height - 2, (int) size, 2);
    }
    
    // <editor-fold defaultstate="collapsed" desc="Override methods">
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        
        Graphics2D graphics2D = (Graphics2D) g;
        
        graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        graphics2D.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_LCD_HRGB);
        graphics2D.setColor(mouseOver ? activeColor : normalColor);
        graphics2D.fillRect(2, getHeight() - 1, getWidth() - 4, 1);
        
        createHintText(graphics2D);
        createLineStyle(graphics2D);
        
        graphics2D.dispose();
    }

    @Override
    public void setText(String text) {
        super.setText(text);
    }

    @Override
    public void setSelectionColor(Color color) {
        super.setSelectionColor(color);
        
        if (this.linkedActiveAndSelectedColor) activeColor = color;
    }
    // </editor-fold>
    
}

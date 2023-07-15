package com.rmr.converter.swing.combobox;

import com.rmr.converter.swing.scrollbar.ScrollBar;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.plaf.basic.BasicComboPopup;

/**
 *
 * @author Reynaldo Martínez Reyes
 */
public class ComboBoxPopup extends BasicComboPopup {
    
    private ScrollBar verticalScrollBar;
    private ScrollBar horizontalScrollBar;
    
    public ComboBoxPopup(JComboBox<Object> combo) {
        super(combo);
        
        setBackground(Color.WHITE);
    }
    
    // <editor-fold defaultstate="collapsed" desc="Getters and Setters">
    public ScrollBar getVerticalScrollBar() {
        return verticalScrollBar;
    }

    public ScrollBar getHorizontalScrollBar() {
        return horizontalScrollBar;
    }
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Override methods">
    @Override
    protected JScrollPane createScroller() {
        list.setFixedCellHeight(30);
        
        JScrollPane scrollPane = new JScrollPane(list);
        
        scrollPane.setBackground(Color.WHITE);
        
        verticalScrollBar = new ScrollBar();
        horizontalScrollBar = new ScrollBar();
        
        verticalScrollBar.setUnitIncrement(30);
        horizontalScrollBar.setOrientation(JScrollBar.HORIZONTAL);
        
        scrollPane.setVerticalScrollBar(verticalScrollBar);
        scrollPane.setHorizontalScrollBar(horizontalScrollBar);
        
        return scrollPane;
    }
    // </editor-fold>

}

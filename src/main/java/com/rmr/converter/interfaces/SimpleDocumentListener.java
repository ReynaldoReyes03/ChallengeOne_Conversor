package com.rmr.converter.interfaces;

import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author Reynaldo Martínez Reyes
 */
public interface SimpleDocumentListener extends DocumentListener {
    
    void update(DocumentEvent documentEvent);

    @Override
    default void changedUpdate(DocumentEvent e) {
        update(e);
    }

    @Override
    default void insertUpdate(DocumentEvent e) {
        update(e);
    }

    @Override
    default void removeUpdate(DocumentEvent e) {
        update(e);
    }
    
}

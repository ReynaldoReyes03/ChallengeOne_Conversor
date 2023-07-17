package com.rmr.converter.utilities;

import javax.swing.JComboBox;

/**
 *
 * @author Reynaldo Martínez Reyes
 */
public class ComboBoxUtilities {
    
    public static void swapValues(JComboBox comboBox1, JComboBox comboBox2) {
        Object one = comboBox1.getSelectedItem();
        Object two = comboBox2.getSelectedItem();
        
        comboBox1.setSelectedItem(two);
        comboBox2.setSelectedItem(one);
    }
            
    public static void verifyComboBoxes(JComboBox current, JComboBox other) {
        Object currentValue = current.getSelectedItem();
        Object otherValue = other.getSelectedItem();
        
        int otherIndex = other.getSelectedIndex();
        
        if (currentValue.equals(otherValue)) {
            int itemCount = other.getItemCount();
            int nextItem = otherIndex == itemCount - 1 ? 0 : ++otherIndex;
            
            other.setSelectedIndex(nextItem);
        }
    }
}

package com.rmr.converter.controllers;

import com.rmr.converter.interfaces.IController;
import com.rmr.converter.length.Length;
import com.rmr.converter.length.LengthUnit;
import com.rmr.converter.models.LengthModel;
import com.rmr.converter.swing.combobox.ComboBox;
import com.rmr.converter.utilities.ComboBoxUtilities;
import com.rmr.converter.utilities.Regex;
import com.rmr.converter.views.LengthView;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 *
 * @author Reynaldo Martínez Reyes
 */
public class LengthController implements IController, ItemListener {

    private final LengthView view;
    private final LengthModel model;

    public LengthController(LengthView view) {
        this.view = view;
        this.model  = new LengthModel();
    }
    
    @Override
    public void init() {
        view.button_convert.addActionListener(this::convertLength);
        view.button_swap.addActionListener(this::swapValues);
        
        view.comboBox_from.addItemListener(this);
        view.comboBox_to.addItemListener(this);
        
        view.comboBox_from.setModel(model.getLengthUnitsModel());
        view.comboBox_to.setModel(model.getLengthUnitsModel());
        
        ComboBoxUtilities.verifyComboBoxes(view.comboBox_from, view.comboBox_to);
        
        clearLabels();
    }

    private void convertLength(ActionEvent evt) {
        String value = view.textfield_value.getText().trim();
        
        if (!value.equals("") && Regex.validateScientificNotation(value)) {
            LengthUnit from = (LengthUnit) view.comboBox_from.getSelectedItem();
            LengthUnit to = (LengthUnit) view.comboBox_to.getSelectedItem();
            
            Length lengthConverted = model.convert(from, to, value);
            Length lengthInfo = model.convert(from, to, "1");
            
            view.label_from.setText(value + " " + from.getPluralName());
            view.label_to.setText(lengthConverted.toString());
            view.label_info.setText(1 + " " + from.getSymbol() + " = " + lengthInfo.getValue() + " " + lengthInfo.getUnit().getSymbol());
        } else {
            System.err.println("Error");
        }
    }
    
    private void swapValues(ActionEvent evt) {
        ComboBoxUtilities.swapValues(view.comboBox_from, view.comboBox_to);
        clearLabels();
    }
    
    private void clearLabels() {
        view.label_from.setText("");
        view.label_to.setText("");
        view.label_info.setText("");
    }

    // <editor-fold defaultstate="collapsed" desc="Override methods">
    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getStateChange() ==  ItemEvent.SELECTED) {
            ComboBox source = (ComboBox) e.getSource();
            
            if (!source.isFocusOwner()) return;
            
            if (source == view.comboBox_from) {
                ComboBoxUtilities.verifyComboBoxes(view.comboBox_from, view.comboBox_to);
            } else if (source == view.comboBox_to) {
                ComboBoxUtilities.verifyComboBoxes(view.comboBox_to, view.comboBox_from);
            }
            
            clearLabels();
        }
    }
    // </editor-fold>
    
}

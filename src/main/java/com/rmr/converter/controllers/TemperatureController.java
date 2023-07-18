package com.rmr.converter.controllers;

import com.rmr.converter.interfaces.IController;
import com.rmr.converter.models.TemperatureModel;
import com.rmr.converter.swing.combobox.ComboBox;
import com.rmr.converter.temperature.Temperature;
import com.rmr.converter.temperature.TemperatureUnit;
import com.rmr.converter.utilities.ComboBoxUtilities;
import com.rmr.converter.utilities.Regex;
import com.rmr.converter.views.TemperatureView;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 *
 * @author Reynaldo Martínez Reyes
 */
public class TemperatureController implements IController, ItemListener {

    public TemperatureView view;
    private final TemperatureModel model;

    public TemperatureController(TemperatureView view) {
        this.view = view;
        this.model = new TemperatureModel();
    }
    
    @Override
    public void init() {
        view.button_convert.addActionListener(this::convertTemperature);
        view.button_swap.addActionListener(this::swapValues);
        
        view.comboBox_from.addItemListener(this);
        view.comboBox_to.addItemListener(this);
        
        view.comboBox_from.setModel(model.getTemperataureUnitsModel());
        view.comboBox_to.setModel(model.getTemperataureUnitsModel());
        
        ComboBoxUtilities.verifyComboBoxes(view.comboBox_from, view.comboBox_to);
        
        clearLabels();
    }
    
    private void convertTemperature(ActionEvent evt) {
        String value = view.textfield_value.getText().trim();
        
        if (!value.equals("") && Regex.validateSignedScientificNotation(value)) {
            TemperatureUnit from = (TemperatureUnit) view.comboBox_from.getSelectedItem();
            TemperatureUnit to = (TemperatureUnit) view.comboBox_to.getSelectedItem();
            
            Temperature temperatureConverted = model.convert(from, to, value);
            Temperature temperatureInfo = model.convert(from, to, "1");
            
            view.label_from.setText(value + " " + from.getName());
            view.label_to.setText(temperatureConverted.toString());
            view.label_info.setText(1 + " " + from.getSymbol() + " = " + temperatureInfo.getValue() + " " + temperatureInfo.getUnit().getSymbol());
        } else {
            System.err.println("Error");
        }
    }
    
    private void swapValues(ActionEvent evt) {
        ComboBoxUtilities.swapValues(view.comboBox_from, view.comboBox_to);
    }
    
    private void clearLabels() {
        view.label_from.setText("");
        view.label_to.setText("");
        view.label_info.setText("");
    }

    
    // <editor-fold defaultstate="collapsed" desc="Override methods">
    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getStateChange() == ItemEvent.SELECTED) {
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

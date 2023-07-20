package com.rmr.converter.controllers;

import com.rmr.converter.interfaces.IController;
import com.rmr.converter.interfaces.SimpleDocumentListener;
import com.rmr.converter.length.Length;
import com.rmr.converter.length.LengthUnit;
import com.rmr.converter.models.LengthModel;
import com.rmr.converter.swing.combobox.ComboBox;
import com.rmr.converter.utilities.ComboBoxUtilities;
import com.rmr.converter.utilities.FontLoader;
import com.rmr.converter.utilities.Regex;
import com.rmr.converter.views.LengthView;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.event.DocumentEvent;

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
        setTextFieldDocumentListener();
        initButtons();
        initComboBoxes();
        clearLabels("Your conversion will appear here");
    }

    @Override
    public void updateFont() {
        view.textfield_value.setFont(FontLoader.getRegularMediumFont());
        view.comboBox_from.setFont(FontLoader.getRegularMediumFont());
        view.comboBox_to.setFont(FontLoader.getRegularMediumFont());
        view.button_convert.setFont(FontLoader.getBoldSmallFont());
        view.label_alert.setFont(FontLoader.getBoldBigFont());
        view.label_base.setFont(FontLoader.getRegularMediumFont());
        view.label_result.setFont(FontLoader.getBoldMediumFont());
        view.label_description.setFont(FontLoader.getRegularSmallFont());
    }
    
    private void setTextFieldDocumentListener() {
        view.textfield_value.getDocument().addDocumentListener((SimpleDocumentListener) (DocumentEvent documentEvent) -> {
            String value = view.textfield_value.getText();
            
            if (value.equals("")) {
                clearLabels("Your conversion will appear here");
            } else if (value.trim().equals("") || !Regex.validateSignedScientificNotation(value)) {
                clearLabels("Invalid value to convert");
            } else {
                clearLabels("Your conversion will appear here");
            }
        });
    }
    
    private void initButtons() {
        view.button_convert.addActionListener(this::convertLength);
        view.button_swap.addActionListener(this::swapValues);
    }
    
    private void initComboBoxes() {
        view.comboBox_from.addItemListener(this);
        view.comboBox_to.addItemListener(this);
        
        view.comboBox_from.setModel(model.getLengthUnitsModel());
        view.comboBox_to.setModel(model.getLengthUnitsModel());
        
        ComboBoxUtilities.verifyComboBoxes(view.comboBox_from, view.comboBox_to);
    }

    private void convertLength(ActionEvent evt) {
        String value = view.textfield_value.getText().trim();
        
        if (!value.equals("") && Regex.validateScientificNotation(value)) {
            LengthUnit from = (LengthUnit) view.comboBox_from.getSelectedItem();
            LengthUnit to = (LengthUnit) view.comboBox_to.getSelectedItem();
            
            Length lengthConverted = model.convert(from, to, value);
            Length lengthInfo = model.convert(from, to, "1");
            
            showLabels(true);
            
            view.label_base.setText(value + " " + (value.equals("1")  ? from.getSingularName() : from.getPluralName()));
            view.label_result.setText(lengthConverted.toString());
            view.label_description.setText(1 + " " + from.getSymbol() + " = " + lengthInfo.getValue() + " " + lengthInfo.getUnit().getSymbol());
        } else {
            clearLabels("Invalid value to convert");
        }
    }
    
    private void swapValues(ActionEvent evt) {
        ComboBoxUtilities.swapValues(view.comboBox_from, view.comboBox_to);
        clearLabels("Your conversion will appear here");
    }
    
    private void clearLabels(String alert) {
        view.label_alert.setText(alert);
        showLabels(false);
    }
    
    private void showLabels(boolean active) {
        view.label_base.setVisible(active);
        view.label_result.setVisible(active);
        view.label_description.setVisible(active);
        
        view.label_alert.setVisible(!active);
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
            
            clearLabels("Your conversion will appear here");
        }
    }
    // </editor-fold>
    
}

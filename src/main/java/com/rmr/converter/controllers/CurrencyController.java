package com.rmr.converter.controllers;

import com.rmr.converter.currency.Currency;
import com.rmr.converter.currency.PairConversion;
import com.rmr.converter.interfaces.IController;
import com.rmr.converter.models.CurrencyModel;
import com.rmr.converter.swing.combobox.ComboBox;
import com.rmr.converter.utilities.ComboBoxUtilities;
import com.rmr.converter.utilities.Regex;
import com.rmr.converter.views.CurrencyView;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 *
 * @author Reynaldo Martínez Reyes
 */
public class CurrencyController implements IController, ItemListener {

    private CurrencyView view;
    private CurrencyModel model;

    public CurrencyController(CurrencyView view) {
        this.view = view;
        this.model = new CurrencyModel();
    }
    
    @Override
    public void init() {
        view.button_convert.addActionListener(this::convertCurrency);
        view.button_swap.addActionListener(this::swapValues);
        
        view.comboBox_from.addItemListener(this);
        view.comboBox_to.addItemListener(this);
        
        view.comboBox_from.setModel(model.getCurrenciesModel());
        view.comboBox_to.setModel(model.getCurrenciesModel());
        
        ComboBoxUtilities.verifyComboBoxesByIndex(view.comboBox_from, view.comboBox_to);
        
        clearLabels();
    }
    
    private void convertCurrency(ActionEvent evt) {
        String value = view.textfield_value.getText().trim();
        
        if (!value.equals("") && (Regex.validateInteger(value) || Regex.validateDecimalNumber(value))) {
            Currency base = (Currency) view.comboBox_from.getSelectedItem();
            Currency target = (Currency) view.comboBox_to.getSelectedItem();
            
            String baseCode = base.getCode();
            String targetCode = target.getCode();
            
            PairConversion conversion = model.pairConversion(baseCode, targetCode, value);
            
            view.label_from.setText(value + " " + base.getName());
            view.label_to.setText(conversion.getConversionResult()+ " " + target.getName());
            view.label_info.setText(1 + " " + conversion.getBaseCode() + " = " + conversion.getConversionRate() + " " + conversion.getTargetCode());
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
        view.label_date.setText("");
    }

    // <editor-fold defaultstate="collapsed" desc="Override methods">
    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getStateChange() == ItemEvent.SELECTED) {
            ComboBox source = (ComboBox) e.getSource();
            
            if (!source.isFocusOwner()) return;
            
            if (source == view.comboBox_from) {
                ComboBoxUtilities.verifyComboBoxesByIndex(view.comboBox_from, view.comboBox_to);
            } else if (source == view.comboBox_to) {
                ComboBoxUtilities.verifyComboBoxesByIndex(view.comboBox_to, view.comboBox_from);
            }
            
            clearLabels();
        }
    }
    // </editor-fold>
    
}

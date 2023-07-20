package com.rmr.converter.controllers;

import com.rmr.converter.currency.Currency;
import com.rmr.converter.currency.PairConversion;
import com.rmr.converter.interfaces.IController;
import com.rmr.converter.interfaces.SimpleDocumentListener;
import com.rmr.converter.models.CurrencyModel;
import com.rmr.converter.swing.combobox.ComboBox;
import com.rmr.converter.utilities.ComboBoxUtilities;
import com.rmr.converter.utilities.FontLoader;
import com.rmr.converter.utilities.Regex;
import com.rmr.converter.views.CurrencyView;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.event.DocumentEvent;

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
        view.label_lastUpdate.setFont(FontLoader.getRegularSmallFont());
        view.label_nextUpdate.setFont(FontLoader.getRegularSmallFont());
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
        view.button_convert.addActionListener(this::convertCurrency);
        view.button_swap.addActionListener(this::swapValues);
    }
    
    private void initComboBoxes() {
        view.comboBox_from.addItemListener(this);
        view.comboBox_to.addItemListener(this);
        
        view.comboBox_from.setModel(model.getCurrenciesModel());
        view.comboBox_to.setModel(model.getCurrenciesModel());
        
        ComboBoxUtilities.verifyComboBoxesByIndex(view.comboBox_from, view.comboBox_to);
    }
    
    private void convertCurrency(ActionEvent evt) {
        String value = view.textfield_value.getText().trim();
        
        if (!value.equals("") && (Regex.validateInteger(value) || Regex.validateDecimalNumber(value))) {
            Currency base = (Currency) view.comboBox_from.getSelectedItem();
            Currency target = (Currency) view.comboBox_to.getSelectedItem();
            
            String baseCode = base.getCode();
            String targetCode = target.getCode();
            
            PairConversion conversion = model.pairConversion(baseCode, targetCode, value);
            
            showLabels(true);
            
            view.label_base.setText(value + " " + base.getName());
            view.label_result.setText(conversion.getConversionResult()+ " " + target.getName());
            view.label_description.setText(1 + " " + conversion.getBaseCode() + " = " + conversion.getConversionRate() + " " + conversion.getTargetCode());
            view.label_lastUpdate.setText("Last update...");
            view.label_nextUpdate.setText("Next update...");
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
        view.label_lastUpdate.setVisible(active);
        view.label_nextUpdate.setVisible(active);
        
        view.label_alert.setVisible(!active);
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
            
            clearLabels("Your conversion will appear here");
        }
    }
    // </editor-fold>
    
}

package com.rmr.converter.models;

import com.rmr.converter.currency.APIResponse;
import com.rmr.converter.currency.FetchExchangeRateAPI;
import com.rmr.converter.currency.PairConversion;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author Reynaldo Martínez Reyes
 */
public class CurrencyModel {
    
    private static APIResponse apiResponse;
    
    public static void loadAPIResponse() {
        apiResponse = FetchExchangeRateAPI.getAll("https://v6.exchangerate-api.com/v6/codes");
    }
    
    public DefaultComboBoxModel getCurrenciesModel() {
        return new DefaultComboBoxModel<>(apiResponse.getSupportedCodes().toArray());
    }
    
    public PairConversion pairConversion(String baseCode, String targetCode, String amount) {
        final String URL = "https://v6.exchangerate-api.com/v6/pair/" + baseCode + "/" + targetCode + "/" + amount;
        
        return FetchExchangeRateAPI.pairConversion(URL);
    }
    
}

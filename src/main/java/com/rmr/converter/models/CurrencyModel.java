package com.rmr.converter.models;

import com.rmr.converter.currency.models.APIResponse;
import com.rmr.converter.currency.models.Currency;
import com.rmr.converter.currency.FetchExchangeRateAPI;
import com.rmr.converter.currency.models.PairConversion;
import java.util.List;
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
        List<Currency> supportedCodes = apiResponse.getSupportedCodes();
        
        supportedCodes.sort((o1, o2) -> o1.compareTo(o2));
        
        return new DefaultComboBoxModel<>(supportedCodes.toArray());
    }
    
    public PairConversion pairConversion(String baseCode, String targetCode, String amount) {
        final String URL = "https://v6.exchangerate-api.com/v6/pair/" + baseCode + "/" + targetCode + "/" + amount;
        
        return FetchExchangeRateAPI.pairConversion(URL);
    }
    
}

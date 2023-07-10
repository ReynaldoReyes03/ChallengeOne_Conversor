package com.rmr.converter.currency;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Reynaldo Martínez Reyes
 */
public class APIResponse {
    
    private String result;
    
    @JsonProperty("supported_codes")
    private List<Currency> supportedCodes;
    
    @JsonProperty("error-type")
    private String errorType;

    public APIResponse() {
        this.supportedCodes = new ArrayList<>();
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public List<Currency> getSupportedCodes() {
        return supportedCodes;
    }

    public void setSupportedCodes(List<String[]> supportedCodes) {
        supportedCodes.forEach(supportedCode -> this.supportedCodes.add(new Currency(supportedCode)));
    }

    public String getErrorType() {
        return errorType;
    }

    public void setErrorType(String errorType) {
        this.errorType = errorType;
    }
    
}

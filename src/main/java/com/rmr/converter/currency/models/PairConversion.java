package com.rmr.converter.currency.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;

/**
 *
 * @author Reynaldo Martínez Reyes
 */
public class PairConversion {
    
    private String result;
    
    @JsonProperty("base_code")
    private String baseCode;
    
    @JsonProperty("target_code")
    private String targetCode;
    
    @JsonProperty("conversion_rate")
    private BigDecimal conversionRate;
    
    @JsonProperty("conversion_result")
    private BigDecimal conversionResult;
    
    @JsonProperty("time_last_update_unix")
    private Long lastUpdate;
    
    @JsonProperty("time_next_update_unix")
    private Long nextUpdate;
    
    @JsonProperty("error-type")
    private String errorType;

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getBaseCode() {
        return baseCode;
    }

    public void setBaseCode(String baseCode) {
        this.baseCode = baseCode;
    }

    public String getTargetCode() {
        return targetCode;
    }

    public void setTargetCode(String targetCode) {
        this.targetCode = targetCode;
    }

    public BigDecimal getConversionRate() {
        return conversionRate;
    }

    public void setConversionRate(String conversionRate) {
        this.conversionRate = new BigDecimal(conversionRate);
    }

    public BigDecimal getConversionResult() {
        return conversionResult;
    }

    public void setConversionResult(String conversionResult) {
        this.conversionResult = new BigDecimal(conversionResult);
    }

    public Long getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(String lastUpdate) {
        this.lastUpdate = Long.valueOf(lastUpdate);
    }

    public Long getNextUpdate() {
        return nextUpdate;
    }

    public void setNextUpdate(String nextUpdate) {
        this.nextUpdate = Long.valueOf(nextUpdate);
    }

    public String getErrorType() {
        return errorType;
    }

    public void setErrorType(String errorType) {
        this.errorType = errorType;
    }
    
}

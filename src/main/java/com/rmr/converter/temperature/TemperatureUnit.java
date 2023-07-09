package com.rmr.converter.temperature;

/**
 *
 * @author Reynaldo Martínez Reyes
 */
public enum TemperatureUnit {
    
    CELSIUS("°C", "Celsius"),
    FARENHEIT("°F", "Farenheit"),
    KELVIN("K", "Kelvin");
    
    private String symbol;
    private String name;
    
    private TemperatureUnit(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return getName();
    }
}

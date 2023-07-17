package com.rmr.converter.temperature;

import com.rmr.converter.temperature.units.Celsius;
import com.rmr.converter.temperature.units.Farenheit;
import com.rmr.converter.temperature.units.Kelvin;

/**
 *
 * @author Reynaldo Martínez Reyes
 */
public abstract class Temperature {

    protected Double value;
    
    private TemperatureUnit unit;

    public Temperature(Double value, TemperatureUnit unit) {
        this.value = value;
        this.unit = unit;
    }
    
    public Double getValue() {
        return value;
    }
    
    public TemperatureUnit getUnit() {
        return unit;
    }

    public abstract Celsius toCelsius();

    public abstract Farenheit toFarenheit();

    public abstract Kelvin toKelvin();

    @Override
    public String toString() {
        return value + " " + unit.getSymbol();
    }
    
}

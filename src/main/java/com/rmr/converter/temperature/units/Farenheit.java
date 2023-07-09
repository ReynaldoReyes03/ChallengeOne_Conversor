package com.rmr.converter.temperature.units;

import com.rmr.converter.temperature.Temperature;
import com.rmr.converter.temperature.TemperatureUnit;

/**
 *
 * @author Reynaldo Martínez Reyes
 */
public class Farenheit extends Temperature {

    public Farenheit(Double value) {
        super(value, TemperatureUnit.FARENHEIT);
    }

    @Override
    public Celsius toCelsius() {
        return new Celsius((this.value - 32) * 5 / 9);
    }

    @Override
    public Farenheit toFarenheit() {
        return this;
    }

    @Override
    public Kelvin toKelvin() {
        return new Kelvin((this.value - 32) * 5 / 9 + 273.15);
    }

    @Override
    public String toString() {
        return this.value + " " + this.getUnit().getSymbol();
    }
    
}

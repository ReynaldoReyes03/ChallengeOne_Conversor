package com.rmr.converter.temperature.units;

import com.rmr.converter.temperature.Temperature;
import com.rmr.converter.temperature.TemperatureUnit;

/**
 *
 * @author Reynaldo Martínez Reyes
 */
public class Kelvin extends Temperature {
    
    public Kelvin(Double value) {
        super(value, TemperatureUnit.KELVIN);
    }

    @Override
    public Celsius toCelsius() {
        return new Celsius(this.value - 273.15);
    }

    @Override
    public Farenheit toFarenheit() {
        return new Farenheit((this.value - 273.15) * 9 / 5 + 32);
    }

    @Override
    public Kelvin toKelvin() {
        return this;
    }

    @Override
    public String toString() {
        return this.value + " " + this.getUnit().getSymbol();
    }
    
}

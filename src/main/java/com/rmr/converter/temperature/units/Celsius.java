package com.rmr.converter.temperature.units;

import com.rmr.converter.temperature.Temperature;
import com.rmr.converter.temperature.TemperatureUnit;

/**
 *
 * @author Reynaldo Martínez Reyes
 */
public class Celsius extends Temperature {

    public Celsius(Double value) {
        super(value, TemperatureUnit.CELSIUS);
    }

    @Override
    public Celsius toCelsius() {
        return this;
    }

    @Override
    public Farenheit toFarenheit() {
        return new Farenheit(this.value * 9 / 5 + 32);
    }

    @Override
    public Kelvin toKelvin() {
        return new Kelvin(this.value + 273.15);
    }
    
}

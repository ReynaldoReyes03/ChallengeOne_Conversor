/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rmr.converter.models;

import com.rmr.converter.temperature.Temperature;
import com.rmr.converter.temperature.TemperatureUnit;
import com.rmr.converter.temperature.units.*;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author Reynaldo Martínez Reyes
 */
public class TemperatureModel {
    
    public DefaultComboBoxModel getTemperataureUnitsModel() {
        return new DefaultComboBoxModel<>(TemperatureUnit.values());
    }
    
    public Temperature convert(TemperatureUnit temperatureFrom, TemperatureUnit temperatureTo, String  temperatureValue) {
        Temperature from, to;
        
        Double value = Double.valueOf(temperatureValue);
        
        switch (temperatureFrom) {
            case CELSIUS -> from = new Celsius(value);
            case FARENHEIT -> from = new Farenheit(value);
            case KELVIN -> from = new Kelvin(value);
            default -> throw new AssertionError();
        }

        switch (temperatureTo) {
            case CELSIUS -> to = from.toCelsius();
            case FARENHEIT -> to = from.toFarenheit();
            case KELVIN -> to = from.toKelvin();
            default -> throw new AssertionError();
        }
        
        return to;
    }
    
}

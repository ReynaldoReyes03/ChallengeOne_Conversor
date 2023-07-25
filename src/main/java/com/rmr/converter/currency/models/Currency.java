package com.rmr.converter.currency.models;

/**
 *
 * @author Reynaldo Martínez Reyes
 */
public class Currency implements Comparable<Currency> {
    
    private String code;
    private String name;

    public Currency(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public Currency(String[] data) {
        this.code = data[0];
        this.name = data[1];
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public int compareTo(Currency other) {
        return this.name.compareToIgnoreCase(other.getName());
    }
    
}

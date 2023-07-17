package com.rmr.converter.length;

/**
 *
 * @author Reynaldo Martínez Reyes
 */
public enum LengthUnit {
    
    CENTIMETRE("cm", "Centimeter", "Centimeters"),
    DECAMETRE("dam", "Decameter", "Decameters"),
    DECIMETRE("dm", "Decimeter", "Decimeters"),
    FATHOM("ftm", "Fathom", "Fathoms"),
    FOOT("ft", "Foot", "Feet"),
    FURLONG("fur", "Furlong", "Furlongs"),
    HECTOMETRE("hm", "Hectometer", "Hectometers"),
    INCH("in", "Inch", "Inches"),
    KILOMETRE("km", "Kilometer", "Kilometers"),
    METRE("m", "Metre", "Metres"),
    MICROMETRE("μm", "Micrometre", "Micrometres"),
    MILE("mi", "Mile", "Miles"),
    MILLIMETRE("mm", "Millimeter", "Millimeters"),
    NANOMETRE("nm", "Nanometre", "Nanometres"),
    NAUTICAL_MILE("nmi", "Nautical mile", "Nautical miles"),
    PICOMETRE("pm", "Picometre", "Picometres"),
    ROD("rd", "Rod", "Rods"),
    YARD("yd", "Yard", "Yards");
    
    private String symbol;
    private String singularName;
    private String pluralName;
    
    private LengthUnit(String symbol, String singularName, String pluralName) {
        this.symbol = symbol;
        this.singularName = singularName;
        this.pluralName = pluralName;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getSingularName() {
        return singularName;
    }

    public String getPluralName() {
        return pluralName;
    }

    @Override
    public String toString() {
        return singularName;
    }
    
}

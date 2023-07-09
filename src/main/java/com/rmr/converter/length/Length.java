package com.rmr.converter.length;

import com.rmr.converter.length.units.*;

/**
 *
 * @author Reynaldo Martínez Reyes
 */
public abstract class Length {
    
    protected Double value;
    
    private LengthUnit unit;
    
    public Length(Double value, LengthUnit unit) {
        this.value = value;
        this.unit = unit;
    }
    
    public Length(Integer value, LengthUnit unit) {
        this.value = Double.valueOf(value.toString());
        this.unit = unit;
    }
    
    public LengthUnit getUnit() {
        return unit;
    }
    
    public abstract Picometre toPicometre();
    
    public abstract Nanometre toNanometre();
    
    public abstract Micrometre toMicrometre();
    
    public abstract Millimetre toMillimetre();
    
    public abstract Centimetre toCentimetre();
    
    public abstract Decimetre toDecimetre();
    
    public abstract Metre toMetre();
    
    public abstract Decametre toDecametre();
    
    public abstract Hectometre toHectometre();
    
    public abstract Kilometre toKilometre();
    
    public abstract Inch toInch();
    
    public abstract Foot toFoot();
    
    public abstract Yard toYard();
    
    public abstract Mile toMile();
    
    public abstract NauticalMile toNauticalMile();
    
    public abstract Rod toRod();
    
    public abstract Fathom toFathom();
    
    public abstract Furlong toFurlong();
}

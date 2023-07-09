package com.rmr.converter.length.units;

import com.rmr.converter.length.Length;
import com.rmr.converter.length.LengthUnit;

/**
 *
 * @author Reynaldo Martínez Reyes
 */
public class Furlong extends Length {

    public Furlong(Double value) {
        super(value, LengthUnit.FURLONG);
    }
    
    @Override
    public Picometre toPicometre() {
        return new Picometre(this.value * 201168E9);
    }

    @Override
    public Nanometre toNanometre() {
        return new Nanometre(this.value * 201168E6);
    }

    @Override
    public Micrometre toMicrometre() {
        return new Micrometre(this.value * 201168E3);
    }

    @Override
    public Millimetre toMillimetre() {
        return new Millimetre(this.value * 201168);
    }

    @Override
    public Centimetre toCentimetre() {
        return new Centimetre(this.value * 201168E-1);
    }

    @Override
    public Decimetre toDecimetre() {
        return new Decimetre(this.value * 201168E-2);
    }

    @Override
    public Metre toMetre() {
        return new Metre(this.value * 201168E-3);
    }

    @Override
    public Decametre toDecametre() {
        return new Decametre(this.value * 201168E-4);
    }

    @Override
    public Hectometre toHectometre() {
        return new Hectometre(this.value * 201168E-5);
    }

    @Override
    public Kilometre toKilometre() {
        return new Kilometre(this.value * 201168E-6);
    }

    @Override
    public Inch toInch() {
        return new Inch(this.value * 7920);
    }

    @Override
    public Foot toFoot() {
        return new Foot(this.value * 660);
    }

    @Override
    public Yard toYard() {
        return new Yard(this.value * 220);
    }

    @Override
    public Mile toMile() {
        return new Mile(this.value / 8);
    }

    @Override
    public NauticalMile toNauticalMile() {
        return new NauticalMile(this.value / 9.206);
    }

    @Override
    public Rod toRod() {
        return new Rod(this.value * 40);
    }

    @Override
    public Fathom toFathom() {
        return new Fathom(this.value * 110);
    }

    @Override
    public Furlong toFurlong() {
        return this;
    }
}

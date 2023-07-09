package com.rmr.converter.length.units;

import com.rmr.converter.length.Length;
import com.rmr.converter.length.LengthUnit;

/**
 *
 * @author Reynaldo Martínez Reyes
 */
public class Decimetre extends Length {
    
    public Decimetre(Double value) {
        super(value, LengthUnit.DECIMETRE);
    }

    @Override
    public Picometre toPicometre() {
        return new Picometre(this.value * 1E11);
    }

    @Override
    public Nanometre toNanometre() {
        return new Nanometre(this.value * 1E8);
    }

    @Override
    public Micrometre toMicrometre() {
        return new Micrometre(this.value * 1E5);
    }

    @Override
    public Millimetre toMillimetre() {
        return new Millimetre(this.value * 1E2);
    }

    @Override
    public Centimetre toCentimetre() {
        return new Centimetre(this.value * 1E1);
    }

    @Override
    public Decimetre toDecimetre() {
        return this;
    }

    @Override
    public Metre toMetre() {
        return new Metre(this.value * 1E-1);
    }

    @Override
    public Decametre toDecametre() {
        return new Decametre(this.value * 1E-2);
    }

    @Override
    public Hectometre toHectometre() {
        return new Hectometre(this.value * 1E-3);
    }

    @Override
    public Kilometre toKilometre() {
        return new Kilometre(this.value * 1E-4);
    }

    @Override
    public Inch toInch() {
        return new Inch(this.value * 3.937007874);
    }

    @Override
    public Foot toFoot() {
        return new Foot(this.value / 3.048);
    }

    @Override
    public Yard toYard() {
        return new Yard(this.value / 9.144);
    }

    @Override
    public Mile toMile() {
        return new Mile(this.value / 16090);
    }

    @Override
    public NauticalMile toNauticalMile() {
        return new NauticalMile(this.value / 18520);
    }

    @Override
    public Rod toRod() {
        return new Rod(this.value / 50.292);
    }

    @Override
    public Fathom toFathom() {
        return new Fathom(this.value / 18.288);
    }

    @Override
    public Furlong toFurlong() {
        return new Furlong(this.value / 2012);
    }
}

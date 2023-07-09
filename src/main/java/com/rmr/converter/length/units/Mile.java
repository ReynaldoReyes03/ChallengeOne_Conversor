package com.rmr.converter.length.units;

import com.rmr.converter.length.Length;
import com.rmr.converter.length.LengthUnit;

/**
 *
 * @author Reynaldo Martínez Reyes
 */
public class Mile extends Length {

    public Mile(Double value) {
        super(value, LengthUnit.MILE);
    }

    @Override
    public Picometre toPicometre() {
        return new Picometre(this.value * 1.60934E15);
    }

    @Override
    public Nanometre toNanometre() {
        return new Nanometre(this.value * 1.60934E12);
    }

    @Override
    public Micrometre toMicrometre() {
        return new Micrometre(this.value * 1.60934E9);
    }

    @Override
    public Millimetre toMillimetre() {
        return new Millimetre(this.value * 1.60934E6);
    }

    @Override
    public Centimetre toCentimetre() {
        return new Centimetre(this.value * 1.60934E5);
    }

    @Override
    public Decimetre toDecimetre() {
        return new Decimetre(this.value * 1.60934E4);
    }

    @Override
    public Metre toMetre() {
        return new Metre(this.value * 1.60934E3);
    }

    @Override
    public Decametre toDecametre() {
        return new Decametre(this.value * 1.60934E2);
    }

    @Override
    public Hectometre toHectometre() {
        return new Hectometre(this.value * 1.60934E1);
    }

    @Override
    public Kilometre toKilometre() {
        return new Kilometre(this.value * 1.60934);
    }

    @Override
    public Inch toInch() {
        return new Inch(this.value * 63360);
    }

    @Override
    public Foot toFoot() {
        return new Foot(this.value * 5280);
    }

    @Override
    public Yard toYard() {
        return new Yard(this.value * 1760);
    }

    @Override
    public Mile toMile() {
        return this;
    }

    @Override
    public NauticalMile toNauticalMile() {
        return new NauticalMile(this.value / 1.151);
    }

    @Override
    public Rod toRod() {
        return new Rod(this.value * 320);
    }

    @Override
    public Fathom toFathom() {
        return new Fathom(this.value * 880);
    }

    @Override
    public Furlong toFurlong() {
        return new Furlong(this.value * 8);
    }
}

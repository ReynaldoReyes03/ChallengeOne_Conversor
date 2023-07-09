package com.rmr.converter.length.units;

import com.rmr.converter.length.Length;
import com.rmr.converter.length.LengthUnit;

/**
 *
 * @author Reynaldo Martínez Reyes
 */
public class Yard extends Length {

    public Yard(Double value) {
        super(value, LengthUnit.YARD);
    }

    @Override
    public Picometre toPicometre() {
        return new Picometre(this.value * 9.144E11);
    }

    @Override
    public Nanometre toNanometre() {
        return new Nanometre(this.value * 9.144E8);
    }

    @Override
    public Micrometre toMicrometre() {
        return new Micrometre(this.value * 9.144E5);
    }

    @Override
    public Millimetre toMillimetre() {
        return new Millimetre(this.value * 9.144E2);
    }

    @Override
    public Centimetre toCentimetre() {
        return new Centimetre(this.value * 9.144E1);
    }

    @Override
    public Decimetre toDecimetre() {
        return new Decimetre(this.value * 9.144);
    }

    @Override
    public Metre toMetre() {
        return new Metre(this.value / 1.0936);
    }

    @Override
    public Decametre toDecametre() {
        return new Decametre(this.value / 10.936);
    }

    @Override
    public Hectometre toHectometre() {
        return new Hectometre(this.value / 109.36);
    }

    @Override
    public Kilometre toKilometre() {
        return new Kilometre(this.value / 1093.6);
    }

    @Override
    public Inch toInch() {
        return new Inch(this.value * 36);
    }

    @Override
    public Foot toFoot() {
        return new Foot(this.value * 3);
    }

    @Override
    public Yard toYard() {
        return this;
    }

    @Override
    public Mile toMile() {
        return new Mile(this.value / 1760);
    }

    @Override
    public NauticalMile toNauticalMile() {
        return new NauticalMile(this.value / 2025);
    }

    @Override
    public Rod toRod() {
        return new Rod(this.value / 5.5);
    }

    @Override
    public Fathom toFathom() {
        return new Fathom(this.value / 2);
    }

    @Override
    public Furlong toFurlong() {
        return new Furlong(this.value / 220);
    }
}

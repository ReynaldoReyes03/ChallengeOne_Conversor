package com.rmr.converter.length.units;

import com.rmr.converter.length.Length;
import com.rmr.converter.length.LengthUnit;

/**
 *
 * @author Reynaldo Martínez Reyes
 */
public class Metre extends Length {

    public Metre(Double value) {
        super(value, LengthUnit.METRE);
    }

    @Override
    public Picometre toPicometre() {
        return new Picometre(this.value * 1E12);
    }

    @Override
    public Nanometre toNanometre() {
        return new Nanometre(this.value * 1E9);
    }

    @Override
    public Micrometre toMicrometre() {
        return new Micrometre(this.value * 1E6);
    }

    @Override
    public Millimetre toMillimetre() {
        return new Millimetre(this.value * 1E3);
    }

    @Override
    public Centimetre toCentimetre() {
        return new Centimetre(this.value * 1E2);
    }

    @Override
    public Decimetre toDecimetre() {
        return new Decimetre(this.value * 1E1);
    }

    @Override
    public Metre toMetre() {
        return this;
    }

    @Override
    public Decametre toDecametre() {
        return new Decametre(this.value * 1E-1);
    }

    @Override
    public Hectometre toHectometre() {
        return new Hectometre(this.value * 1E-2);
    }

    @Override
    public Kilometre toKilometre() {
        return new Kilometre(this.value * 1E-3);
    }

    @Override
    public Inch toInch() {
        return new Inch(this.value * 39.3700787402);
    }

    @Override
    public Foot toFoot() {
        return new Foot(this.value * 3.280839895);
    }

    @Override
    public Yard toYard() {
        return new Yard(this.value * 1.0936132983);
    }

    @Override
    public Mile toMile() {
        return new Mile(this.value / 1069);
    }

    @Override
    public NauticalMile toNauticalMile() {
        return new NauticalMile(this.value / 1852);
    }

    @Override
    public Rod toRod() {
        return new Rod(this.value / 5.029);
    }

    @Override
    public Fathom toFathom() {
        return new Fathom(this.value / 1.829);
    }

    @Override
    public Furlong toFurlong() {
        return new Furlong(this.value / 201.2);
    }
}

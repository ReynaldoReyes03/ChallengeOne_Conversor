package com.rmr.converter.length.units;

import com.rmr.converter.length.Length;
import com.rmr.converter.length.LengthUnit;

/**
 *
 * @author Reynaldo Martínez Reyes
 */
public class Centimetre extends Length {

    public Centimetre(Double value) {
        super(value, LengthUnit.CENTIMETRE);
    }

    @Override
    public Picometre toPicometre() {
        return new Picometre(this.value * 1E10);
    }

    @Override
    public Nanometre toNanometre() {
        return new Nanometre(this.value * 1E7);
    }

    @Override
    public Micrometre toMicrometre() {
        return new Micrometre(this.value * 1E4);
    }

    @Override
    public Millimetre toMillimetre() {
        return new Millimetre(this.value * 1E1);
    }

    @Override
    public Centimetre toCentimetre() {
        return this;
    }

    @Override
    public Decimetre toDecimetre() {
        return new Decimetre(this.value * 1E-1);
    }

    @Override
    public Metre toMetre() {
        return new Metre(this.value * 1E-2);
    }

    @Override
    public Decametre toDecametre() {
        return new Decametre(this.value * 1E-3);
    }

    @Override
    public Hectometre toHectometre() {
        return new Hectometre(this.value * 1E-4);
    }

    @Override
    public Kilometre toKilometre() {
        return new Kilometre(this.value * 1E-5);
    }

    @Override
    public Inch toInch() {
        return new Inch(this.value / 2.54);
    }

    @Override
    public Foot toFoot() {
        return new Foot(this.value / 30.48);
    }

    @Override
    public Yard toYard() {
        return new Yard(this.value / 91.44);
    }

    @Override
    public Mile toMile() {
        return new Mile(this.value / 160900);
    }

    @Override
    public NauticalMile toNauticalMile() {
        return new NauticalMile(this.value / 185200);
    }

    @Override
    public Rod toRod() {
        return new Rod(this.value / 502.9);
    }

    @Override
    public Fathom toFathom() {
        return new Fathom(this.value / 182.9);
    }

    @Override
    public Furlong toFurlong() {
        return new Furlong(this.value / 20120);
    }
}

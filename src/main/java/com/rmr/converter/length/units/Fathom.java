package com.rmr.converter.length.units;

import com.rmr.converter.length.Length;
import com.rmr.converter.length.LengthUnit;

/**
 *
 * @author Reynaldo Martínez Reyes
 */
public class Fathom extends Length {

    public Fathom(Double value) {
        super(value, LengthUnit.FATHOM);
    }

    @Override
    public Picometre toPicometre() {
        return new Picometre(this.value * 18288E8);
    }

    @Override
    public Nanometre toNanometre() {
        return new Nanometre(this.value * 18288E5);
    }

    @Override
    public Micrometre toMicrometre() {
        return new Micrometre(this.value * 18288E2);
    }

    @Override
    public Millimetre toMillimetre() {
        return new Millimetre(this.value * 1828.8);
    }

    @Override
    public Centimetre toCentimetre() {
        return new Centimetre(this.value * 182.88);
    }

    @Override
    public Decimetre toDecimetre() {
        return new Decimetre(this.value * 18.288);
    }

    @Override
    public Metre toMetre() {
        return new Metre(this.value * 1.8288);
    }

    @Override
    public Decametre toDecametre() {
        return new Decametre(this.value / 5.468);
    }

    @Override
    public Hectometre toHectometre() {
        return new Hectometre(this.value / 54.681);
    }

    @Override
    public Kilometre toKilometre() {
        return new Kilometre(this.value / 546.8);
    }

    @Override
    public Inch toInch() {
        return new Inch(this.value * 72);
    }

    @Override
    public Foot toFoot() {
        return new Foot(this.value * 6);
    }

    @Override
    public Yard toYard() {
        return new Yard(this.value * 2);
    }

    @Override
    public Mile toMile() {
        return new Mile(this.value / 880);
    }

    @Override
    public NauticalMile toNauticalMile() {
        return new NauticalMile(this.value / 1013);
    }

    @Override
    public Rod toRod() {
        return new Rod(this.value / 2.75);
    }

    @Override
    public Fathom toFathom() {
        return this;
    }

    @Override
    public Furlong toFurlong() {
        return new Furlong(this.value / 110);
    }
}

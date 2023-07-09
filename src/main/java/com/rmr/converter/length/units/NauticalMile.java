package com.rmr.converter.length.units;

import com.rmr.converter.length.Length;
import com.rmr.converter.length.LengthUnit;

/**
 *
 * @author Reynaldo Martínez Reyes
 */
public class NauticalMile extends Length {

    public NauticalMile(Double value) {
        super(value, LengthUnit.NAUTICAL_MILE);
    }

    @Override
    public Picometre toPicometre() {
        return new Picometre(this.value * 1.852E15);
    }

    @Override
    public Nanometre toNanometre() {
        return new Nanometre(this.value * 1.852E12);
    }

    @Override
    public Micrometre toMicrometre() {
        return new Micrometre(this.value * 1.852E9);
    }

    @Override
    public Millimetre toMillimetre() {
        return new Millimetre(this.value * 1.852E6);
    }

    @Override
    public Centimetre toCentimetre() {
        return new Centimetre(this.value * 1.852E5);
    }

    @Override
    public Decimetre toDecimetre() {
        return new Decimetre(this.value * 1.852E4);
    }

    @Override
    public Metre toMetre() {
        return new Metre(this.value * 1852);
    }

    @Override
    public Decametre toDecametre() {
        return new Decametre(this.value * 1.852E2);
    }

    @Override
    public Hectometre toHectometre() {
        return new Hectometre(this.value * 1.852E1);
    }

    @Override
    public Kilometre toKilometre() {
        return new Kilometre(this.value * 1.852);
    }

    @Override
    public Inch toInch() {
        return new Inch(this.value * 72913.4);
    }

    @Override
    public Foot toFoot() {
        return new Foot(this.value * 6076.12);
    }

    @Override
    public Yard toYard() {
        return new Yard(this.value * 2025.37);
    }

    @Override
    public Mile toMile() {
        return new Mile(this.value * 1.151);
    }

    @Override
    public NauticalMile toNauticalMile() {
        return this;
    }

    @Override
    public Rod toRod() {
        return new Rod(this.value * 368.2);
    }

    @Override
    public Fathom toFathom() {
        return new Fathom(this.value * 1012.69);
    }

    @Override
    public Furlong toFurlong() {
        return new Furlong(this.value * 9.20622);
    }
}

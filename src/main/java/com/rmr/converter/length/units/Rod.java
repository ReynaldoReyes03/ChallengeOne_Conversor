package com.rmr.converter.length.units;

import com.rmr.converter.length.Length;
import com.rmr.converter.length.LengthUnit;

/**
 *
 * @author Reynaldo Martínez Reyes
 */
public class Rod extends Length {

    public Rod(Double value) {
        super(value, LengthUnit.ROD);
    }

    @Override
    public Picometre toPicometre() {
        return new Picometre(this.value * 5.0292E12);
    }

    @Override
    public Nanometre toNanometre() {
        return new Nanometre(this.value * 5.0292E9);
    }

    @Override
    public Micrometre toMicrometre() {
        return new Micrometre(this.value * 5.0292E6);
    }

    @Override
    public Millimetre toMillimetre() {
        return new Millimetre(this.value * 5.0292E3);
    }

    @Override
    public Centimetre toCentimetre() {
        return new Centimetre(this.value * 5.0292E2);
    }

    @Override
    public Decimetre toDecimetre() {
        return new Decimetre(this.value * 5.0292E1);
    }

    @Override
    public Metre toMetre() {
        return new Metre(this.value * 5.0292);
    }

    @Override
    public Decametre toDecametre() {
        return new Decametre(this.value * 5.0292E-1);
    }

    @Override
    public Hectometre toHectometre() {
        return new Hectometre(this.value * 5.0292E-2);
    }

    @Override
    public Kilometre toKilometre() {
        return new Kilometre(this.value * 5.0292E-3);
    }

    @Override
    public Inch toInch() {
        return new Inch(this.value * 198);
    }

    @Override
    public Foot toFoot() {
        return new Foot(this.value * 16.5);
    }

    @Override
    public Yard toYard() {
        return new Yard(this.value * 5.5);
    }

    @Override
    public Mile toMile() {
        return new Mile(this.value / 320);
    }

    @Override
    public NauticalMile toNauticalMile() {
        return new NauticalMile(this.value / 368.2);
    }

    @Override
    public Rod toRod() {
        return this;
    }

    @Override
    public Fathom toFathom() {
        return new Fathom(this.value * 2.75);
    }

    @Override
    public Furlong toFurlong() {
        return new Furlong(this.value / 40);
    }
}

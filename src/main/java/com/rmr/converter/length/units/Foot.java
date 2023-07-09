package com.rmr.converter.length.units;

import com.rmr.converter.length.Length;
import com.rmr.converter.length.LengthUnit;

/**
 *
 * @author Reynaldo Martínez Reyes
 */
public class Foot extends Length {

    public Foot(Double value) {
        super(value, LengthUnit.FOOT);
    }

    @Override
    public Picometre toPicometre() {
        return new Picometre(this.value * 3048E8);
    }

    @Override
    public Nanometre toNanometre() {
        return new Nanometre(this.value * 3048E5);
    }

    @Override
    public Micrometre toMicrometre() {
        return new Micrometre(this.value * 3048E2);
    }

    @Override
    public Millimetre toMillimetre() {
        return new Millimetre(this.value * 3048E-1);
    }

    @Override
    public Centimetre toCentimetre() {
        return new Centimetre(this.value * 3048E-2);
    }

    @Override
    public Decimetre toDecimetre() {
        return new Decimetre(this.value * 3048E-3);
    }

    @Override
    public Metre toMetre() {
        return new Metre(this.value * 3048E-4);
    }

    @Override
    public Decametre toDecametre() {
        return new Decametre(this.value * 3048E-5);
    }

    @Override
    public Hectometre toHectometre() {
        return new Hectometre(this.value * 3048E-6);
    }

    @Override
    public Kilometre toKilometre() {
        return new Kilometre(this.value * 3048E-7);
    }

    @Override
    public Inch toInch() {
        return new Inch(this.value * 12);
    }

    @Override
    public Foot toFoot() {
        return this;
    }

    @Override
    public Yard toYard() {
        return new Yard(this.value / 3);
    }

    @Override
    public Mile toMile() {
        return new Mile(this.value / 5280);
    }

    @Override
    public NauticalMile toNauticalMile() {
        return new NauticalMile(this.value / 6076);
    }

    @Override
    public Rod toRod() {
        return new Rod(this.value / 16.5);
    }

    @Override
    public Fathom toFathom() {
        return new Fathom(this.value / 6);
    }

    @Override
    public Furlong toFurlong() {
        return new Furlong(this.value / 660);
    }
}

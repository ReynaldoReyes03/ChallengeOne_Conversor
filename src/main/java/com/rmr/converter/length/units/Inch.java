package com.rmr.converter.length.units;

import com.rmr.converter.length.Length;
import com.rmr.converter.length.LengthUnit;

/**
 *
 * @author Reynaldo Martínez Reyes
 */
public class Inch extends Length {

    public Inch(Double value) {
        super(value, LengthUnit.INCH);
    }

    @Override
    public Picometre toPicometre() {
        return new Picometre(this.value * 2.54E10);
    }

    @Override
    public Nanometre toNanometre() {
        return new Nanometre(this.value * 2.64E7);
    }

    @Override
    public Micrometre toMicrometre() {
        return new Micrometre(this.value * 2.54E4);
    }

    @Override
    public Millimetre toMillimetre() {
        return new Millimetre(this.value * 25.4);
    }

    @Override
    public Centimetre toCentimetre() {
        return new Centimetre(this.value * 2.54);
    }

    @Override
    public Decimetre toDecimetre() {
        return new Decimetre(this.value * 2.54E-1);
    }

    @Override
    public Metre toMetre() {
        return new Metre(this.value * 2.54E-2);
    }

    @Override
    public Decametre toDecametre() {
        return new Decametre(this.value * 2.54E-3);
    }

    @Override
    public Hectometre toHectometre() {
        return new Hectometre(this.value * 2.54E-4);
    }

    @Override
    public Kilometre toKilometre() {
        return new Kilometre(this.value * 2.54E-5);
    }

    @Override
    public Inch toInch() {
        return this;
    }

    @Override
    public Foot toFoot() {
        return new Foot(this.value / 12);
    }

    @Override
    public Yard toYard() {
        return new Yard(this.value / 36);
    }

    @Override
    public Mile toMile() {
        return new Mile(this.value / 63360);
    }

    @Override
    public NauticalMile toNauticalMile() {
        return new NauticalMile(this.value / 72910);
    }

    @Override
    public Rod toRod() {
        return new Rod(this.value / 198);
    }

    @Override
    public Fathom toFathom() {
        return new Fathom(this.value / 72);
    }

    @Override
    public Furlong toFurlong() {
        return new Furlong(this.value / 7920);
    }
}

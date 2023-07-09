package com.rmr.converter.length.units;

import com.rmr.converter.length.Length;
import com.rmr.converter.length.LengthUnit;

/**
 *
 * @author Reynaldo Martínez Reyes
 */
public class Nanometre extends Length {

    public Nanometre(Double value) {
        super(value, LengthUnit.NANOMETRE);
    }

    @Override
    public Picometre toPicometre() {
        return new Picometre(this.value * 1E3);
    }

    @Override
    public Nanometre toNanometre() {
        return this;
    }

    @Override
    public Micrometre toMicrometre() {
        return new Micrometre(this.value * 1E-3);
    }

    @Override
    public Millimetre toMillimetre() {
        return new Millimetre(this.value * 1E-6);
    }

    @Override
    public Centimetre toCentimetre() {
        return new Centimetre(this.value * 1E-7);
    }

    @Override
    public Decimetre toDecimetre() {
        return new Decimetre(this.value * 1E-8);
    }

    @Override
    public Metre toMetre() {
        return new Metre(this.value * 1E-9);
    }

    @Override
    public Decametre toDecametre() {
        return new Decametre(this.value * 1E-10);
    }

    @Override
    public Hectometre toHectometre() {
        return new Hectometre(this.value * 1E-11);
    }

    @Override
    public Kilometre toKilometre() {
        return new Kilometre(this.value * 1E-12);
    }

    @Override
    public Inch toInch() {
        return new Inch(this.value * 3.9370078740157E-8);
    }

    @Override
    public Foot toFoot() {
        return new Foot(this.value * 3.2808398950131E-9);
    }

    @Override
    public Yard toYard() {
        return new Yard(this.value * 1.0936132983377E-9);
    }

    @Override
    public Mile toMile() {
        return new Mile(this.value * 6.2137119223733E-13);
    }

    @Override
    public NauticalMile toNauticalMile() {
        return new NauticalMile(this.value * 5.3995680345572E-13);
    }

    @Override
    public Rod toRod() {
        return new Rod(this.value * 1.9883878151595E-10);
    }

    @Override
    public Fathom toFathom() {
        return new Fathom(this.value * 5.4680664916885E-10);
    }

    @Override
    public Furlong toFurlong() {
        return new Furlong(this.value * 4.9709695378987E-12);
    }
}

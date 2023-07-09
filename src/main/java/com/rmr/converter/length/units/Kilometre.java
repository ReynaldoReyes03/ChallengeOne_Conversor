package com.rmr.converter.length.units;

import com.rmr.converter.length.Length;
import com.rmr.converter.length.LengthUnit;

/**
 *
 * @author Reynaldo Martínez Reyes
 */
public class Kilometre extends Length {

    public Kilometre(Double value) {
        super(value, LengthUnit.KILOMETRE);
    }

    @Override
    public Picometre toPicometre() {
        return new Picometre(this.value * 1E15);
    }

    @Override
    public Nanometre toNanometre() {
        return new Nanometre(this.value * 1E12);
    }

    @Override
    public Micrometre toMicrometre() {
        return new Micrometre(this.value * 1E9);
    }

    @Override
    public Millimetre toMillimetre() {
        return new Millimetre(this.value * 1E6);
    }

    @Override
    public Centimetre toCentimetre() {
        return new Centimetre(this.value * 1E5);
    }

    @Override
    public Decimetre toDecimetre() {
        return new Decimetre(this.value * 1E4);
    }

    @Override
    public Metre toMetre() {
        return new Metre(this.value * 1E3);
    }

    @Override
    public Decametre toDecametre() {
        return new Decametre(this.value * 1E2);
    }

    @Override
    public Hectometre toHectometre() {
        return new Hectometre(this.value * 1E1);
    }

    @Override
    public Kilometre toKilometre() {
        return this;
    }

    @Override
    public Inch toInch() {
        return new Inch(this.value * 3.9370078740157E4);
    }

    @Override
    public Foot toFoot() {
        return new Foot(this.value * 3.2808398950131E3);
    }

    @Override
    public Yard toYard() {
        return new Yard(this.value * 1.0936132983377E3);
    }

    @Override
    public Mile toMile() {
        return new Mile(this.value / 1.609);
    }

    @Override
    public NauticalMile toNauticalMile() {
        return new NauticalMile(this.value / 1.852);
    }

    @Override
    public Rod toRod() {
        return new Rod(this.value * 1.9883878151595E2);
    }

    @Override
    public Fathom toFathom() {
        return new Fathom(this.value * 5.4680664916885E2);
    }

    @Override
    public Furlong toFurlong() {
        return new Furlong(this.value * 4.9709695378987);
    }
}

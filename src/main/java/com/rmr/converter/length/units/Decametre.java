package com.rmr.converter.length.units;

import com.rmr.converter.length.Length;
import com.rmr.converter.length.LengthUnit;

/**
 *
 * @author Reynaldo Martínez Reyes
 */
public class Decametre extends Length {

    public Decametre(Double value) {
        super(value, LengthUnit.DECAMETRE);
    }

    @Override
    public Picometre toPicometre() {
        return new Picometre(this.value * 1E13);
    }

    @Override
    public Nanometre toNanometre() {
        return new Nanometre(this.value * 1E10);
    }

    @Override
    public Micrometre toMicrometre() {
        return new Micrometre(this.value * 1E7);
    }

    @Override
    public Millimetre toMillimetre() {
        return new Millimetre(this.value * 1E4);
    }

    @Override
    public Centimetre toCentimetre() {
        return new Centimetre(this.value * 1E3);
    }

    @Override
    public Decimetre toDecimetre() {
        return new Decimetre(this.value * 1E2);
    }

    @Override
    public Metre toMetre() {
        return new Metre(this.value * 1E1);
    }

    @Override
    public Decametre toDecametre() {
        return this;
    }

    @Override
    public Hectometre toHectometre() {
        return new Hectometre(this.value * 1E-1);
    }

    @Override
    public Kilometre toKilometre() {
        return new Kilometre(this.value * 1E-2);
    }

    @Override
    public Inch toInch() {
        return new Inch(this.value * 393.70078740157);
    }

    @Override
    public Foot toFoot() {
        return new Foot(this.value * 32.808398950131);
    }

    @Override
    public Yard toYard() {
        return new Yard(this.value * 10.936132983377);
    }

    @Override
    public Mile toMile() {
        return new Mile(this.value / 160.9);
    }

    @Override
    public NauticalMile toNauticalMile() {
        return new NauticalMile(this.value / 185.2);
    }

    @Override
    public Rod toRod() {
        return new Rod(this.value * 1.9883878152);
    }

    @Override
    public Fathom toFathom() {
        return new Fathom(this.value * 5.4680664917);
    }

    @Override
    public Furlong toFurlong() {
        return new Furlong(this.value / 20.117);
    }
}

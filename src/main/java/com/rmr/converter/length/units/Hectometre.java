package com.rmr.converter.length.units;

import com.rmr.converter.length.Length;
import com.rmr.converter.length.LengthUnit;

/**
 *
 * @author Reynaldo Martínez Reyes
 */
public class Hectometre extends Length {

    public Hectometre(Double value) {
        super(value, LengthUnit.HECTOMETRE);
    }

    @Override
    public Picometre toPicometre() {
        return new Picometre(this.value * 1E14);
    }

    @Override
    public Nanometre toNanometre() {
        return new Nanometre(this.value * 1E11);
    }

    @Override
    public Micrometre toMicrometre() {
        return new Micrometre(this.value * 1E8);
    }

    @Override
    public Millimetre toMillimetre() {
        return new Millimetre(this.value * 1E5);
    }

    @Override
    public Centimetre toCentimetre() {
        return new Centimetre(this.value * 1E4);
    }

    @Override
    public Decimetre toDecimetre() {
        return new Decimetre(this.value * 1E3);
    }

    @Override
    public Metre toMetre() {
        return new Metre(this.value * 1E2);
    }

    @Override
    public Decametre toDecametre() {
        return new Decametre(this.value * 1E1);
    }

    @Override
    public Hectometre toHectometre() {
        return this;
    }

    @Override
    public Kilometre toKilometre() {
        return new Kilometre(this.value * 1E-1);
    }

    @Override
    public Inch toInch() {
        return new Inch(this.value * 3937.0078740158);
    }

    @Override
    public Foot toFoot() {
        return new Foot(this.value * 328.0839895013);
    }

    @Override
    public Yard toYard() {
        return new Yard(this.value * 109.3613298338);
    }

    @Override
    public Mile toMile() {
        return new Mile(this.value / 16.093);
    }

    @Override
    public NauticalMile toNauticalMile() {
        return new NauticalMile(this.value / 18.52);
    }

    @Override
    public Rod toRod() {
        return new Rod(this.value * 19.8838781516);
    }

    @Override
    public Fathom toFathom() {
        return new Fathom(this.value * 54.6806649169);
    }

    @Override
    public Furlong toFurlong() {
        return new Furlong(this.value / 2.012);
    }
}

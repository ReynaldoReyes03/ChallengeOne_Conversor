package com.rmr.converter.models;

import com.rmr.converter.length.Length;
import com.rmr.converter.length.LengthUnit;
import com.rmr.converter.length.units.*;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author Reynaldo Martínez Reyes
 */
public class LengthModel {

    public DefaultComboBoxModel getLengthUnitsModel() {
        return new DefaultComboBoxModel<>(LengthUnit.values());
    }

    public Length convert(LengthUnit lengthFrom, LengthUnit lengtTo, String lengthValue) {
        Length from, to;
        
        Double value = Double.valueOf(lengthValue);
        
        switch (lengthFrom) {
            case CENTIMETRE -> from = new Centimetre(value);
            case DECAMETRE -> from = new Decametre(value);
            case DECIMETRE -> from = new Decimetre(value);
            case FATHOM -> from = new Fathom(value);
            case FOOT -> from = new Foot(value);
            case FURLONG -> from = new Furlong(value);
            case HECTOMETRE -> from = new Hectometre(value);
            case INCH -> from = new Inch(value);
            case KILOMETRE -> from = new Kilometre(value);
            case METRE -> from = new Metre(value);
            case MICROMETRE -> from = new Micrometre(value);
            case MILE -> from = new Mile(value);
            case MILLIMETRE -> from = new Millimetre(value);
            case NANOMETRE -> from = new Nanometre(value);
            case NAUTICAL_MILE -> from = new NauticalMile(value);
            case PICOMETRE -> from = new Picometre(value);
            case ROD -> from = new Rod(value);
            case YARD -> from = new Yard(value);

            default -> throw new AssertionError();
        }

        switch (lengtTo) {
            case CENTIMETRE -> to = from.toCentimetre();
            case DECAMETRE -> to = from.toDecametre();
            case DECIMETRE -> to = from.toDecimetre();
            case FATHOM -> to = from.toFathom();
            case FOOT -> to = from.toFoot();
            case FURLONG -> to = from.toFurlong();
            case HECTOMETRE -> to = from.toHectometre();
            case INCH -> to = from.toInch();
            case KILOMETRE -> to = from.toKilometre();
            case METRE -> to = from.toMetre();
            case MICROMETRE -> to = from.toMicrometre();
            case MILE -> to = from.toMile();
            case MILLIMETRE -> to = from.toMillimetre();
            case NANOMETRE -> to = from.toNanometre();
            case NAUTICAL_MILE -> to = from.toNauticalMile();
            case PICOMETRE -> to = from.toPicometre();
            case ROD -> to = from.toRod();
            case YARD -> to = from.toYard();

            default -> throw new AssertionError();
        }
        
        return to;
    }
    
}

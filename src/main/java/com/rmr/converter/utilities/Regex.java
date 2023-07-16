package com.rmr.converter.utilities;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Reynaldo Martínez Reyes
 */
public class Regex {

    private static final Pattern INTEGER__PATTERN = Pattern.compile("^\\d+$");
    private static final Pattern SIGNED_INTEGER__PATTERN = Pattern.compile("^[+-]?\\d+$");
    private static final Pattern DECIMAL_PATTERN = Pattern.compile("^\\d*\\.\\d*$");
    private static final Pattern SIGNED_DECIMAL_PATTERN = Pattern.compile("^[+-]?\\d*\\.\\d*$");
    private static final Pattern SCIENTIFIC_NOTATION_PATTERN = Pattern.compile("\\d*(\\.\\d+)?([Ee][+-]?\\d+)?");
    private static final Pattern SIGNED_SCIENTIFIC_NOTATION_PATTERN = Pattern.compile("[+-]?\\d*(\\.\\d+)?([Ee][+-]?\\d+)?");
    
    public static boolean validateInteger(String value) {
        final Matcher matcher = INTEGER__PATTERN.matcher(value);
        
        return matcher.matches();
    }
    
    public static boolean validateSignedInteger(String value) {
        final Matcher matcher = SIGNED_INTEGER__PATTERN.matcher(value);
        
        return matcher.matches();
    }

    public static boolean validateDecimalNumber(String value) {
        final Matcher matcher = DECIMAL_PATTERN.matcher(value);

        return matcher.matches();
    }

    public static boolean validateSignedDecimalNumber(String value) {
        final Matcher matcher = SIGNED_DECIMAL_PATTERN.matcher(value);

        return matcher.matches();
    }

    public static boolean validateScientificNotation(String value) {
        final Matcher matcher = SCIENTIFIC_NOTATION_PATTERN.matcher(value);

        return matcher.matches();
    }

    public static boolean validateSignedScientificNotation(String value) {
        final Matcher matcher = SIGNED_SCIENTIFIC_NOTATION_PATTERN.matcher(value);

        return matcher.matches();
    }

}

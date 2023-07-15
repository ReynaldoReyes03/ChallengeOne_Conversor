package com.rmr.converter.utilities;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Reynaldo Martínez Reyes
 */
public class Regex {

    private static final Pattern integerPattern = Pattern.compile("^\\d+$");
    private static final Pattern signedIntegerPattern = Pattern.compile("^[+-]?\\d+$");
    private static final Pattern decimalPattern = Pattern.compile("^\\d*\\.\\d*$");
    private static final Pattern signalDecimalPattern = Pattern.compile("^[+-]?\\d*\\.\\d*$");
    private static final Pattern scientificNotationPattern = Pattern.compile("\\d*(\\.\\d+)?([Ee][+-]?\\d+)?");
    private static final Pattern signedScientificNotationPattern = Pattern.compile("[+-]?\\d*(\\.\\d+)?([Ee][+-]?\\d+)?");
    
    public static boolean validateInteger(String value) {
        final Matcher matcher = integerPattern.matcher(value);
        
        return matcher.matches();
    }
    
    public static boolean validateSignedInteger(String value) {
        final Matcher matcher = signedIntegerPattern.matcher(value);
        
        return matcher.matches();
    }

    public static boolean validateDecimalNumber(String value) {
        final Matcher matcher = decimalPattern.matcher(value);

        return matcher.matches();
    }

    public static boolean validateSignedDecimalNumber(String value) {
        final Matcher matcher = signalDecimalPattern.matcher(value);

        return matcher.matches();
    }

    public static boolean validateScientificNotation(String value) {
        final Matcher matcher = scientificNotationPattern.matcher(value);

        return matcher.matches();
    }

    public static boolean validateSignedScientificNotation(String value) {
        final Matcher matcher = signedScientificNotationPattern.matcher(value);

        return matcher.matches();
    }

}

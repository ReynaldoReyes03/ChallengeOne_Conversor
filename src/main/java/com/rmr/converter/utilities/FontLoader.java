package com.rmr.converter.utilities;

import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Reynaldo Martínez Reyes
 */
public class FontLoader {
    
    private static boolean fontLoaded;
    
    private static String loadedFontName = "";

    public static String getLoadedFontName() {
        return loadedFontName;
    }

    private static Font regularSmallFont;
    private static Font regularMediumFont;
    private static Font regularBigFont;
    
    private static Font boldSmallFont;
    private static Font boldMediumFont;
    private static Font boldBigFont;
    private static Font boldBiggerFont;
    
    // <editor-fold defaultstate="collapsed" desc="Getters">
    public static boolean ifFontLoaded() {
        return fontLoaded;
    }

    public static Font getRegularSmallFont() {
        if (regularSmallFont == null) loadDefaultFont();
        
        return regularSmallFont;
    }

    public static Font getRegularMediumFont() {
        if (regularMediumFont == null) loadDefaultFont();
        
        return regularMediumFont;
    }

    public static Font getRegularBigFont() {
        if (regularBigFont == null) loadDefaultFont();
        
        return regularBigFont;
    }

    public static Font getBoldSmallFont() {
        if (boldSmallFont == null) loadDefaultFont();
        
        return boldSmallFont;
    }

    public static Font getBoldMediumFont() {
        if (boldMediumFont == null) loadDefaultFont();
        
        return boldMediumFont;
    }

    public static Font getBoldBigFont() {
        if (boldBigFont == null) loadDefaultFont();
        
        return boldBigFont;
    }

    public static Font getBoldBiggerFont() {
        if (boldBiggerFont == null) loadDefaultFont();
        
        return boldBiggerFont;
    }
    // </editor-fold>
    
    private static List<File> getFontFiles(String folderName) throws NullPointerException {
        URL folderURL = FontLoader.class.getClassLoader().getResource("fonts/" + folderName);
        
        if (folderURL == null) throw new NullPointerException();
        
        String folderPath = folderURL.getPath();
        
        if (folderPath == null) throw new NullPointerException();
        
        File folder = new File(folderPath);
        File[] listOfFiles = folder.listFiles();
        
        List<File> fontFiles = new ArrayList<>();

        for (File file : listOfFiles) {
            if (file.isFile()) fontFiles.add(file);
        }
        
        return fontFiles;
    }
    
    private static boolean loadFont(String folderName) {
        final GraphicsEnvironment GRAPHICS_ENVIRONMENT = GraphicsEnvironment.getLocalGraphicsEnvironment();
        final List<String> AVAILABLE_FONT_FAMILY_NAMES = Arrays.asList(GRAPHICS_ENVIRONMENT.getAvailableFontFamilyNames());
        
        List<File> fontFiles;
        
        try {
            fontFiles = getFontFiles(folderName);
        } catch (NullPointerException e) {
            System.err.println("Null Pointer Exception");
            
            return false;
        }
        
        if (fontFiles.isEmpty()) return false;
        
        fontFiles.forEach(file -> {
            try {
                final Font FONT = Font.createFont(Font.TRUETYPE_FONT, file);

                if (!AVAILABLE_FONT_FAMILY_NAMES.contains(FONT.getFontName())) {
                    GRAPHICS_ENVIRONMENT.registerFont(FONT);
                }
            } catch (FontFormatException | IOException e) {
                System.err.println(e.getMessage());
            }
        });
        
        return true;
    }
    
    public static boolean loadDefaultFont() {
        loadedFontName = Font.SANS_SERIF;
        
        initFonts();
        
        return true;
    }
    
    public static boolean loadMPLUSRounded1cFont() {
        fontLoaded = loadFont("MPLUSRounded1c");
        
        if (fontLoaded) loadedFontName = "Rounded Mplus 1c";
        
        initFonts();
        
        return fontLoaded;
    }
    
    public static boolean loadRalewayFont() {
        fontLoaded = loadFont("Raleway");
        
        if (fontLoaded) loadedFontName = "Raleway";
        
        initFonts();
        
        return fontLoaded;
    }
    
    public static boolean loadUbuntuFont() {
        fontLoaded = loadFont("Ubuntu");
        
        if (fontLoaded) loadedFontName = "Ubuntu";
        
        initFonts();
        
        return fontLoaded;
    }
    
    private static void initFonts() {
        if (loadedFontName.equals("")) loadedFontName = Font.SANS_SERIF;
        
        regularSmallFont = new Font(loadedFontName, Font.PLAIN, 11);
        regularMediumFont = new Font(loadedFontName, Font.PLAIN, 12);
        regularBigFont = new Font(loadedFontName, Font.PLAIN, 14);

        boldSmallFont = new Font(loadedFontName, Font.BOLD, 14);
        boldMediumFont = new Font(loadedFontName, Font.BOLD, 17);
        boldBigFont = new Font(loadedFontName, Font.BOLD, 20);
        boldBiggerFont = new Font(loadedFontName, Font.BOLD, 24);
    }
    
}

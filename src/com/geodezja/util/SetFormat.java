/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.geodezja.util;


import org.apache.poi.xwpf.usermodel.XWPFRun;

/**
 *
 * @author Karol
 */
public class SetFormat {
    public static void setRun(XWPFRun run, String fontFamily, int fontSize, String text) {
        run.setFontFamily(fontFamily);
        run.setFontSize(fontSize);
        run.setText(text);
        
    }
}


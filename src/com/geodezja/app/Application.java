/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.geodezja.app;

import com.geodezja.model.Point;
import com.geodezja.util.CoordinatesReader;
import com.geodezja.util.WordWrite;
import java.util.Map;
import java.util.Map.Entry;

/**
 *
 * @author Karol
 */
public class Application {
    
    public static void start(String pathTXT, String pathDOCX){
        Map<String, Point> points = CoordinatesReader.getPointMap(pathTXT);
        System.out.println("Działam");
        
        WordWrite.wordWrite(points, pathDOCX);
    }
}

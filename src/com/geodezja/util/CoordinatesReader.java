package com.geodezja.util;

import com.geodezja.model.Point;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;

/**
 *
 * @author Karol
 */
public class CoordinatesReader {

    public static Map<String, Point> getPointMap(String pathTXT) {
        
        Map<String, Point> points = new HashMap<>();
        
        try {
            BufferedReader reader = new BufferedReader(new FileReader(pathTXT));

            String line;

            while ((line = reader.readLine()) != null) {
                StringTokenizer token = new StringTokenizer(line);
                try{
                    String name = token.nextToken();
                    double x = Double.parseDouble(token.nextToken());
                    double y = Double.parseDouble(token.nextToken());
                    

                    System.out.println(name + "       " + x + "     " + y);
                    
                    Point point = new Point(name, x, y);
                    points.put(name, point);

                } catch (NoSuchElementException ex){
                    System.out.println(ex.getMessage());
                    break;
                }
                    
            }
            reader.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ioex) {
            ioex.printStackTrace();
        }
        
        return points;
    }
}
 
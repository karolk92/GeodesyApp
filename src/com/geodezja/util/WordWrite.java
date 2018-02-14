/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.geodezja.util;

import com.geodezja.model.Point;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.apache.poi.xwpf.usermodel.XWPFTableCell;
import org.apache.poi.xwpf.usermodel.XWPFTableRow;

/**
 *
 * @author Karol
 */
public class WordWrite {
	
	

    public static void wordWrite(Map<String, Point> points, String pathDOCX) {
        try {
            File file = new File(pathDOCX);
            XWPFDocument document;
            document = new XWPFDocument(new FileInputStream(file));
            List<XWPFTable> tables = document.getTables();

            for (XWPFTable table : tables) {
                List<XWPFTableRow> rows = table.getRows();

                int cellPositionX = -1;
                int cellPositionY = -1;

                for (int i = 0; i < rows.size(); i++) {
                    List<XWPFTableCell> cells = rows.get(i).getTableCells();

                    for (int j = 0; j < cells.size() && i == 0; j++) {

                        if (cells.get(j).getText().equals("x")) {
                            cellPositionX = j;
                        }
                        if (cells.get(j).getText().equals("y")) {
                            cellPositionY = j;
                        }
                        
                        
                     
                    }
                    if (cellPositionX == -1 && cellPositionY == -1) {
                        break;
                    } else {
                        String name = rows.get(i).getCell(0).getText();
                        if (points.containsKey(name)) {
                            Point point = points.get(name);
                            
                            NumberFormat f = new DecimalFormat("#0.000", new DecimalFormatSymbols(Locale.ENGLISH) );
                            
                            rows.get(i).getCell(cellPositionX).removeParagraph(0);
                            rows.get(i).getCell(cellPositionY).removeParagraph(0);
                            
                            XWPFParagraph paragraphX = rows.get(i).getCell(cellPositionX).addParagraph();
                            XWPFParagraph paragraphY = rows.get(i).getCell(cellPositionY).addParagraph();
                            
                            XWPFRun runX = paragraphX.createRun();
                            XWPFRun runY = paragraphY.createRun();
                            
                            paragraphX.setSpacingAfter(0);
                            paragraphY.setSpacingAfter(0);
                            
                            paragraphX.setSpacingBetween(1);
                            paragraphY.setSpacingBetween(1);
                            
                            SetFormat.setRun(runX, "Arial", 9, f.format(point.getX()));
                            SetFormat.setRun(runY, "Arial", 9, f.format(point.getY()));
                            
                            
                            rows.get(i).getCell(cellPositionX).setParagraph(paragraphX);
                            rows.get(i).getCell(cellPositionY).setParagraph(paragraphY);
                            
                            
                            
                        }
                    }
                }

            }
            
            document.write(new FileOutputStream(file));
            document.close();
            
            
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }
}

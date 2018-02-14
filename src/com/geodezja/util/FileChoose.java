/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.geodezja.util;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Karol
 */
public class FileChoose implements ActionListener {
    
    JPanel frame;
    JLabel label;
    String path;
    
    public FileChoose(JPanel frame){
        this.frame = frame;
    }
    
    public void setLabel(JLabel label) {
        this.label = label;
    }
    
    public String getPath() {
        return path;
    }
    FileNameExtensionFilter filter = new FileNameExtensionFilter("TXT FILES", "txt", "docx");
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        JFileChooser fileChoose = new JFileChooser();
        
        fileChoose.setFileFilter(filter);
        int returnValue = fileChoose.showOpenDialog(frame);
        
        
        if(returnValue == JFileChooser.APPROVE_OPTION) {
            
            path = fileChoose.getSelectedFile().getAbsolutePath();
            label.setText(path);
        }
        
    }
    
}

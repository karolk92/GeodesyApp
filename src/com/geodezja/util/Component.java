/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.geodezja.util;

import com.geodezja.app.Application;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Karol
 */
public class Component {
    
    
    public void init(GroupLayout layout) {
        
        JPanel panel = new JPanel();

        JButton buttonTXT = new JButton("Plik TXT");
        JButton buttonDOCX = new JButton("Plik DOCX");
        JButton buttonSave = new JButton("Zapisz");
        
        JLabel pathLabelTXT = new JLabel();
        JLabel pathLabelDOCX = new JLabel();
        JLabel finish = new JLabel();
        
        
        
        FileChoose fChooseTXT = new FileChoose(panel);
        FileChoose fChooseDOCX = new FileChoose(panel);
        
        
        
        
        fChooseTXT.setLabel(pathLabelTXT);
        fChooseDOCX.setLabel(pathLabelDOCX);
        
        buttonTXT.addActionListener(fChooseTXT);
        buttonDOCX.addActionListener(fChooseDOCX);
        
        buttonSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Application.start(pathLabelTXT.getText(), pathLabelDOCX.getText());

                JOptionPane.showMessageDialog(null, "Zapisano poprawnie!");
            }
        });
        
        layout.setHorizontalGroup(layout.createSequentialGroup()
                .addGroup(
                    layout.createParallelGroup()
                        .addComponent(buttonTXT)
                        .addComponent(buttonDOCX)
                        .addComponent(buttonSave)
        )
                .addGroup(layout.createParallelGroup()
                        .addComponent(pathLabelTXT)
                        .addComponent(pathLabelDOCX)
                        .addComponent(finish)
                )
                
        );
            
        layout.setVerticalGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup()
                        .addComponent(buttonTXT)
                        .addComponent(pathLabelTXT)
                )
                .addGroup(layout.createParallelGroup()
                        .addComponent(buttonDOCX)
                        .addComponent(pathLabelDOCX)
                )
                .addComponent(buttonSave)
                .addComponent(finish)
        );
        
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);
        
        
    }
}

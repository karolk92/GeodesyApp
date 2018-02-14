/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.geodezja.app.gui;

import com.geodezja.util.Component;
import java.awt.Toolkit;
import javax.swing.GroupLayout;
import javax.swing.JFrame;


/**
 *
 * @author Karol
 */
public class AppWindow extends JFrame{
    
    public AppWindow() {
        // getting screen width and height
        int screenWidth = Toolkit.getDefaultToolkit().getScreenSize().width;
        int screenHeight = Toolkit.getDefaultToolkit().getScreenSize().height;
        //setting window width and height
        int windowWidth = 700;
        int windowHeight = 300;
        this.setBounds(screenWidth/2 - windowWidth/2, screenHeight/2 - windowHeight/2, windowWidth, windowHeight);
       
        this.setDefaultCloseOperation(3);
        
        GroupLayout layout  = new GroupLayout(getContentPane());
        
        new Component().init(layout);
        
        getContentPane().setLayout(layout);
    }
  
        
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.JFrame;

/**
 *
 * @author Adam Miller
 */
public class Frame1 extends JFrame{
    
    Panel1 panel1;
    
    public Frame1() {
        
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        this.setSize(700,700);
        this.setLocationRelativeTo(null);
        
        panel1 = new Panel1();
        this.add(panel1);
        this.setVisible(true);
  
    }
    
    
}

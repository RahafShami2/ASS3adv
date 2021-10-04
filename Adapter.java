package edu.najah.cap.ass3;
import java.awt.*;    
import java.awt.event.*;    

public class Adapter {     
 Frame f;     
 Adapter() {    
     f = new Frame ("Window Adapter");    
     f.addWindowListener (new WindowAdapter() {    
         public void windowClosing (WindowEvent e) {    
             f.dispose();    
         }    
     });    
     f.setSize (200, 200);    
     f.setLayout (null);    
     f.setVisible (true);    
 }     
}    


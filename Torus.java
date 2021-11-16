import java.awt.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/*
*   FileName : Torus.java
*   Author : Teman Beck
*   CMSC 335 Project 2
*   Date : November 15th, 2021
*   This class creates our Torus constructor and returns 3D images to screen
*/

public class Torus {
    String fileName = "C:/Users/Smokez/Desktop/Java Projects/CMSC 335/Project 2/Torus.png" ;
    Image image = null;

    public Torus(){

    }

    public void drawGraphics(){ 
        //     System.out.println("File is :  "+ file);
        // System.out.println("fileName is :   " + fileName);
        JFrame frame = new JFrame("Torus");
        
        //BufferedImage image = null;
        try
        {
            image = ImageIO.read(new File(fileName));
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "Your file cannot be found.");
        }
    
        ImageIcon icon = new ImageIcon(image);
        JLabel label = new JLabel(icon);
        label.setIcon(icon);
    
        frame.getContentPane().add(label, BorderLayout.CENTER);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
             
        }

}

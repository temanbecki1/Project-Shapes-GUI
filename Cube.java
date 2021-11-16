import java.awt.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/*
*Author : Teman Beck
*CMSC 335 Project 2
*Date : November 15th, 2021
*This class extends our GUI class and adds all relative Java Swing components to the GUI
*This class adds action listeners and functionality to all shape buttons.
*/

public class Cube {
    String fileName = "C:/Users/Smokez/Desktop/Java Projects/CMSC 335/Project 2/cube.png" ;
    // Image image = null;
    BufferedImage image = null;

    public Cube(){

    }

    public void drawGraphics(){ 
        //     System.out.println("File is :  "+ file);
        // System.out.println("fileName is :   " + fileName);
        JFrame frame = new JFrame("Cube");
        
        //BufferedImage image = null;
        try
        {
            image = ImageIO.read(new File(fileName));
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "Your file cannot be found.");
        }
        Image dimg = image.getScaledInstance(400, 412, Image.SCALE_SMOOTH);
    
        ImageIcon icon = new ImageIcon(dimg);
        JLabel label = new JLabel(icon);
        label.setIcon(icon);
    
        frame.getContentPane().add(label, BorderLayout.CENTER);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
             
        }

}

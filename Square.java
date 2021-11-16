import java.awt.Color;
import java.awt.Graphics;
import java.awt.*;

/*
*Author : Teman Beck
*CMSC 335 Project 2
*Date : November 15th, 2021
*This class extends our GUI class and adds all relative Java Swing components to the GUI
*This class adds action listeners and functionality to all shape buttons.
*/

public class Square extends Canvas {

    public Square(){

    }

    public void paint(Graphics g){
        g.setColor(Color.BLUE);
        g.fillRect(50, 50, 175, 175);       
    }
    
}

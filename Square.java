import java.awt.Color;
import java.awt.Graphics;
import java.awt.*;

/*
*   FileName : Square.java
*   Author : Teman Beck
*   CMSC 335 Project 2
*   Date : November 15th, 2021
*   This class creates our Square and allows 2D graphics to be printed to screen.
*/

public class Square extends Canvas {

    public Square(){

    }

    public void paint(Graphics g){
        g.setColor(Color.BLUE);
        g.fillRect(50, 50, 175, 175);       
    }
    
}

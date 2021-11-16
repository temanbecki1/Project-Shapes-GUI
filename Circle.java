import java.awt.Color;
import java.awt.Graphics;
import java.awt.*;

/*
*   FileName : Circle.java
*   Author : Teman Beck
*   CMSC 335 Project 2
*   Date : November 15th, 2021
*   This class creates our Circle and allows 2D graphics to be printed to screen
*/


public class Circle extends Canvas{

    public Circle(){

    }
    

    public void paint(Graphics g){
        g.setColor(Color.BLUE);
        g.drawOval(30,130,150, 150); 
    }
}

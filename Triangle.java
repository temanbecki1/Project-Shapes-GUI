import java.awt.Color;
import java.awt.Graphics;
import java.awt.*;

/*
*   FileName : Triangle.java
*   Author : Teman Beck
*   CMSC 335 Project 2
*   Date : November 15th, 2021
*   This class creates our Triangle and allows 2D graphics to be printed to screen
*/


public class Triangle extends Canvas {

    public Triangle(){
        
    }

    public void paint(Graphics g){
        g.setColor(Color.BLUE);

        int x[]={100,70,160};
        int y[]={50,100, 145};
        g.fillPolygon(x,y,3);


    }
    
}

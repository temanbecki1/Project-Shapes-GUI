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


public class Rectangle extends Canvas {
    private int base;
    private int height;
    private String size;

    public Rectangle() {
    }

    public Rectangle(String size){
        this.size = size;

    }

    public void paint(Graphics g){

        // g.setColor(Color.BLACK);
                
        switch(size){
            case "small" : 
                g.setColor(Color.RED);
                g.fillRect(50, 50, 200, 165);
                
                System.out.println("Printing from case small");
                break;
            case "medium" : 
                g.setColor(Color.BLACK);
                g.fillRect(50, 50, 200, 115 );
                
                System.out.println("Printing from case medium");
                break;
            case "large" : 
                g.setColor(Color.GREEN);
                g.fillRect(50, 50, 200, 70);
                System.out.println("Printing from case Large");
                break;
            default : 
                break;

        }
    }   
}

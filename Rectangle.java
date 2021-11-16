import java.awt.Color;
import java.awt.Graphics;
import java.awt.*;

/*
*   FileName : Rectangle.java
*   Author : Teman Beck
*   CMSC 335 Project 2
*   Date : November 15th, 2021
*   This class creates our Rectangle and allows 2D graphics to be printed to screen
*/


public class Rectangle extends Canvas {
    // private int base;                                                                        //parameters currently unused. Will expand functionality
    // private int height;                                                                      //parameters currently unused. Will expand functionality
    private String size;                                                                        //declares String to store size

    public Rectangle() {                                                                        //default constructor

    }

    public Rectangle(String size){                                                              //construtor that takes a size input
        this.size = size;                                                                       //assigns passed in value to this instance of size

    }

/************************************************************************************************************************************************************/
/*                                This method paints our graphic based on the size of rectangle created using switch statements                             */
/************************************************************************************************************************************************************/

    public void paint(Graphics g){

        // g.setColor(Color.BLACK);
                
        switch(size){
            case "small" : 
                g.setColor(Color.RED);
                g.fillRect(50, 50, 200, 165);
                
                // System.out.println("Printing from case small");                              //Testing point. Checks where the program is printing from

                break;
            case "medium" : 
                g.setColor(Color.BLACK);
                g.fillRect(50, 50, 200, 115 );
                
                // System.out.println("Printing from case medium");                             //Testing point. Checks where the program is printing from

                break;
            case "large" : 
                g.setColor(Color.GREEN);
                g.fillRect(50, 50, 200, 70);
                // System.out.println("Printing from case Large");                              //Testing point. Checks where the program is printing from

                break;
            default : 
                break;

        }
    }   
}

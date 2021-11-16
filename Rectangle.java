import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.*;


public class Rectangle extends Canvas {
    private int base;
    private int height;
    private JPanel panel;
    private Graphics graphics;
    private Color color;
    private int startX;
    private int startY;

    public Rectangle() {
    }

    public Rectangle(String size){

    }
    // public Rectangle(int startX, int startY, int base, int height) {
    //     this.base = base;
    //     this.height = height;
    //     this.startX = startX;
    //     this.startY = startY;

    // }




    public void paint(Graphics g){

        g.setColor(Color.BLACK);
        
        g.fillRect(50, 50, 120,80);        

    }





    // public Rectangle(double base, double height){
    //     this.base = base;
    //     this.height = height;
    // }

    // //method to draw and return rectangle to JPanel

    // public void draw(Graphics g){
    //     g.setColor(Color.GREEN);
    //     g.fillRect(100, 100, 50, 50);     
    // }

    // public double getArea(){
    //     return base * height;
    // }
    
}

import java.awt.Color;
import java.awt.Graphics;
import java.awt.*;


public class Circle extends Canvas{

    public Circle(){

    }
    

    public void paint(Graphics g){
        g.setColor(Color.BLUE);
        g.drawOval(30,130,150, 150); 
    }
}

import java.awt.Color;
import java.awt.Graphics;
import java.awt.*;

public class Square extends Canvas {

    public Square(){

    }

    public void paint(Graphics g){
        g.setColor(Color.BLUE);
        g.fillRect(50, 50, 175, 175);       
    }
    
}

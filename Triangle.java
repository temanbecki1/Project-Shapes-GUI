import java.awt.Color;
import java.awt.Graphics;
import java.awt.*;


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

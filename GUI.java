import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/*
*   Author: Teman Beck
*   Date: November 14th, 2021
*   This class defines our GUI for our main program
*   This class contains our main run method
*/

public class GUI {
    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable() {
            public void run(){
                JFrame frame = new MainFrame("Project 2 Shapes");

                frame.setSize(300,300);
                frame.setVisible(true);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
            

        });
    }
    
}

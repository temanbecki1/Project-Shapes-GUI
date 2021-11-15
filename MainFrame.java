import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame implements ActionListener{
    final static boolean shouldFill = true;

    // private String shape;
    private JButton[] selectShape;
    JPanel drawings;




    public MainFrame(String title){
        super(title);
        setLayout(new BorderLayout());

        JPanel shapeSelectionPanel = new JPanel();                                          //initial panel to hold shape identifier buttons
        shapeSelectionPanel.setLayout(new GridLayout(9,1));                                 //sets layout manager for this Panel
                
        String[] shapeList = { "Circle", "Square", "Triangle", "Rectangle", "Sphere", "Cube", "Cone", "Cylinder", "Torus" };

        selectShape = new JButton[shapeList.length];

        for(int i=0; i < selectShape.length; i++){                                          //for loop to add each JButton to the shapeSelectionPanel
            selectShape[i] = new JButton(shapeList[i]);                                     //initializes respective index to JButton
            selectShape[i].addActionListener(this);                                         //adds actionListeners to each JButton
            
            shapeSelectionPanel.add(selectShape[i]);                                        //adds each selectedShape to the shapeSelectionPanel
        }

        add(shapeSelectionPanel,BorderLayout.CENTER);                                       //adds the shapeSelectionPanel to the mainFrame
          
    }




    @Override
    public void actionPerformed(ActionEvent e) {
        String selected = e.getActionCommand();
        if(selected.equals("Circle")){
            System.out.println("Circle is selected");
        }
        
    }

}
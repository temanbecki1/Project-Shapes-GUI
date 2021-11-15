import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame{
    final static boolean shouldFill = true;

    // private String shape;
    private JButton[] selectShape;
    JPanel drawings;




    public MainFrame(String title){
        super(title);
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        JButton circleButton = new JButton("Circle");
        JButton squareButton = new JButton("Square");
        JButton triangleButton = new JButton("Triangle");
        JButton rectangleButton = new JButton("Rectangle");
        JButton sphereButton = new JButton("Sphere");
        JButton cubeButton = new JButton("Cube");
        JButton coneButton = new JButton("Cone");
        JButton cylinderButton = new JButton("Cylinder");
        JButton torusButton = new JButton("Torus");

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.weighty = 0.25;                                         //give small spacing between our rows on the y axis
        gbc.weightx = 0.25;
        gbc.anchor = GridBagConstraints.CENTER;
        this.add(circleButton, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        this.add(squareButton, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        this.add(triangleButton, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        this.add(rectangleButton, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        this.add(sphereButton, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        this.add(cubeButton, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        this.add(coneButton, gbc);

        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        this.add(cylinderButton, gbc);

        gbc.gridx = 1;
        gbc.gridy = 4;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        this.add(torusButton, gbc);

        circleButton.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                String selected = e.getActionCommand();
                if(selected.equals("Circle")){
                    System.out.println("Circle is selected");
                }
                
            }

        });

        squareButton.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                String selected = e.getActionCommand();
                if(selected.equals("Square")){
                    System.out.println("Square is selected");
                }
                
            }

        });

        triangleButton.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                String selected = e.getActionCommand();
                if(selected.equals("Triangle")){
                    System.out.println("Triangle is selected");
                }
                
            }

        });

        rectangleButton.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                String selected = e.getActionCommand();
                if(selected.equals("Rectangle")){
                    System.out.println("Rectangle is selected");
                }
                
            }

        });

        sphereButton.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                String selected = e.getActionCommand();
                if(selected.equals("Sphere")){
                    System.out.println("Sphere is selected");
                }
                
            }

        });

        cubeButton.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                String selected = e.getActionCommand();
                if(selected.equals("Cube")){
                    System.out.println("Cube is selected");
                }
                
            }

        });

        coneButton.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                String selected = e.getActionCommand();
                if(selected.equals("Cone")){
                    System.out.println("Cone is selected");
                }
                
            }

        });

        cylinderButton.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                String selected = e.getActionCommand();
                if(selected.equals("Cylinder")){
                    System.out.println("Cylinder is selected");
                }
                
            }

        });

        torusButton.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                String selected = e.getActionCommand();
                if(selected.equals("Torus")){
                    System.out.println("Torus is selected");
                }
                
            }

        });



        // JPanel shapeSelectionPanel = new JPanel();                                          //initial panel to hold shape identifier buttons
        // shapeSelectionPanel.setLayout(new GridLayout(9,1));                                 //sets layout manager for this Panel
                
        // String[] shapeList = { "Circle", "Square", "Triangle", "Rectangle", "Sphere", "Cube", "Cone", "Cylinder", "Torus" };

        // selectShape = new JButton[shapeList.length];

        // for(int i=0; i < selectShape.length; i++){                                          //for loop to add each JButton to the shapeSelectionPanel
        //     selectShape[i] = new JButton(shapeList[i]);                                     //initializes respective index to JButton
        //     selectShape[i].addActionListener(this);                                         //adds actionListeners to each JButton
            
        //     shapeSelectionPanel.add(selectShape[i]);                                        //adds each selectedShape to the shapeSelectionPanel
        // }

        // add(shapeSelectionPanel,BorderLayout.CENTER);                                       //adds the shapeSelectionPanel to the mainFrame
          
    }




    // @Override
    // public void actionPerformed(ActionEvent e) {
    //     String selected = e.getActionCommand();
    //     if(selected.equals("Circle")){
    //         System.out.println("Circle is selected");
    //     }
        
    // }

}
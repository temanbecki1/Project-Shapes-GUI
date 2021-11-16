import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
// import java.awt.Color;
// import java.awt.Dimension;
// import java.awt.Graphics;
// import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/*
*Author : Teman Beck
*CMSC 335 Project 2
*Date : November 15th, 2021
*This class extends our GUI class and adds all relative Java Swing components to the GUI
*This class adds action listeners and functionality to all shape buttons.
*/

public class MainFrame extends JFrame{
    final static boolean shouldFill = true;

    // private String shape;
    // private JButton[] selectShape;
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

                    while(true){
                        String radius = JOptionPane.showInputDialog("Enter a valid radius : ");
                        
                        if(isNumeric(radius)){
                            JFrame frame = new JFrame();
                            JLabel jlabel = new JLabel("Your Circle :");
                            frame.add(jlabel, BorderLayout.PAGE_START);

                            Circle myCircle = new Circle();

                            frame.add(myCircle);
                            frame.setSize(400,400);
                            frame.setVisible(true);
                            break;
                        } else {
                            JOptionPane.showMessageDialog(null, "Invalid radius input" );
                            break;
                        }
                    }
                }
                
            }

        });

        squareButton.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                String selected = e.getActionCommand();
                if(selected.equals("Square")){
                    System.out.println("Square is selected");

                    while(true){
                        String sideLength = JOptionPane.showInputDialog("Enter a side length : ");
                        
                        if(isNumeric(sideLength)){
                            //draw square
                            JFrame frame = new JFrame();
                            JLabel jlabel = new JLabel("Your square :");
                            frame.add(jlabel, BorderLayout.PAGE_START);

                            Square mySquare = new Square();

                            frame.add(mySquare);
                            frame.setSize(400,400);
                            frame.setVisible(true);

                            break;
                        } else {
                            JOptionPane.showMessageDialog(null, "Invalid side length input" );
                            break;
                        }
                    }
                }
                
            }

        });

        triangleButton.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                String selected = e.getActionCommand();
                if(selected.equals("Triangle")){
                    System.out.println("Triangle is selected");

                    while(true){
                        String baseLength = JOptionPane.showInputDialog("Enter the base length : ");
                        String heightLength = JOptionPane.showInputDialog("Enter the height length");
                        
                        if(isNumeric(baseLength) && isNumeric(heightLength)){
                            JFrame frame = new JFrame();
                            JLabel jlabel = new JLabel("Your triangle :");
                            frame.add(jlabel, BorderLayout.PAGE_START);

                            Triangle myTriangle = new Triangle();

                            frame.add(myTriangle);
                            frame.setSize(400,400);
                            frame.setVisible(true);
                            break;
                        } else {
                            JOptionPane.showMessageDialog(null, "Invalid base or height length input" );
                            break;
                        }
                    }


                }
                
            }

        });

        rectangleButton.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                String selected = e.getActionCommand();
                if(selected.equals("Rectangle")){
                    System.out.println("Rectangle is selected");

                    while(true){
                        String baseLength = JOptionPane.showInputDialog("Enter the base length : ");
                        String heightLength = JOptionPane.showInputDialog("Enter the height length");
                        
                        if(isNumeric(baseLength) && isNumeric(heightLength)){ 

                            final double compareRatioOne = 0.7 ;                            //closer ratio to 1 = more like square shape
                            final double compareRatioTwo = 0.4 ;
                            
                            String size = "";

                            JFrame frame = new JFrame();
                            JLabel jlabel = new JLabel("Your rectangle:");
                            frame.add(jlabel, BorderLayout.PAGE_START);
                            

                            double ratio = Math.min(Double.valueOf(baseLength), Double.valueOf(heightLength)) / Math.max(Double.valueOf(baseLength), Double.valueOf(heightLength));
                            System.out.println("Ratio is :  " + ratio);
                            System.out.println("compareRatioOne is :  " + compareRatioOne);

                        
                            if(ratio > compareRatioOne){
                                size = "small";
                                System.out.println("Size = :  " + size);
                            } else if(ratio > compareRatioTwo){
                                size = "medium";
                                System.out.println("Size = :  " + size);
                            } else size = "large" ;

                            Rectangle myRectangle = new Rectangle(size);

                            frame.add(myRectangle);
                            frame.setSize(400,400);
                            frame.setVisible(true);

                            break;
                        } else {
                            JOptionPane.showMessageDialog(null, "Invalid base or height length input" );
                            break;
                        }
                    }
                }
                
            }

        });

        sphereButton.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                String selected = e.getActionCommand();
                if(selected.equals("Sphere")){
                    System.out.println("Sphere is selected");

                    while(true){
                        String radius = JOptionPane.showInputDialog("Enter a valid radius : ");
                        
                        if(isNumeric(radius)){

                            Sphere mySphere = new Sphere();
                            mySphere.drawGraphics();

                            break;
                        } else {
                            JOptionPane.showMessageDialog(null, "Invalid radius input" );
                            break;
                        }
                    }
                }
                
            }

        });

        cubeButton.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                String selected = e.getActionCommand();
                if(selected.equals("Cube")){
                    System.out.println("Cube is selected");

                    while(true){
                        String edgeLength = JOptionPane.showInputDialog("Enter an edge length : ");
                        
                        if(isNumeric(edgeLength)){
                            Cube myCube = new Cube();
                            myCube.drawGraphics();

                            break;
                        } else {
                            JOptionPane.showMessageDialog(null, "Invalid edge length input" );
                            break;
                        }
                    }
                }
                
            }

        });

        coneButton.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                String selected = e.getActionCommand();
                if(selected.equals("Cone")){
                    System.out.println("Cone is selected");

                    while(true){
                        String radius = JOptionPane.showInputDialog("Enter the base length : ");
                        String heightLength = JOptionPane.showInputDialog("Enter the height length");
                        
                        if(isNumeric(radius) && isNumeric(heightLength)){
                            Cone myCone = new Cone();
                            myCone.drawGraphics();
                            break;
                        } else {
                            JOptionPane.showMessageDialog(null, "Invalid radius or height length input" );
                            break;
                        }
                    }
                }
                
            }

        });

        cylinderButton.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                String selected = e.getActionCommand();
                if(selected.equals("Cylinder")){
                    System.out.println("Cylinder is selected");

                    while(true){
                        String radius = JOptionPane.showInputDialog("Enter the base length : ");
                        String heightLength = JOptionPane.showInputDialog("Enter the height length");
                        
                        if(isNumeric(radius) && isNumeric(heightLength)){
                            Cylinder myCylinder = new Cylinder();
                            myCylinder.drawGraphics();
                            break;
                        } else {
                            JOptionPane.showMessageDialog(null, "Invalid radius or height length input" );
                            break;
                        }
                    }
                }
                
            }

        });

        torusButton.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                String selected = e.getActionCommand();
                if(selected.equals("Torus")){
                    System.out.println("Torus is selected");

                    while(true){
                        String minorRadius = JOptionPane.showInputDialog("Enter the minor radius  : ");
                        String majorRadius = JOptionPane.showInputDialog("Enter the major radius");

                        if(Double.parseDouble(majorRadius) < Double.parseDouble(minorRadius)){
                            JOptionPane.showMessageDialog(null, "The major radius is smaller than the minor radius. Check inputs and try again.");
                            break;
                        }
                        
                        if(isNumeric(minorRadius) && isNumeric(majorRadius)){
                            Torus myTorus = new Torus();
                            myTorus.drawGraphics();
                            break;
                        } else {
                            JOptionPane.showMessageDialog(null, "Invalid major or minor input" );
                            break;
                        }
                    }
                }
                
            }

        });         
    }


    public static boolean isNumeric(String test){
        if(test == null){
            return false;
        }
        try{
            Double.parseDouble(test);
            return true;
        } catch(NumberFormatException nfe){
            return false;
        }
        //return true;
    }

}
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/*
*   FileName : MainFrame.java
*   Author : Teman Beck
*   CMSC 335 Project 2
*   Date : November 15th, 2021
*   This class extends our GUI class and adds all relative Java Swing components to the GUI
*   This class adds action listeners and functionality to all shape buttons.
*   This class acts as the controller of the program.
*/

public class MainFrame extends JFrame{
    final static boolean shouldFill = true;

    JPanel drawings;




    public MainFrame(String title){
        super(title);                                                                           //super provides title
        setLayout(new GridBagLayout());                                                         //set LayoutManager
        GridBagConstraints gbc = new GridBagConstraints();                                      //initialize new GridBadConstraints

        JButton circleButton = new JButton("Circle");                                           //declare and initialize JButton
        JButton squareButton = new JButton("Square");                                           //declare and initialize JButton
        JButton triangleButton = new JButton("Triangle");                                       //declare and initialize JButton
        JButton rectangleButton = new JButton("Rectangle");                                     //declare and initialize JButton
        JButton sphereButton = new JButton("Sphere");                                           //declare and initialize JButton
        JButton cubeButton = new JButton("Cube");                                               //declare and initialize JButton
        JButton coneButton = new JButton("Cone");                                               //declare and initialize JButton
        JButton cylinderButton = new JButton("Cylinder");                                       //declare and initialize JButton
        JButton torusButton = new JButton("Torus");                                             //declare and initialize JButton


/************************************************************************************************************************************************************/
/*                                Layout consist of two columns                                                                                             */
/************************************************************************************************************************************************************/

        gbc.gridx = 0;                                                                          //x coor (column) for grid
        gbc.gridy = 0;                                                                          //y coor for grid
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.weighty = 0.25;                                                                     //give small spacing between our rows on the y axis
        gbc.weightx = 0.25;
        gbc.anchor = GridBagConstraints.CENTER;
        this.add(circleButton, gbc);                                                            //adds circleButton to gbc layout

        gbc.gridx = 0;                                                                          //x coord (column) for grid
        gbc.gridy = 1;                                                                          //y coor for grid
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        this.add(squareButton, gbc);                                                            //adds squareButton to gbc layout

        gbc.gridx = 0;                                                                          //x coor (column) for grid
        gbc.gridy = 2;                                                                          //y coor for grid
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        this.add(triangleButton, gbc);                                                          //adds triangleButton to gbc layout

        gbc.gridx = 0;                                                                          //x coor (column) for grid
        gbc.gridy = 3;                                                                          //y coord (row) for grid
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        this.add(rectangleButton, gbc);                                                         //adds rectangleButton to gbc layout

        gbc.gridx = 1;                                                                          //x coor (column) for grid
        gbc.gridy = 0;                                                                          //y coord (row) for grid
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        this.add(sphereButton, gbc);                                                            //adds sphereButton to gbc layout

        gbc.gridx = 1;                                                                          //x coor (column) for grid
        gbc.gridy = 1;                                                                          //y coord (row) for grid
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        this.add(cubeButton, gbc);                                                              //adds sphereButton to gbc layout

        gbc.gridx = 1;                                                                          //x coor (column) for grid
        gbc.gridy = 2;                                                                          //y coord (row) for grid
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        this.add(coneButton, gbc);                                                              //adds sphereButton to gbc layout

        gbc.gridx = 1;                                                                          //x coor (column) for grid
        gbc.gridy = 3;                                                                          //y coord (row) for grid
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        this.add(cylinderButton, gbc);                                                          //adds sphereButton to gbc layout

        gbc.gridx = 1;                                                                          //x coor (column) for grid
        gbc.gridy = 4;                                                                          //y coord (row) for grid
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        this.add(torusButton, gbc);                                                             //adds sphereButton to gbc layout


/************************************************************************************************************************************************************/
/*                                Adds ActionListeners to buttons                                                                                           */
/*                                Validates user input                                                                                                      */
/************************************************************************************************************************************************************/

        circleButton.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                String selected = e.getActionCommand();
                if(selected.equals("Circle")){
                    // System.out.println("Circle is selected");                                //Test to check selction was set                                              

                    while(true){
                        String radius = JOptionPane.showInputDialog("Enter a valid radius : "); //JOption pane to request user input
                        
                        if(isNumeric(radius)){                                                  //Boolean to check validity of user input
                            JFrame frame = new JFrame();                                        //initializes instance of JFrame
                            JLabel jlabel = new JLabel("Your Circle :");                        //initializes JLabel
                            frame.add(jlabel, BorderLayout.PAGE_START);

                            Circle myCircle = new Circle();                                     //creates a Circle object

                            frame.add(myCircle);                                                //adds Circle object to frame
                            frame.setSize(400,400);
                            frame.setVisible(true);                                             //allows user to see frame
                            break;
                        } else {
                            JOptionPane.showMessageDialog(null, "Invalid radius input" );       //displays error message informing user of invalid radius
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
                    //System.out.println("Square is selected");                                 //Test to check selction was set

                    while(true){
                        String sideLength = JOptionPane.showInputDialog("Enter a side length : ");
                        
                        if(isNumeric(sideLength)){                                              //Boolean to check validity of user input
                            
                            JFrame frame = new JFrame();
                            JLabel jlabel = new JLabel("Your square :");
                            frame.add(jlabel, BorderLayout.PAGE_START);

                            Square mySquare = new Square();                                     //creates instance of Square object

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
                    // System.out.println("Triangle is selected");                              //Test to check selction was set

                    while(true){
                        String baseLength = JOptionPane.showInputDialog("Enter the base length : ");
                        String heightLength = JOptionPane.showInputDialog("Enter the height length");
                        
                        if(isNumeric(baseLength) && isNumeric(heightLength)){                   //Boolean to check validity of user input
                            JFrame frame = new JFrame();
                            JLabel jlabel = new JLabel("Your triangle :");
                            frame.add(jlabel, BorderLayout.PAGE_START);

                            Triangle myTriangle = new Triangle();                               //creates instance of Triangle object

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
                    //System.out.println("Rectangle is selected");                              //Test to check selction was set

                    while(true){
                        String baseLength = JOptionPane.showInputDialog("Enter the base length : ");
                        String heightLength = JOptionPane.showInputDialog("Enter the height length");
                        
                        if(isNumeric(baseLength) && isNumeric(heightLength)){                   //Boolean to check validity of user input

                            final double compareRatioOne = 0.7 ;                                //double to determine rectangle apperance. The closer ratio to 1, more resembles square
                            final double compareRatioTwo = 0.4 ;                                //double to determine shape type. The closer to ratio to 0, the more resembles thin rectangle
                            
                            String size = "";                                                   //Declare and initialize String to assign rectangle type 

                            JFrame frame = new JFrame();
                            JLabel jlabel = new JLabel("Your rectangle:");
                            frame.add(jlabel, BorderLayout.PAGE_START);
                            

                            double ratio = Math.min(Double.valueOf(baseLength), Double.valueOf(heightLength)) / Math.max(Double.valueOf(baseLength), Double.valueOf(heightLength));     //calculates ratio of base and height
                            // System.out.println("Ratio is :  " + ratio);                      //test points to check flow of data
                            // System.out.println("compareRatioOne is :  " + compareRatioOne);  //test point to check flow of data and expected outcome

                        
                            if(ratio > compareRatioOne){
                                size = "small";                                                 //sets size to small
                                // System.out.println("Size = :  " + size);                     //test point to check flow of data and expected outcome                       
                            } else if(ratio > compareRatioTwo){
                                size = "medium";                                                //sets size to medium
                                //System.out.println("Size = :  " + size);                      //test point to check flow of data and expected outcome
                            } else size = "large" ;                                             //default rectangle , sets size to large

                            Rectangle myRectangle = new Rectangle(size);                        //creates new rectangle object

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
                    // System.out.println("Sphere is selected");                                //test point to check flow of data and expected outcome

                    while(true){
                        String radius = JOptionPane.showInputDialog("Enter a valid radius : "); //ask user for radius input
                        
                        if(isNumeric(radius)){                                                  //Boolean to check validity of user input

                            Sphere mySphere = new Sphere();                                     //creates new Sphere object
                            mySphere.drawGraphics();                                            //calls drawGraphics() on this instance of cube

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
                    // System.out.println("Cube is selected");                                  //test point to check flow of data and expected outcome

                    while(true){
                        String edgeLength = JOptionPane.showInputDialog("Enter an edge length : ");
                        
                        if(isNumeric(edgeLength)){                                              //Boolean to check validity of user input
                            Cube myCube = new Cube();                                           //creates new Cube object
                            myCube.drawGraphics();                                              //calls drawGraphics() on this instance of cube

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
                    //System.out.println("Cone is selected");                                   //test point to check flow of data and expected outcome

                    while(true){
                        String radius = JOptionPane.showInputDialog("Enter the radius : ");             //ask user for radius
                        String heightLength = JOptionPane.showInputDialog("Enter the height length");   //ask user for height
                        
                        if(isNumeric(radius) && isNumeric(heightLength)){                       //Boolean to check validity of user input
                            Cone myCone = new Cone();                                           //creates new instance of Cone object
                            myCone.drawGraphics();                                              //call to drawGraphics()
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
                    // System.out.println("Cylinder is selected");                              //test point to check flow of data and expected outcome

                    while(true){
                        String radius = JOptionPane.showInputDialog("Enter the radius length : ");      //ask user for radius
                        String heightLength = JOptionPane.showInputDialog("Enter the height length");   //ask user for height
                        
                        if(isNumeric(radius) && isNumeric(heightLength)){                       //Boolean to check validity of user input
                            Cylinder myCylinder = new Cylinder();                               //creates instance of Cylinder object
                            myCylinder.drawGraphics();                                          //call to drawGraphics()
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
                    // System.out.println("Torus is selected");                                 //test point to check flow of data and expected outcome

                    while(true){
                        String minorRadius = JOptionPane.showInputDialog("Enter the minor radius  : ");
                        String majorRadius = JOptionPane.showInputDialog("Enter the major radius");

                        if(Double.parseDouble(majorRadius) < Double.parseDouble(minorRadius)){
                            JOptionPane.showMessageDialog(null, "The major radius is smaller than the minor radius. Check inputs and try again.");
                            break;
                        }
                        
                        if(isNumeric(minorRadius) && isNumeric(majorRadius)){                   //Boolean to check validity of user input
                            Torus myTorus = new Torus();                                        //creates instance of Torus object
                            myTorus.drawGraphics();                                             //call to drawGraphics
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


/************************************************************************************************************************************************************/
/*                                Boolean method to test validity of user input. Returns false if exceptions are thrown                                     */
/************************************************************************************************************************************************************/

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
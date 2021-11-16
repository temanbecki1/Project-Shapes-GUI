import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
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

                    while(true){
                        String radius = JOptionPane.showInputDialog("Enter a valid radius : ");
                        
                        if(isNumeric(radius)){
                            //TODO
                            //draw circle
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
                            //TODO
                            //draw square
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
                            //TODO
                            //draw triangle
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

                            final double compareRatioOne = 1/3 ;
                            final double compareRatioTwo = 1/4 ;
                            final double compareRatioThree = 1/6;

                            JFrame frame = new JFrame();
                            JLabel jlabel = new JLabel("Your rectangle:");
                            frame.add(jlabel, BorderLayout.PAGE_START);

                            double ratio = Math.min(Double.valueOf(baseLength), Double.valueOf(heightLength)) / Math.max(Double.valueOf(baseLength), Double.valueOf(heightLength));
                            
                            // if(ratio > compareRatioThree){
                            //     //create new rectangle with smaller difference in side lengths
                            //     Rectangle myRectangle = new Rectangle(160, 80, 45, 150);

                            //     frame.add(myRectangle);
                            //     frame.setSize(400,400);
                            //     frame.setVisible(true);
                            // } else if (ratio > compareRatioTwo){
                            //     //create new rectangle with increasing difference in side lengths
                            //     Rectangle myRectangle = new Rectangle(160, 80, 60, 125);

                            //     frame.add(myRectangle);
                            //     frame.setSize(400,400);
                            //     frame.setVisible(true);
                            // } else {
                            //     Rectangle myRectangle = new Rectangle(160, 80, 60, 150);

                            //     frame.add(myRectangle);
                            //     frame.setSize(400,400);
                            //     frame.setVisible(true);
                            // }

                            Rectangle myRectangle = new Rectangle();
                            // JFrame frame = new JFrame();
                            // JLabel jlabel = new JLabel("Your rectangle:");
                            // frame.add(jlabel, BorderLayout.PAGE_START);

                            frame.add(myRectangle);
                            frame.setSize(400,400);
                            frame.setVisible(true);

                            // JFrame jframeRectangle = new JFrame();
                            // Color color = Color.BLUE;
                            // Rectangle myRectangle = new Rectangle(title, 50, 50, 0, 0, color);

                            // jframeRectangle.add(myRectangle.paint(null));

                            // jframeRectangle.add(myRectangle, BorderLayout.CENTER);
                            // jframeRectangle.setSize(new Dimension(400,400));
                            // jframeRectangle.setVisible(true);
                            
                            // Graphics graphic;
                            // myRectangle.paint(graphic);

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
                            //TODO
                            //draw sphere
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
                            //TODO
                            //draw cube
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
                            //TODO
                            //draw cone
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
                            //TODO
                            //draw cylinder
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
                            //TODO
                            //draw Torus
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




    // @Override
    // public void actionPerformed(ActionEvent e) {
    //     String selected = e.getActionCommand();
    //     if(selected.equals("Circle")){
    //         System.out.println("Circle is selected");
    //     }
        
    // }

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
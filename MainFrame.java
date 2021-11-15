import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainFrame extends JFrame implements ItemListener{
    final static boolean shouldFill = true;
    final static String CIRCLE = "Card for circle";
    final static String SQUARE = "Card for square";
    final static String TRIANGLE = "Card for triangle";
    final static String RECTANGLE = "Card for rectangle";
    final static String SPHERE = "Card for Sphere";
    final static String CUBE = "Card for Sphere";
    final static String CONE = "Card for cone";
    final static String CYLINDER = "Card for cylinder";
    final static String TORUS = "Card for Torus";
    private JPanel cardsPanel;                                                                  //JPanel to hold cards
    private CardLayout card = new CardLayout();                                                                    

    // private String shape;
    JButton selectShape = new JButton("Test");

    // Create the panels that contain our cards
    JPanel circleCard = new JPanel();
    JPanel squareCard = new JPanel();
    JPanel triangleCard = new JPanel();
    JPanel rectangleCard = new JPanel();
    JPanel sphereCard = new JPanel();
    JPanel cubeCard = new JPanel();
    JPanel coneCard = new JPanel();
    JPanel cylinderCard = new JPanel();
    JPanel torusCard = new JPanel();


    public MainFrame(String title){
        super(title);

        JPanel comboBoxPane = new JPanel();
        JLabel selectionLabel = new JLabel("Select your shape");

        String[] shapeList = { "Circle", "Square", "Triangle", "Rectangle", "Sphere", "Cube", "Cone", "Cylinder", "Torus" };
        JComboBox comboBox = new JComboBox<>(shapeList);
        
        comboBox.setEditable(false);
        comboBox.addItemListener(this);
        comboBoxPane.add(selectionLabel);
        comboBoxPane.add(comboBox);
        comboBoxPane.add(selectShape);

        selectShape.setEnabled(false);
        
        


        // // Create the panels that contain our cards
        // JPanel circleCard = new JPanel();
        // JPanel squareCard = new JPanel();
        // JPanel triangleCard = new JPanel();
        // JPanel rectangleCard = new JPanel();
        // JPanel sphereCard = new JPanel();
        // JPanel cubeCard = new JPanel();
        // JPanel coneCard = new JPanel();
        // JPanel cylinderCard = new JPanel();
        // JPanel torusCard = new JPanel();
        
        cardsPanel = new JPanel(new CardLayout());
        // card = new CardLayout();
        cardsPanel.setLayout(card);

        cardsPanel.add(circleCard, CIRCLE);
        cardsPanel.add(squareCard, SQUARE);
        cardsPanel.add(triangleCard, TRIANGLE);
        cardsPanel.add(rectangleCard, RECTANGLE);
        cardsPanel.add(sphereCard, SPHERE);
        cardsPanel.add(cubeCard, CUBE);
        cardsPanel.add(coneCard, CONE);
        cardsPanel.add(cylinderCard, CYLINDER);
        cardsPanel.add(torusCard, TORUS);

        
        this.add(comboBoxPane, BorderLayout.PAGE_START);
        this.add(cardsPanel, BorderLayout.CENTER);

    }


    @Override
    public void itemStateChanged(ItemEvent event) {
        CardLayout cl = (CardLayout) cardsPanel.getLayout();
        cl.show(cardsPanel, (String)event.getItem());  

        selectShape.setEnabled(true);
       
        //get selection from comboBox
        String selectedValue = (String) event.getItem().toString();
        System.out.println("Selected value : " + selectedValue);

        //check string for shape comparison
        switch(selectedValue){
            case "Circle" :

            break;
            case "Square":

            break;
            case "Triangle" :

            break;
            case "Rectangle" :

            break;
            case "Sphere":

            break;
            case "Cube":

            break;
            case "Cone" :

            break;
            case "Cylinder" :

            break;
            case "Torus":
            
            break;
        }
        
            
    }
}

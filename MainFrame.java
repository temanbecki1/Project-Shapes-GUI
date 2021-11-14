import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
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
    JPanel cards;

    // private String shape;
    // JButton selectShape;


    public MainFrame(String title){
        super(title);

        //selectShape = new JButton("Select Shape");

        JPanel comboBoxPane = new JPanel();

        Object[] shapeList = { "Circle", "Square", "Triangle", "Rectangle", "Sphere", "Cube", "Cone", "Cylinder", "Torus" };
        JComboBox comboBox = new JComboBox<>(shapeList);
        comboBox.setEditable(false);
        comboBox.addItemListener(this);
        comboBoxPane.add(comboBox);


        // Create the panels that contain our cards
        JPanel circleCard = new JPanel();
        circleCard.add(new JTextField("Circle", 20));

        JPanel squareCard = new JPanel();
        squareCard.add(new JTextField("Square", 20));

        JPanel triangleCard = new JPanel();
        triangleCard.add(new JTextField("Triangle", 20));

        JPanel rectangleCard = new JPanel();
        rectangleCard.add(new JTextField("Rectangle", 20));

        JPanel sphereCard = new JPanel();
        sphereCard.add(new JTextField("Sphere", 20));

        JPanel cubeCard = new JPanel();
        cubeCard.add(new JTextField("Cube", 20));

        JPanel coneCard = new JPanel();
        coneCard.add(new JTextField("Cone", 20));

        JPanel cylinderCard = new JPanel();
        cylinderCard.add(new JTextField("Cylinder", 20));

        JPanel torusCard = new JPanel();
        torusCard.add(new JTextField("Torus", 20));

        cards = new JPanel(new CardLayout());
        cards.add(circleCard, CIRCLE);
        cards.add(squareCard, SQUARE);
        cards.add(triangleCard, TRIANGLE);
        cards.add(rectangleCard, RECTANGLE);
        cards.add(sphereCard, SPHERE);
        cards.add(cubeCard, CUBE);
        cards.add(coneCard, CONE);
        cards.add(cylinderCard, CYLINDER);
        cards.add(torusCard, TORUS);

        this.add(comboBoxPane, BorderLayout.PAGE_START);
        this.add(cards, BorderLayout.CENTER);

    }


    @Override
    public void itemStateChanged(ItemEvent e) {
        // TODO Auto-generated method stub
        
    }

    // public void shapeSelectionChange(Item event){
    //     CardLayout cl = (CardLayout)(cards.getLayout());
    //     cl.show(cards, (String)event.getItem());
    // }
    
}


// JOptionPane.showMessageDialog(null, comboBox, "Please select a shape", JOptionPane.QUESTION_MESSAGE);
// frame.add(comboBox);
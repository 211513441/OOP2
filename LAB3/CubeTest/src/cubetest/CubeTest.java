package cubetest;
// Create a JFrame class (CubeTest) that contains JTextField and JLabel objects. Once the user presses the enter key in the JTextField,
// compute the cube value inside JTextField and display the result in JLabel. Set the frame size to 300x300.
// add a JButton that when clicked will also compute the cube value inside it and display the result in JLabel. 
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class CubeTest extends JFrame implements ActionListener {
    
    public static JTextField tf=new JTextField(10);
    public static JLabel lbl=new JLabel("result");
    public static JButton b=new JButton("Compute");
    
    public static void main(String[] args) {
        
        CubeTest f=new CubeTest();
        f.setSize(200,200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(new FlowLayout());
        f.add(tf);
        f.add(lbl);
        f.add(b);
        f.setVisible(true);            
        tf.addActionListener(f);  // add ActionListener to textField to respond to Action events 
        b.addActionListener(f);   // add ActionListener to button to respond to Action events
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        int n=Integer.parseInt(tf.getText()); // get the text from the textField and convert it to integer 
        int cube=n*n*n;                       // if the user pressed Enter in the textField, textField will generate Action event  // if the user clicked the button, the button will generate Action event
        lbl.setText(""+cube);                 // display the result of cube in result label   
    }
     // tf.setText(""+cube);  // Display the result of cube in the textField
            
}

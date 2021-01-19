/* Create a JFrame class (SimpleMath) that contains 2 JTextFields, 2 JButtons and JLabel objects. 
The sum and product of the 2 numbers entered via 2 JTextFields will be computed after clicking the first and second JButtons respectively. 
Put the result in JLabel and Set the JFrame size to 300x300. */
import java.awt.FlowLayout;
import java.awt.event.ActionListener; // ActionListener in the button will respond to Action events
import java.awt.event.ActionEvent;    // if user clicked the button, the button will generate ActionEvent
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class SimpleMath extends JFrame implements ActionListener {  // ActionListener interface override actionPerformed method
                                                                    // ActionListener interface implements actionPerformed method   
    public static JTextField tf1=new JTextField(10);    // create a new textField with size 10
    public static JTextField tf2=new JTextField(10);    // create a new textField with size10
    public static JButton btn1=new JButton("Sum");      // create a new button sum
    public static JButton btn2=new JButton("Product");  // create a new button prodct
    public static JLabel lbl1=new JLabel("Result");     // create a new label result
    
    public static void main(String[]args) {
        
        SimpleMath frm=new SimpleMath();
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setSize(300,300);                                    // set the width and height of the window
        frm.setTitle("Sum and product program");                 // put a title for the window
        frm.setVisible(true);
        frm.setLayout(new FlowLayout());                         // arrange componenets in the window
        frm.add(tf1);                                            // add textField1 to JFrame // add textField1 to the window
        frm.add(tf2);                                            // add textField2 to JFrame // add textField2 to the window
        frm.add(btn1);                                           // add button1 to JFrame    // add button1 to the window
        frm.add(btn2);                                           // add button2 to JFrame
        frm.add(lbl1);
        btn1.addActionListener(frm);                             // add ActionListener to button1 to respond to ActionEvents
        btn2.addActionListener(frm);                             // add ActionListener to button2 to respond to ActionEvents
    }
    
    public void actionPerformed(ActionEvent event) {
        
        int num1=Integer.parseInt(tf1.getText());              // get the text from textField1 // get the value from textField1
        int num2=Integer.parseInt(tf2.getText());              // get the text from textField2 // get the value from textField2
        int sum=num1+num2;    
        int product=num1*num2;
        
        if (event.getSource()==btn1)             // if user pressed button1 (sum) // button1 will generate ActionEvent // ActionListener in button1 will respond to ActionEvents
            lbl1.setText("Sum= "+sum);           // if the source of the event is button1 // set the text for label1
        
        else if (event.getSource()==btn2)        // if user pressed button2 (product), button2 will generate ActionEvent // ActionListener in button2 will respond to ActionEvents
            lbl1.setText("Product= "+product);   // set the text for label1
        
                
                
                
    }
    
    
    
}

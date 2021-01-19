package myfirstframe;
// Create a JFrame class (MyFirstFrame) that contains a JLabel object with text value of “My First JLabel” and a JTextField of size 10.
// Set the JFrame size to 300x300. Note: Let the class extend JFrame, then instantiate it (the class) inside main() method.

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class MyFirstFrame extends JFrame {                    // MyFirstFrame subclass inherit all methods of JFrame class
    public static JLabel lbl=new JLabel("My First JLabel");   // MyFirstFrame inherit setTitle,setSize,setLayout methods from JFrame class
    public static JTextField tf=new JTextField("Hello",10);
    public static JPasswordField pf=new JPasswordField(10);
    
    
    public static void main(String[]args) {
        MyFirstFrame f=new MyFirstFrame();
        f.setTitle("First Frame");
        f.setSize(300,300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(new FlowLayout());
        f.add(lbl);
        f.add(tf);
        f.add(pf);
        f.setVisible(true);
        
        
        
    }
    
    
}

   

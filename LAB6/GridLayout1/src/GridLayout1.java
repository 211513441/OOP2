import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JButton;

public class GridLayout1 extends JFrame {
    public static JButton b1=new JButton("Button1");
    public static JButton b2=new JButton("Button2");
    public static JButton b3=new JButton("Button3");
    public static JButton b4=new JButton("Button4");
    public static JButton b5=new JButton("Button5");
    public static JButton b6=new JButton("Button6");
    public static JButton b7=new JButton("Button7");
    public static JButton b8=new JButton("Button8");
    
    public static void main(String[]args ) {
        GridLayout1 f=new GridLayout1();
        f.setSize(300,200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(new GridLayout(3,0));
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(b7);
        f.add(b8);
        f.setVisible(true);
        
        
        
        // parallel you see one button
        // sequential you see one button
        // vertical you see three button
        
    }

    
            
    
}

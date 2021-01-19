import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
/* Create a JFrame class (SampleTextArea) that contains a JTextArea object Set the JFrame size to 300x300. (run and observe text wrapping)
Later: setLineWrap to true (run and observe). selWrapStyleWord to true (run and observe) 
add a JScrollPane to the JTextArea. Set the Vertical and Horizontal bars as needed. Later, setLineWrap to false. Run and observe.*/

public class SampleTextArea extends JFrame implements ItemListener {
    public static JTextArea ta=new JTextArea(10,15);
    public static JScrollPane sp=new JScrollPane(ta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
    
    
    public static void main(String[]args) {
        SampleTextArea frm=new SampleTextArea();
        frm.setLayout(new FlowLayout());
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setSize(300,300);
        frm.add(sp);
        //ta.setLineWrap(true);
        ta.setWrapStyleWord(true);
        frm.setVisible(true);   
    }
    
    @Override
    public void itemStateChanged(ItemEvent e) {
        
    }
    
    
}

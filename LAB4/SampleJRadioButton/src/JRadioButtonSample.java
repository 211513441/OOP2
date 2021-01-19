/* Create a JFrame class (JRadioButtonSample) that contains a JLabel (with text “I love Java”)and 2 JRadioButtons 
   (with texts of “Bold” and “Italic”). Change the font style of the JLabel depending on the selection among the JRadioButtons. 
   Set the JFrame size to 200x300 and the title to “RadioButton Rules”.*/
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class JRadioButtonSample extends JFrame implements ItemListener {    // ItemListener interface overrides itemStateChanged method
    
    public static JLabel lbl=new JLabel("I love Java");         // create a label with text
    public static JRadioButton rb1=new JRadioButton("Bold");    // create radio button1 with text
    public static JRadioButton rb2=new JRadioButton("Italic");  // create radio Button2 Italic
    public static ButtonGroup bg=new ButtonGroup();             // buttonGroup put JRadioButtons in one group which you can select only one JRadioButton from many JRadioButtons.  
                                                                // You can't select two JRadioButtons if you put them in buttonGroup
    public static void main(String[]args) {
        JRadioButtonSample frm=new JRadioButtonSample();
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setSize(300,200);
        frm.setLayout(new FlowLayout());
        frm.setTitle("RadioButton Rules");            // put a title for the window
        frm.setVisible(true);
        frm.add(lbl);                                 // add label to JFrame
        frm.add(rb1);                                 // add radioButton1 to JFrame
        frm.add(rb2);                                 
        bg.add(rb1);                                  // add radioButton1 to buttonGroup
        bg.add(rb2);                                  // add radioButton2 to ButtonGroup
        rb1.addItemListener(frm);                     // add itemListener to radioButton1 to respond to itemEvents
        rb2.addItemListener(frm);                     // add itemListener to radioButton2 to respond to ItemEvents
    }
    
    public void itemStateChanged(ItemEvent event) {
        
        if (rb1.isSelected())                               // if radioButton1 is selected change the font style for label to Bold
            lbl.setFont(new Font("Arial",Font.BOLD,16));
        else                                                // if radioButton1 is not selected, radioButton2 is selected
            lbl.setFont(new Font("Arial",Font.ITALIC,16));  // change the font style for label to Italic
        
                    
            
            
        
        
    }
    
    
    
    
    
    
}

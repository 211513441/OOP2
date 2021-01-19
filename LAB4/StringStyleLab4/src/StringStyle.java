/* Create a JFrame class (StyleString) that contains a JLabel (with text “I’m proud of KFU”) and  a JCheckBox (with text of “Bold”). 
 * Change the font style of the JLabel depending on the selection of the JCheckBox. 
   Set the JFrame size to 200x300 and the title to “CheckBox Rules”. */

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

                                                                                 // ItemListener overRides actionPerformed method
public class StringStyle extends JFrame implements ActionListener,ItemListener { // you can extends one class and you can implements many interfaces
    public static JLabel lbl=new JLabel("I'm proud of KFU");                     // It is better to implement only one ActionListener or ItemListener for checkBox  
    public static JCheckBox cb=new JCheckBox("Bold");                            // The difference between ActionListener and ItemListener: ActionListener respond to 1 Action only the user checked the box  
                                                                                 // ItemListener respond to 2 Actions the user checked the box, the user unchecked the box
    public static void main(String[]args) {                               
        
        StringStyle frm=new StringStyle(); 
        frm.setLayout(new FlowLayout());
        frm.setSize(200,200);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setTitle("CheckBox Rules");
        frm.add(lbl);
        frm.add(cb);
        frm.setVisible(true); 
        // cb.addActionListener(frm);
        cb.addItemListener(frm);            // add ItemListener to checkBox1 to respond to item Events
    } 

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (cb.isSelected())                                // if checkBox1 is selected change the font style to BOLD for label1
            lbl.setFont(new Font("Gothic",Font.BOLD,14));   // set the font style for label1 Bold
        else
            lbl.setFont(new Font("Gothic",Font.PLAIN,14));  // if checkBox1 is not selected set the font style for label1 PLAIN
        
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
       /* if (cb.isSelected()) 
            lbl.setFont(new Font("Gothic",Font.BOLD,14));
        else
            lbl.setFont(new Font("Gothic",Font.PLAIN,14));*/
    }

    
    
    
    
    
    
    
}

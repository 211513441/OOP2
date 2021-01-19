/* Create a JFrame class (LogIn ) that enables a user to insert his username and password. 
Once the, user presses the enter key in the JPasswordField, compare the inserted username and password
with already stored username “ali” and password “123456”. If they are matched, use a JLabel to show “Welcome Ali”, 
otherwise, display in the same JLabel "LogIn Failed!" The frame contains three JLabels, one JTextField, and one JPasswordField objects. 
Set the frame size to 250x200.

The JFrame should somehow look like:

======================
Username: ____________
Password: ____________

Message
======================  */
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;

public class LogIn extends JFrame implements ActionListener {
    
    public static JLabel lbl1=new JLabel("Username: ");
    public static JLabel lbl2=new JLabel("Password: ");
    public static JTextField tf=new JTextField(10);
    public static JPasswordField pf=new JPasswordField(10);
    public static JLabel lbl3=new JLabel("Message");
    
    public static void main(String[]args) {
        
        LogIn frm=new LogIn();
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setSize(250,200);
        frm.setVisible(true);
        frm.setLayout(new FlowLayout());
        frm.add(lbl1);
        frm.add(tf);
        frm.add(lbl2);
        frm.add(pf);
        frm.add(lbl3);
        pf.addActionListener(frm);
    }
    
    public void actionPerformed(ActionEvent e) {
        String username="Ali";
        String password="pass123";
        if (tf.getText().equals(username) && pf.getText().equals(password))
            lbl3.setText("Welcome Ali");
        else
            lbl3.setText("LogIn Failed");
        
        
    }
            
                         
}

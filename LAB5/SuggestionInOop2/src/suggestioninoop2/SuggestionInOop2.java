package suggestioninoop2;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*; 
public class SuggestionInOop2 extends JFrame implements ActionListener{
public static JLabel lbl=new JLabel("These are my suggestions in OOP2");
public static JPanel p1=new JPanel();
public static JPanel p2=new JPanel();
public static JPanel p3=new JPanel();
public static JTextArea tx =new JTextArea(); 
public static JButton b1=new JButton("Reset");
public static JButton b2=new JButton("Add");
 
public static void main(String[] args) {
    SuggestionInOop2 f=new SuggestionInOop2 ();
     f.setSize(400, 400);
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     p1.setLayout(new BorderLayout());
     f.add(p1,BorderLayout.NORTH);
             p1.add(lbl);
      p2.setLayout(new BorderLayout());
     f.add(p2,BorderLayout.CENTER);
             p2.add(tx);
             p3.setLayout(new BorderLayout());
     f.add(p3,BorderLayout.SOUTH);
  
             p3.add(b1);
              p3.add(b2);
 
              b1.addActionListener(f);
              b2.addActionListener(f);
      f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==b1)
           tx.setText(null);
       else
           if(e.getSource()==b2)
               JOptionPane.showMessageDialog(rootPane, "Message");
    }
    }



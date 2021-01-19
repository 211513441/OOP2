
package sample;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Sample extends JFrame implements ActionListener {
public static JButton bt1=new JButton("Reset");
public static JButton bt2=new JButton("Add");
public static JLabel lbl1=new JLabel("Suggestions :");
public static JLabel lbl2=new JLabel("Thank you !!");
public static JPanel p1=new JPanel();
public static JPanel p2=new JPanel();
public static JPanel p3=new JPanel();
public static JTextArea tx=new JTextArea();
    
    public static void main(String[] args) {
         Sample f=new Sample();
       
        f.setSize(400, 400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(p1,BorderLayout.NORTH);
      p1.setLayout(new BoxLayout(p1, BoxLayout.X_AXIS));
       p1.add(bt1);
       p1.add(bt2);
       f.add(p2,BorderLayout.CENTER);
       p2.setLayout(new BoxLayout(p2, BoxLayout.Y_AXIS));
       p2.add(lbl1);
       p2.add(tx);
       f.add(p3,BorderLayout.SOUTH);
      p3.setLayout(new BoxLayout(p3, BoxLayout.Y_AXIS)); 
       p3.add(lbl2);
       f.setVisible(true);
       bt1.addActionListener(f);
       bt2.addActionListener(f);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==bt1)
            tx.setText(null);
    if(e.getSource()==bt2)
         JOptionPane.showMessageDialog(rootPane, "Suggestion added");
    }
}

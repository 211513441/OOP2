
package problem;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class Problem extends JFrame implements ActionListener  {
    public static JButton res=new JButton("Reset");
    public static JButton ad=new JButton("Add");
    public static JLabel lbl1=new JLabel("Suggestions:");
    public static JLabel lbl2=new JLabel("Thank you!!!!::");
    
    public static JPanel p1=new JPanel();
    public static JPanel p2=new JPanel();
    public static JPanel p3=new JPanel();
    public static JTextArea ta=new JTextArea(); 


    
    public static void main(String[] args) {
      Problem f=new Problem();
      f.setSize(400, 400);
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      f.add(p1,BorderLayout.NORTH);
      p1.setLayout(new BoxLayout(p1, BoxLayout.X_AXIS));
      p1.add(res);
      p1.add(ad);
     
      
      f.add(p2,BorderLayout.CENTER);
     p2.setLayout(new BoxLayout(p2, BoxLayout.X_AXIS));
     p2.add(lbl1);
     p2.add(ta);
     
     f.add(p3,BorderLayout.SOUTH);
     p3.setLayout(new BoxLayout(p3, BoxLayout.X_AXIS));
     p3.add(lbl2);
     
      f.setVisible(true);
      
      res.addActionListener(f);
      ad.addActionListener(f);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==res)
            ta.setText(" ");
        else if(e.getSource()==ad)
            JOptionPane.showMessageDialog(rootPane, "Suggestions is added");
        
        
    }
}

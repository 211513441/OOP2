package manylayout;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/*Create a JFrame class (SampleLayout) that contains 5 JButtons. Set the JFrame size to 400x400. Do not set any layout. 
Note: BorderLayout is the default layout. 
Later: Place the 5 JButtons in North, South, East, West, and Center using BorderLayout. Add a JLabel beside the first JButton in the North.
add 2 more JPanels in the center and south (BorderLayout). Make the layout of 1st and 3rd JPanels to BoxLayout in the Y_AXIS
make the layout of 2nd JPanel to BoxLayout in the X_AXIS. Add 2nd & 3rd JButtons to 2nd JPanel add 4th & 5th JButtons to 3rd JPanel */
public class ManyLayout extends JFrame implements ActionListener{
    
    public static JButton bt1=new JButton("Button1");
    public static JButton bt2=new JButton("Button2");
    public static JButton bt3=new JButton("Button3");
    public static JButton bt4=new JButton("Button4");
    public static JButton bt5=new JButton("Button5");
    public static JLabel lbl=new JLabel("Hallo");
    public static JPanel p1=new JPanel();
    public static JPanel p2=new JPanel();
    public static JPanel p3=new JPanel();
   
    public static void main(String[] args) {
        ManyLayout f=new ManyLayout();
        f.setSize(400, 400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(p1,BorderLayout.NORTH);
        p1.setLayout(new BoxLayout(p1, BoxLayout.Y_AXIS));
        p1.add(bt1);
        p1.add(lbl);
       
        f.add(p2,BorderLayout.CENTER);
        p2.setLayout(new BoxLayout(p2, BoxLayout.X_AXIS));
        p2.add(bt2);
        p2.add(bt3);
       
        f.add(p3,BorderLayout.SOUTH);
        p3.setLayout(new BoxLayout(p3, BoxLayout.Y_AXIS)); 
        p3.add(bt4);
        p3.add(bt5);
        f.setVisible(true);
        bt1.addActionListener(f);
        bt5.addActionListener(f);
   
       /* f.add(bt2,BorderLayout.SOUTH);
        f.add(bt3,BorderLayout.EAST);
        f.add(bt4,BorderLayout.WEST);
        f.add(bt5,BorderLayout.CENTER);
        f.setVisible(true); */
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==bt1)
           JOptionPane.showMessageDialog(rootPane, "1st Button is Clicked");
       else if (e.getSource()==bt5)
           JOptionPane.showMessageDialog(rootPane, "5st Button is Clicked");
    }
}

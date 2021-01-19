import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
/*Similar to the figure on the right, create a JFrame class (GroupLayout1) that contains 3 JButtons inside a JPanel. Set the JFrame size to 300x200. Use GroupLayout for the JPanel. */
public class Problem extends JFrame {
    
    public static JButton b1=new JButton("Button1");
    public static JButton b2=new JButton("Button2");
    public static JButton b3=new JButton("Button3");
    public static JButton b4=new JButton("Button4");
    public static JButton b5=new JButton("Button5");
    public static JButton b6=new JButton("Button6");
    public static JPanel p1=new JPanel();
    
    public static void main(String[]args) {
        Problem f=new Problem();
        f.setSize(300,200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        GroupLayout layout=new GroupLayout(p1);
        
        p1.setLayout(layout);
        f.add(p1);                                                      // horizontal: column // vertical: row
        layout.setHorizontalGroup(layout.createSequentialGroup()
             
             .addGroup(layout.createParallelGroup()
                      .addComponent(b1)
                      .addComponent(b2)
                      .addComponent(b3) 
                )
             .addGroup(layout.createParallelGroup()
                      .addComponent(b4)
                      .addComponent(b5)
                      
                )     
                .addComponent(b6)
        );
        
        layout.setVerticalGroup(layout.createSequentialGroup()
                  .addGroup(layout.createParallelGroup()
                      .addComponent(b1)
                      .addComponent(b4)
                      .addComponent(b6) 
                )
             .addGroup(layout.createParallelGroup()
                      .addComponent(b2)
                      .addComponent(b5)
                      
                )   
                 .addComponent(b3)
         );
        
        
        
        
        
        
       /* layout.setVerticalGroup(layout.createParallelGroup()
                
                  .addComponent(b1)
                  .addComponent(b2)
                  .addComponent(b3)
                   ); */
        
        
    }
    
    
    
}

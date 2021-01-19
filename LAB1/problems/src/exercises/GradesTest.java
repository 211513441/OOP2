package exercises;
import java.util.*;
// In GradesTest class, call displayDetails method. Next, assign the values “Yousef”, 95, 85, and 90 to the variables. 
// Finally, call the methods getAverage and displayDetails.
public class GradesTest {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        StudentDetails s1=new StudentDetails();
        s1.getAverage();
        s1.dispalyDetails();
        
        
        StudentDetails s2=new StudentDetails("Yousef",95,85,90); 
        s2.getAverage();
        s2.dispalyDetails();
        
        
        
        
        // System.out.println("The Average of student is "+s2.getAverage());
        
        
        
        
        
     
      
 }
    
    
    
}

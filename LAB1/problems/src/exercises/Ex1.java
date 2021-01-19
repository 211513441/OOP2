
package exercises;
import java.util.*;
// Create a java class that will ask the user for input until a zero value is entered. Calculate the average of only even numbers.
public class Ex1 {
    public static void main(String[]args) {
        Scanner input=new Scanner(System.in);
        
        double average;
        int sum=0,ctr=0;
        int x;
        
        
        System.out.println("Enter numbers: ");
        for (;;) {                             // infinite loop
            x=input.nextInt();
            if (x==0)
                break;
            if(x%2==0){
                sum=sum+x;
                ctr=ctr+1;      // ctr++;
            }
            
        
        }  
        
        average=sum/ctr;
        
        System.out.println("The average of even numbers is "+average);
        
        
        
        
        
    }
    
}

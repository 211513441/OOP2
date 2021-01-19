package exercises;
import java.util.*;
// Create a java class that will find the sum of series of a number. For example, an input of 5 will produce ( 1 + 2 + 3+ 4 + 5 = 15)
public class Ex2 {
    public static void main(String[]args) {
        Scanner input=new Scanner(System.in);
        
        int x=0,sum=0;
        
        System.out.println("Enter a number to calculate the sum of series of numbers: ");
        x=input.nextInt();
        for (int i=0;i<=x;i++) {
            sum=sum+i;     
        }
        System.out.println("The sum of series of numbers is "+sum);
    }
    
}

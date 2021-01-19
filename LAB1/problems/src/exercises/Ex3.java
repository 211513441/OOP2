package exercises;
import java.util.Scanner;
 // Create a java class that will identify if an entry is a perfect number or not.
// Perfect numbers are numbers which equal the sum of their proper divisors  (e.g. 6 = 3 + 2 + 1).
public class Ex3 {
 
    public static void main(String args[]) {
 
        int n,s;
 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number greater than 1: ");
        // Waiting for the user input
        n = sc.nextInt();
        s = 0;
        
        // No need to go more than half of the value
        for(int i = 1; i <= n/2; i++) {
            if(n%i==0) 
                s += i;
        }
 
        if(s == n)
            System.out.print(n+" is a perfect number ");
        else 
           System.out.print(n+" is not a perfect number "); 
        
        
 
    } // end method main
} // end class
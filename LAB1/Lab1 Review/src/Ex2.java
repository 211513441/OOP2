import java.util.Scanner;
public class Ex2 {
    // This program asks the user to enter an integer and the program tells the user that the number is even or odd
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        int x;
        System.out.println("Enter an integer: ");
        x=input.nextInt();
        
        if (x%2==0) 
            System.out.println("The number is even");
        else 
            System.out.println("The number is odd");
        
        
        
        
        
        
        /* 
        if (x%2==0)
           System.out.println("The number is even");
        else if (x%2==1)
           System.out.println("The number is odd");
        */
        
        
        
    }
    
}

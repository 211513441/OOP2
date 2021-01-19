import java.util.Scanner;
public class Ex3 {
    // This program propmts the user to enter 5 integers and the program tells the user that the numbers are even or odd
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        int x;
        for (int i=0;i<5;i++) {
            System.out.print("Enter an integer: ");
            x=input.nextInt();
            if (x%2==0)
                System.out.println("The number is even");
            else if (x%2==1)
                System.out.println("The number is odd");    
        }
        
        
        /*
        for (int i=0;i<5;i++) {
            System.out.print("Enter an integer: ");
            x=input.nextInt();
            if (x>0)
                System.out.println("The number is positive");
            else if (x<0)
                System.out.println("The number is negative");
            else if (x==0)
                System.out.println("The number is zero");
            
        }
        */
        
    }
}

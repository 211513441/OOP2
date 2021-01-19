import java.util.*;
public class Ex1 {
    // This program asks the user to enter the length and width of rectangle and the program finds the area of rectangle 
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double length,width,area;
        
        System.out.println("Enter the length of rectangle: ");
        length=input.nextDouble();
        
        System.out.println("Enter the width of rectangle: ");
        width=input.nextDouble();
        
        area=length*width;
        
        System.out.println("The area of rectangle is "+area);
        
        
    }
    
}

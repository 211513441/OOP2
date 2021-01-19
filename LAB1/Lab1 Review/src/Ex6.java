import java.util.*;
public class Ex6 {
    Scanner input=new Scanner(System.in);
    
    public void area() {
        double width,length,area;
        System.out.println("Calling Area of rectangle");
        
        System.out.print("Enter length of rectangle: ");
        length=input.nextDouble();
        System.out.print("Enter the width of rectangle: ");
        width=input.nextDouble();
        
        area=length*width;
        System.out.println("Rectangle Area= "+area);
    }
    
    public void area(double side) {                       // Method Overloading  // two methods have the same name in the same class with different parameters
        double area;
        System.out.println("\nCalling Area of square");
        
        System.out.print("Enter the side of square: ");
        side=input.nextDouble();
        area=side*side;
        System.out.println("Square Area= "+area);
    }
    
    public static void main(String[] args) {
        Ex6 s1=new Ex6();
        s1.area();
        s1.area(5);  
        
    }
    
    
    
    
    
    
    
    
    
    
       
        
    }
    


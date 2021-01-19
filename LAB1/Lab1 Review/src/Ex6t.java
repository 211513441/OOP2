import java.util.*;
public class Ex6t {
    Scanner input=new Scanner(System.in);
    
    public double area() {
        double width,length,area;
        System.out.println("Calling Area of rectangle");
        
        System.out.print("Enter length of rectangle: ");
        length=input.nextDouble();
        System.out.print("Enter the width of rectangle: ");
        width=input.nextDouble();
        
        area=length*width;
        return area;
    }
    
    public double area(double side) {
        double area;
        System.out.println("\nCalling Area of square");
        
        System.out.print("Enter the side of square: ");
        side=input.nextDouble();
        area=side*side;
        return area;
    }
    
    public static void main(String[] args) {
        double rectangleArea,squareArea;
        Ex6t a1=new Ex6t();
        rectangleArea=a1.area();
        squareArea=a1.area(5);
        System.out.println("Rectangle Area= "+rectangleArea);
        System.out.println("Square Area= "+squareArea);
        
        
        
    }
    
    
    
    
    
    
    
    
    
    
       
        
    }
    


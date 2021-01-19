/*in RectangleTest class:
1. Instantiate RectangleDetails class.
2. Assign the values 5 and 7 to the variables length and width respectively. 
3. Call computeArea, computePerimeter and displayDetails methods.*/
public class RectangleTest {
    public static void main(String[] args) {
    
    RectangleDetails s1=new RectangleDetails();
    s1.computeArea();
    s1.computePerimeter();
    s1.displayDetails();
       
        
    RectangleDetails s2=new RectangleDetails(5,7);
    s2.computeArea();
    s2.computePerimeter();
    s2.displayDetails();
    
    

    
            }
    
    
}

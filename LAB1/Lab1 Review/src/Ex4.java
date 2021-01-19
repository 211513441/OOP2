import java.util.*;
public class Ex4 {
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       
       int x=1000;
       
       while(x!=0) {
           System.out.print("Enter an integer: ");
           x=input.nextInt();
           if (x%2==0)
               System.out.println("The number is even");
           else 
               System.out.println("The number is odd");
           
           if (x==100)
               break;
       }
       
         /*  if (x==0)
               break;
         */
           
        
       
        
       
       
       
       
       
    }
    
}

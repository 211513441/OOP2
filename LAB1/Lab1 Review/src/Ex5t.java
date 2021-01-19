import java.util.*;
public class Ex5t {
    public static void main(String[]args) {
        Scanner input=new Scanner(System.in);
        int x;
        int sum=0;
        
        for (int i=0;i<10;i++) {
            System.out.print("Enter an integer: ");
            x=input.nextInt();
            sum=sum+x;    
        }
        System.out.println("The summation= "+sum);
        
        
        
        
    }
    
}


import java.util.Scanner;

import java.util.*;
public class Ex5 {
    public static void main(String[]args) {
        Scanner input=new Scanner(System.in);
        
        int sum=0;
        int[] x=new int[10];  // declaring array x of 10 integers
        
        for (int i=0;i<10;i++) {
            System.out.print("Enter an integer: ");
            x[i]=input.nextInt();
            sum=sum+x[i];
        }
        
        System.out.println("The inserted numbers: ");
        for (int i=0;i<10;i++) {
            System.out.print(x[i]+",");
        }
        
        System.out.println();
        System.out.println("The summation= "+sum);
        
        
}
    
    
    
}


    
    


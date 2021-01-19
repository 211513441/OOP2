import java.util.*;
// Write a java program that calculate the sum of numbers and find the average of these numbers and the maximum and minimum of these numbers 
public class Q2 {
    public static void main(String[]args) {
        Scanner input=new Scanner(System.in);
        int sum=0,ctr=0; int max=0,min=1000;
        double average;
        
        int x[]=new int[5];  
        System.out.println("Enter five numbers to calculate the sum and average:  ");
        for (int i=0;i<5;i++) {
            x[i]=input.nextInt();
            sum=sum+x[i];
            ctr++;                   // ctr=ctr+1;
           
            if (x[i]>max)
                max=x[i];
            
            else if (x[i]<min)
                min=x[i];
        }
        
        average=sum/ctr;
        
        System.out.println("The sum is "+sum);
        System.out.println("The number of integers is "+ctr);
        System.out.println("The average of numbers is "+average);
        System.out.println("The maximum number is "+max);
        System.out.println("The minimum number is "+min);
        
        
    }
    
}

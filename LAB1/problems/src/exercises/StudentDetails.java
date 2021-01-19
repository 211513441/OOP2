package exercises;
// Create a GradesTest class that instantiates StudentDetails class. 
// StudentDetails has 5 variables: name, grade1, grade2, grade3, and average. 
// It has a constructor that initializes name to “no name” and the rest to zero (0). 
// Create a non-static, void method, getAverage, that computes the average of 3 grades. 
// Create a non-static, void method, displayDetails, that displays the name and average. 
// In GradesTest class, call displayDetails method. Next, assign the values “Yousef”, 95, 85, and 90 to the variables. 
// Finally, call the methods getAverage and displayDetails.

public class StudentDetails {
    String name;                             // attributes of class studentDetails
    double grade1,grade2,grade3,average;
    
    public StudentDetails() {
        name="No name";
        grade1=0;
        grade2=0;
        grade3=0;
    }
    
    public StudentDetails(String n,double g1,double g2,double g3) {   // Constructor
        name=n;
        grade1=g1;
        grade2=g2;
        grade3=g3;
    }
    
    public void getAverage() {
        average=(grade1+grade2+grade3)/3;
    }
    
    /*public double getAverage() {              
        return (grade1+grade2+grade3)/3;
    }*/
    
    public void dispalyDetails() {
        System.out.println("The name of the student is "+name);
        System.out.println("The Average of student is "+average);
        System.out.println("---------------------------------------");
    }
    
    
    
    
}

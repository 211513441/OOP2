package studenttest;

/* Create a GradesTest class that instantiates StudentDetails class. StudentDetails has 4 public variables: name, grade1, grade2, and average. 
 * It has a constructor that has no parameter and initializes name to “no name” and the rest to zero (0). 
 * Create a non-static, void method, getAverage, that computes the average of 2 grades. Create a non-static, void method, displayDetails, that displays the name and average. 
In GradesTest class:
Instantiate StudentDetails class.
Call getAverage and  displayDetails methods. 
Assign the values “Yousef”, 95 and 90 to the variables name, grade1, and grade2 respectively. 
Call getAverage and displayDetails methods. */

public class StudentDetails {
    private String name;
    private double grade1,grade2,average;
    
    // declaring a constructor
    public StudentDetails() {
        this.name="no name";
        this.grade1=0;
        this.grade2=0;
        this.average=0;
    }

    public StudentDetails(String name, double grade1, double grade2) {
        this.name = name;
        this.grade1 = grade1;
        this.grade2 = grade2;
    }

    public double getGrade1() {
        return grade1;
    }

    public double getGrade2() {
        return grade2;
    }

    public String getName() {
        return name;
    }
    public void getAverage() {
        this.average=(grade1+grade2)/2;
    }
    
    public void setName(String n) {
        name=n;   
    }

    public void setGrade1(double grade1) {
        this.grade1 = grade1;
    }

    public void setGrade2(double grade2) {
        this.grade2 = grade2;
    }
  
    public static void sample() {
    }
    public void displayDetails() {
        System.out.println("The name of student is "+name);
        System.out.println("The average of the student is "+average);
    }
    
    
    
}

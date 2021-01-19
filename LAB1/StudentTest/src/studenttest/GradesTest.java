package studenttest;


public class GradesTest {
    public static void main(String[]args) {
        
       /* StudentDetails s1=new StudentDetails();
        s1.getAverage();
        s1.displayDetails();
        s1.name="Yousef";
        s1.grade1=95;
        s1.grade2=90;
        s1.getAverage();
        s1.displayDetails();*/
        
        StudentDetails s2=new StudentDetails("Mohammed",90,80);
        s2.getAverage();
        s2.displayDetails();
        s2.setGrade1(85);
        s2.setGrade2(75);
        s2.getAverage();
        s2.displayDetails();
        
    }
    
}

/*Create a project with 3 Classes
1. AbstractProblem (instantiates Employee class and calls displayDetails method)
2. Student (super class, abstract, has constructor with all variables as arguments)
3. Athlete (sub class, has constructor with all variables as arguments)

FIELDS:
for Student: studentID, name, allowance
for Athlete: inherited from super class and athleteID

METHODS:
for Student: 
1. set and get for all variables, 
2. int yearlyAllowance (abstract method)
3. void displayDetails (abstract method)

for Athlete: 
1. set & get for athleteID
2. yearlyAllowance (returns yearly allowance= allowance *12)
3. displayDetails (displays studentID, name, allowance, athleteID, and yearly allowance)*/
public abstract class Student {
    
    int studentID,allowance;
    String name;
    public Student(int studentID,int allowance,String name) {
        this.studentID=studentID;
        this.allowance=allowance;
        this.name=name;
    }
    
    public abstract int yearlyAllowance();
    public abstract void displayDetails();
    
    
    public int getStudentID() {
        return studentID;
    }
    public void setStudentID(int stdID) {
        studentID=stdID;
    }
    public int getAllowance() {
        return allowance;
    }
    public void setAllowance(int all) {
        allowance=all;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name=name;
    }
    
}

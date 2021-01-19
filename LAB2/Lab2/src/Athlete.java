/*Create a project with 3 Classes
1. AbstractProblem (instantiates Athlete class and calls displayDetails method)
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
public class Athlete extends Student {
    int athleteID;
    
    public Athlete(int studentID,int allowance,String name,int athleteID) {
        super(studentID,allowance,name);
        this.athleteID=athleteID;
    }
    
    public int getAthleteID() {
        return athleteID;
    }
    
    public void setAthleteID(int ath) {
        athleteID=ath;
    }
    public int yearlyAllowance() {
        return getAllowance()*12;
    }
    public void displayDetails() {
        System.out.println("studentID is "+getStudentID());
        System.out.println("name is "+getName());
        System.out.println("allowance is "+getAllowance());
        System.out.println("athleteID is "+getAthleteID());
        System.out.println("yearlyAllowance is "+yearlyAllowance());
        
        
        
        
    }
    
    
}

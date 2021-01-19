
public class Programmer extends Employee {
    
    public Programmer(String name,int salary) {
        super(name,salary);
    }
    
    public int yearlySalary() {
        return getSalary()*15;
    }
    
    public void displayDetails() {
        System.out.println("Programmer name is "+getName());
        System.out.println("Programmer Salary is "+getSalary()+"$");
        System.out.println("Programmer yearly salary is "+yearlySalary()+"$");
    }
    
    
    
}
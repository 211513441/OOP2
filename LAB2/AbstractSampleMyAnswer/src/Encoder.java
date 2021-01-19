
public class Encoder extends Employee {
    
    public Encoder(String name,int salary) {
        super(name,salary);
    }
    
    // override abstract method yearlySalary()
    public int yearlySalary() {
        int ys;
        ys=getSalary()*12;
        return ys;
    }
    
    public void displayDetails() {
        System.out.println("Encoder name is "+getName());
        System.out.println("Encoder Salary is "+getSalary()+"$");
        System.out.println("Encoder yearly Salary is "+yearlySalary()+"$");
    }
    
    
    
    
    
    
    
}
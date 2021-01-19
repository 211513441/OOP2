package abstractsmple;

public class Programmer extends Employee {
    
    public Programmer(String name,int salary) {
        super(name,salary);
    }
    
    public int yearlySalary() {
        return this.getSalary()*15;
    }
}
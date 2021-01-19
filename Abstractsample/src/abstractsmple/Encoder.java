package abstractsmple;

public class Encoder extends Employee {
    
    public Encoder(String name,int salary) {
        super(name,salary);
    }
    
    public int yearlySalary() {
        int ys;
        ys=this.getSalary();
        return ys; 
    }
}
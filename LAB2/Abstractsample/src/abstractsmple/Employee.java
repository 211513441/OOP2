package abstractsmple;

public abstract class Employee{
     private String name;
     private int salary;

public Employee (String name, int salary) { 
    this.name=name;
    this.salary=salary;    
    }

    public String getName() {
        return name;
    }
    public int getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
        
        public abstract int yearlySalary();

        public void displayDatils(){
            System.out.println("name"+name);
            System.out.println("Salary: "+salary);
            System.out.println("Yearly salary: "+yearlySalary());
        }
}

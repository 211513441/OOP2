/*Create a project with 4 Classes
AbstractSample (class with instantiation of all sub classes)
Employee (super, abstract, constructor with all variables as arguments)
Encoder and Programmer (sub classes)
FIELDS:
Employee:	name, salary
Encoder:	inherited from super class
Programmer:	inherited from super class
METHODS:
Employee:	set and get for all variables, 
	abstract: int yearlySalary, void displayDetails (displays name, salary & yearly salary)
Encoder:	all abstract methods (yearly salary is salary *12)
Programmer:	all abstract methods (yearly salary is salary *15) */
public abstract class Employee {
    String name;
    int salary;
    
    public Employee(String name,int salary) {
        this.name=name;
        this.salary=salary;
    }
    
    public abstract int yearlySalary();    // abstract methods
    public abstract void displayDetails();
    public String getName() {
        return name;
    }
    public int getSalary() {
        return salary;
    }
    public void setName(String n) {
        name=n;
    }
    public void setSalary(int sal) {
        salary=sal;
    }
    
}

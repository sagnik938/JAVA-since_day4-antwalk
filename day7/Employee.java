package day7;

public class Employee {
    int eId;
    String name;
    double salary;
    public Employee(int eId, String name, double salary) {
        this.eId = eId;
        this.name = name;
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "Employee [eId=" + eId + ", name=" + name + ", salary=" + salary + "]";
    } 
}


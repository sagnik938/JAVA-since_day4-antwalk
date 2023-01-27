package day6;

public class Employee implements Comparable<Employee> {
    private int empId;
    private String eName;
    private int salary;
    
    public Employee(int empId, String eName, int salary) {
        this.empId = empId;
        this.eName = eName;
        this.salary = salary;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee [empId=" + empId + ", eName=" + eName + ", salary=" + salary + "]";
    }

    //to make a tree set 
    @Override
    public int compareTo(Employee o) {
        if( this.empId == o.getEmpId() ){
            return(0);
        }
        else if( this.empId > o.getEmpId() ){
            return(1);
        }
        else{
            return(-1);
        }
    }
    
}

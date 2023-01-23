package day4;

public class Employee {
    String empName;
    int empID;

    public Employee(String empName, int empID) {
        this.empName = empName;
        this.empID = empID;
        System.out.println("Employee const called");
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }
    public void disp(){
        System.out.println("Employee Name: "+this.empName);
        System.out.println("Employee Id is: "+this.empID);
    }
}

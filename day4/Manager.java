package day4;

public class Manager extends Employee {
    String designation;

    public Manager(String empName, int empID, String designation) {
        super(empName, empID);
        this.designation = designation;
        System.out.println("Manager const called");
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
    
    public void dispMan(){
        System.out.println("Employee Designation: "+this.designation);
    }
    
}

package employee_assignment;

public class TesterEmployee {

    public static void getDetails(Employee e){
        if(e instanceof ContractEmployee){
            ((ContractEmployee) e).calcSalary();
        }
        else{
            ((PermanentEmployee) e).calcMonthlySalary();
        }

        System.out.println("Name: "+e.getEmployeeName());
        System.out.println("ID: "+e.getEmployeeId());
        System.out.println("Salary: "+e.getSalary());
        System.out.println("***************************");
    }

    public static void main(String[] args) {
//    to test if statements
    PermanentEmployee p1 = new PermanentEmployee(100,"Sagnik",1001,761,3);
//    PermanentEmployee p1 = new PermanentEmployee(100,"Sagnik",1000,760,2);
//    PermanentEmployee p1 = new PermanentEmployee(100,"Sagnik",1000,760,6);
//    PermanentEmployee p1 = new PermanentEmployee(100,"Sagnik",1000,760,12);

        ContractEmployee c1 = new ContractEmployee(101,"Sanshkriti",30.9,109);
        getDetails(p1);
        getDetails(c1);
    }
}

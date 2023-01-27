package day6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class ArrayListAssignment {

    public static Employee addEmployee( int id){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name ");
        String name = sc.nextLine();
        System.out.println("Enter Salary");
        int sal = sc.nextInt();
        Employee e = new Employee(id++, name, sal);
        return(e);
    }

    public static void dispEmployee(ArrayList<Employee> employees ){
        Iterator<Employee> itr = employees.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }

    public static String searchEmployee( ArrayList<Employee> employees ){
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter ID");
        int id = sc.nextInt();
        Iterator<Employee> itr = employees.iterator();
        while(itr.hasNext()){
            if(itr.next().getEmpId() == id){
                return(itr. toString());
            }
        }
        return("Not Found");
    }


    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<Employee>();
        Scanner sc = new Scanner(System.in);
        int opt = 90,id = 1000;
        do{
            System.out.println("<1> for adding\n<2> for display\n<3> for searching\n<4>for deletion\n<5> for Updation\n<0> to exit");
            opt = sc.nextInt();
            switch(opt){
                case 1: employees.add( addEmployee(id++) );
                        break;

                case 2: dispEmployee(employees);
                        break;

                case 3: System.out.println( searchEmployee(employees) );
                        break;

                // case 4: deleteEmployee(employees);
                //         break;
                
                // case 5: UpdateEmployee(employees);
                //         break;
                

                default: System.out.println("Wrong Option");

            }

        }while(opt != 0 );
    }
}

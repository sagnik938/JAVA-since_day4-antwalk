package ArrayListAssgn;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListemo {

    public static int getPos(ArrayList<Employee> elist , int id){
        for( Employee e : elist){
            if( e.getId() == id){
                return(elist.indexOf(e));
            }
        }
        return(-1);
    }
    public static void main(String[] args) {
        ArrayList<Employee> employeeList = new ArrayList<Employee>();
        Scanner sc = new Scanner(System.in);
        int opt = 980 , id , pos;
        String name;

        do{
            System.out.println("Enter\n<1> for insert\n<2> for delete\n<3> for update\n<4> for search\n<5> for display\n<0> to exit");
            opt = sc.nextInt();

            switch( opt ){
                case 0: System.out.println("You chose to exit");
                        break;

                case 1: System.out.println("Enter name");
                        name = sc.next();
                        System.out.println("Enter id");
                        id = sc.nextInt();
                        Employee e = new Employee(name, id);
                        employeeList.add(e);
                        break;

                case 2: System.out.println("Enter id");
                        id = sc.nextInt();
                        pos = getPos(employeeList, id);
                        try {
                            employeeList.remove(pos);
                        } catch (Exception ex) {
                            System.out.println("Value not found");
                        }
                        break;

                case 3: System.out.println("Enter old id");
                        id = sc.nextInt();
                        pos = getPos(employeeList, id);
                        try {
                            employeeList.remove(pos);
                            System.out.println("Enter new name");
                            name = sc.next();
                            System.out.println("Enter new id");
                            id = sc.nextInt();
                            e = new Employee(name, id);
                            employeeList.add(pos, e);
                        } catch (Exception ex) {
                            System.out.println("Value not found");
                        }
                        break;
                
                case 4: System.out.println("Enter search id");
                        id = sc.nextInt();
                        pos = getPos(employeeList, id);
                        if( pos != -1){
                            System.out.println("Found at "+(pos)+" position");
                        }
                        else{
                            System.out.println("Value not found");
                        }
                        break;
                
                case 5: Iterator<Employee> itr = employeeList.iterator();
                        while(itr.hasNext()){
                            System.out.println(itr.next());
                        }
                        break;
                
                default: System.out.println("Wrong option");

            }
        } while( opt != 0);
        sc.close();
    }
}

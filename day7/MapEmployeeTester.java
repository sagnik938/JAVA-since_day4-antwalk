package day7;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapEmployeeTester {

    public static Employee incrementor(Employee e){
        e.salary = 1.1 * e.salary;
        return(e);
    }
    public static void main(String[] args) {
        ArrayList<Employee> eList = new ArrayList<Employee>();
        List<Employee> incrementedEList = new ArrayList<Employee>();
        eList.add( new Employee(100, "ABC", 10000));
        eList.add( new Employee(101, "PQR", 20000));
        eList.add( new Employee(102, "DEF", 30000));
        eList.add( new Employee(103, "XYZ", 40000));
        // eList.stream().map( e -> incrementor(e)).forEach(e -> System.out.println(e));
        incrementedEList = eList.stream().map( e -> incrementor(e)).collect(Collectors.toList());
        System.out.println(incrementedEList);
        System.out.println(eList);

    }
}

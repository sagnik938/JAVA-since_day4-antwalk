package day6;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        Set<Employee> linkedHashSet = new LinkedHashSet<Employee>();
        Employee e1 = new Employee(100, "ABC", 1000);
        Employee e2 = new Employee(101, "DEF", 2000);
        Employee e3 = new Employee(102, "PQR", 3000);
        Employee e4 = new Employee(103, "XYZ", 4000);

        linkedHashSet.add(e1);
        linkedHashSet.add(e2);
        linkedHashSet.add(e3);
        linkedHashSet.add(e4);

        for(Employee emp: linkedHashSet){
            System.out.println(emp);
        }

    }
}

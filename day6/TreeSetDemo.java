package day6;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        //Uses tree based heap to preserve sorting order
        Set<Employee> treeSet = new TreeSet<Employee>();

        Employee e1 = new Employee(100, "ABC", 1000);
        Employee e2 = new Employee(101, "DEF", 2000);
        Employee e3 = new Employee(102, "PQR", 3000);
        Employee e4 = new Employee(103, "XYZ", 4000);

        treeSet.add(e1);
        treeSet.add(e2);
        treeSet.add(e3);
        treeSet.add(e4);

        for(Employee emp: treeSet){
            System.out.println(emp);
        }
    }
}

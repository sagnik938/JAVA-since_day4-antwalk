package day6;

import java.util.Set;
import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        //Checks for duplicate by reference 
        Set<Employee> hashSet = new HashSet<Employee>();
        Employee e1 = new Employee(100, "Satyam", 1000);
        Employee e2 = new Employee(101, "Subh", 2000);
        Employee e3 = new Employee(102, "Sagnik", 3000);
        Employee e4 = new Employee(103, "Swairik", 4000);

        hashSet.add(e1);
        hashSet.add(e2);
        hashSet.add(e3);
        hashSet.add(e4);

        for(Employee emp: hashSet){
            System.out.println(emp);
        }
    }
}

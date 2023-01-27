package day6;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<Integer , Employee> employeeTable = new HashMap<Integer,Employee>();
        Employee e1 = new Employee(100, "ABC", 1000);
        Employee e2 = new Employee(101, "DEF", 2000);
        Employee e3 = new Employee(102, "PQR", 3000);
        Employee e4 = new Employee(103, "XYZ", 4000);

       employeeTable.put(e1.getEmpId(), e1);
       employeeTable.put(e2.getEmpId(), e2);
       employeeTable.put(e3.getEmpId(), e3);
       employeeTable.put(e4.getEmpId(), e4);

    //    Iterator<Integer> itr = employeeTable.keySet().iterator();
    //    while(itr.hasNext()){
    //         System.out.println( employeeTable.get( itr.next() ).toString() );
    //    }
    
    // Returns a set mapping of the hashmap
    // Changes are reflected
       Set<Map.Entry<Integer,Employee>> entries = employeeTable.entrySet();
       for( Map.Entry<Integer , Employee> e : entries){
            System.out.println(e.getKey() + " : " + e.getValue());
       }

    }
}

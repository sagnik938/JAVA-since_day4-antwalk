package day6;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector vector = new Vector();
        Employee e1 = new Employee(100, "Satyam", 1000);
        Employee e2 = new Employee(101, "Subh", 2000);
        Employee e3 = new Employee(102, "Sagnik", 3000);
        Employee e4 = new Employee(103, "Swairik", 4000);

        vector.add(e1);
        vector.add(e2);
        vector.add(e3);
        vector.add(e4);

        Enumeration enumv = vector.elements();
        while( enumv.hasMoreElements() ){
            System.out.println( enumv.nextElement().toString() );
        }
    }


}

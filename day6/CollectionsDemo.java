package day6;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class CollectionsDemo {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("C++");
        list.add("Python");
        list.add("Java");
        list.add("Kotlin");

        // for( Object obj:list){
        //     System.out.println(obj);
        // }
        // //Iterator
        // Iterator itr = list.iterator();
        // while(itr.hasNext()){
        //     System.out.println(itr.next());
        // }
        // //list Iterator
        // ListIterator itr = list.listIterator();
        // while(itr.hasNext()){
        //     System.out.println(itr.next());
        // }
        //Enum and vector
        Vector vector = new Vector();
        vector.add("C++");
        vector.add("PYTHON");
        vector.add("KOTLIN");
        vector.add("PHP");
        Enumeration enumv = vector.elements();
        while(enumv.hasMoreElements()){
            System.out.println(enumv.nextElement());
        }

    }
    
}

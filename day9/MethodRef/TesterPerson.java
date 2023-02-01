package day9.MethodRef;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TesterPerson {

    public static int compareByAge(Person p1 , Person p2){
        Integer i1 = (p1.getAge());
        Integer i2 = (p2.getAge());
        return i1.compareTo(i2);
    }

    public static int compareByName(Person p1 , Person p2){
        return p1.getName().compareToIgnoreCase(p2.getName());
    }
    public static void main(String[] args) {
        List<Person> pList = new ArrayList<Person>();
        pList.add( new Person("test4",45) );
        pList.add( new Person("test3",5) );
        pList.add( new Person("test2",40) );
        pList.add( new Person("test1",10) );

        // Collections.sort(pList,TesterPerson :: compareByAge);
        Collections.sort(pList,TesterPerson :: compareByName);
        pList.stream().forEach(System.out::println);
        // System.out.println(pList);  
    }
}

package day9.MethodRef;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MethodRefInstance {
   public static void main(String[] args) {
    List<String> names = new ArrayList<String>();
    names.add("Sagnik");
    names.add("Aniket");
    names.add("Gautam");
    names.add("AAAA");
    System.out.println(names);
    Collections.sort(names,String::compareToIgnoreCase);
    System.out.println(names);
   }

}

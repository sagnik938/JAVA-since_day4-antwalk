package day7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo{
    public static void main(String[] args) {
        List<Integer> numberList = Arrays.asList(1,2,3,4,5,6,7,8,9);
        List<Integer> evenNumberList = new ArrayList<Integer>();
        // for(int num : numberList){
        //     if( num%2 == 0){
        //         evenNumberList.add(num);
        //     }
        // }

        //populates the collection
        evenNumberList = numberList.stream().filter(n -> n%2 == 0).collect(Collectors.toList());
        //just print 
        // evenNumberList = numberList.stream().filter(n -> n%2 == 0).forEach(n : n->n%2 == 0)
        System.out.println(evenNumberList);
    }
}
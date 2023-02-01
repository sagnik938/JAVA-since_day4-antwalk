package day9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionDemo {
    public static void main(String[] args) {
        List<Double> l = Arrays.asList(12.0,23.0,34.0,45.0,56.0);
        List<Double> l2 = new ArrayList<>();
        List<Double> l3 = new ArrayList<>();
        Function<Double,Double> fun1 = (n1)->(n1-10.05);
        l2 = l.stream().map(fun1).collect(Collectors.toList());
        System.out.println(l2);

        System.out.println(fun1.apply(77.0));
        fun1 = fun1.andThen(n->n+10.0);
        l3 = l2.stream().map(fun1).collect(Collectors.toList());
        System.out.println(l3);
        System.out.println(fun1.toString()); 
    }
    
}

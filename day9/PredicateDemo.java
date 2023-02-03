package day9;

import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        Predicate<Integer> prd = (a)->(a%2==0);
        System.out.println(prd.test(8)); 
        
        Predicate<String> prd2 = Predicate.isEqual("java");
        System.out.println( prd2.test("Java") );

        Predicate<Integer> marks = (m)->m>=0;
        Predicate<Integer> marks1 = (m)->m<=100;
        System.out.println(marks.and(marks1).test(90));
        System.out.println(marks.and(marks1).test(190));
        System.out.println(marks.or(marks1).test(190));

    }
}

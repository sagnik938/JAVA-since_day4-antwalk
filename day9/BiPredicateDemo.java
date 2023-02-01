package day9;

import java.util.function.BiPredicate;

public class BiPredicateDemo {
    public static void main(String[] args) {
        BiPredicate<String,String> bpr = (s1,s2)->s1.startsWith(s2);
        BiPredicate<String,String> bpr2 = (s1,s2)->s1.endsWith(s2);

        System.out.println(bpr.and(bpr2).test("starts","k"));

        BiPredicate<Integer , Integer> bpr3 = (n1,n2)->(n1%n2==0);
        System.out.println(bpr3.test(23, 17));
    }
}

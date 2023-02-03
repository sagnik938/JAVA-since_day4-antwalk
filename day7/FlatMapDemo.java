package day7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapDemo {
    public static void main(String[] args) {
        List<String> arr1 = Arrays.asList("ABC","DEF");
        List<String> arr2 = Arrays.asList("PQR","TUV");
        List<String> arr3 = Arrays.asList("XYZ","VXN");
        List<List<String>> res = new ArrayList<List<String>>();
        res.add(arr1);
        res.add(arr2);
        res.add(arr3);
        System.out.println(res);
        List<String> mapped = res.stream().flatMap(s -> s.stream()).collect(Collectors.toList());
        System.out.println(mapped);
    }
}

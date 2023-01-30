package day7;

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Arrays;

public class StringsAssgn {
    public static void main(String[] args) {
        List<String> input = Arrays.asList("ABCD","EFGHI","JKLMNOP","Q","RSTU","VWXYZ");
        List<String> output = new ArrayList<String>();
        output = input.stream().filter(s -> s.length()>=5 && s.length()<7).collect(Collectors.toList());
        System.out.println(output);
    }
}

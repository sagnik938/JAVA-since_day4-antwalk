package day7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapperDemo {
    public static void main(String[] args) {
        List<String> namesList = Arrays.asList("Sagnik","Swairik","Rajarshi","Pragya","Arijit");
        List<String> upperNames = new ArrayList<String>();

        upperNames = namesList.stream().map(name -> name.toUpperCase()).collect(Collectors.toList());
        System.out.println(upperNames);
    }
}

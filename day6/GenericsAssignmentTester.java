package day6;

import java.util.ArrayList;

public class GenericsAssignmentTester {
    public static void main(String[] args) {
        ArrayList<String> arr1 = new ArrayList<String>();
        arr1.add("ABC");
        arr1.add("DEF");
        arr1.add("XYZ");

        ArrayList<Integer> arr2 = new ArrayList<Integer>();
        arr2.add(1);
        arr2.add(2);
        arr2.add(3);

        GenericsAssignment<String> g1 = new GenericsAssignment<String>(arr1);
        GenericsAssignment<Integer> g2 = new GenericsAssignment<Integer>(arr2);

        g1.getArr();
        g2.getArr();

        // g1.setArr(arr2);
        // g2.setArr(arr1);
    }
}

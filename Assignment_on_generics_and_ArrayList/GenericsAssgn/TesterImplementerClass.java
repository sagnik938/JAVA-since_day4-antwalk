package GenericsAssgn;

import java.util.ArrayList;

public class TesterImplementerClass {
    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<Integer>();
        arr1.add(1);
        arr1.add(2);
        arr1.add(3);
        arr1.add(4);

        ArrayList<String> arr2 = new ArrayList<String>();
        arr2.add("ABC");
        arr2.add("DEF");
        arr2.add("PQR");

        ArrayList<Float> arr3 = new ArrayList<Float>();
        arr3.add(2.2f);
        arr3.add(3.3f);
        arr3.add(4.4f);

        ImplementorClass<Integer> i1 = new ImplementorClass<Integer>(arr1);
        ImplementorClass<String> i2 = new ImplementorClass<String>(arr2);
        ImplementorClass<Float> i3 = new ImplementorClass<Float>(arr3);
        i1.getArr();
        i2.getArr();
        i3.getArr();
    }
}

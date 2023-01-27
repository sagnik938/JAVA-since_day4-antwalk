package day6;

public class Wrapper {
   public static void main(String[] args) {
    int i = 5;
    Integer i2 = new Integer(2); 
    Integer i3 = new Integer(i); //primitive inside wrapper boxing
    int j = i2.intValue(); // Wrapper to primitive boxing
    Integer i4 = i; // Autoboxing
    int k = i2; // Auto unboxing

    System.out.println(i+" "+" "+i2+" "+i3+" "+j+" "+i4+" "+k);

    //primitives faster frameworks use wrappers
   }
}

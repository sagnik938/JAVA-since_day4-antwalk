package day9;

@FunctionalInterface
interface FInter{
    abstract public void print();

    // // not allowed
    // abstract public void print1();

    default void dPrint(){
        System.out.println("Default method");
    }
    static void Sprint(){
        System.out.println("Static method");
    }
}


public class FuntionalInterfaceDemo implements FInter {

    @Override
    public void print() {
        System.out.println("Abstract Method"); 
    }
    
    public static void main(String[] args) {
        FuntionalInterfaceDemo d1 = new FuntionalInterfaceDemo();
        d1.dPrint();
        d1.print();
        FInter.Sprint();

        // // Abstract method of functional interface through lambda exp...
        // // Used to implement functional programming
        FInter ai = () -> System.out.println("Abstract from lambda");
        ai.print();
    }
}

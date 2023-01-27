package day6;

public class TesterGenericsDemo {
    public static void main(String[] args) {
        GenericsDemo<String> g1 = new GenericsDemo<String>("Learning Generics");
        System.out.println(g1.getContainer());
        // g1.setContainer(678); // not possible anymore
        System.out.println(g1.getContainer());
        //Notice there is no type safety...
        //At compile time only errors are given if type safety is provided...

        GenericsDemo<Integer> g2 = new GenericsDemo<Integer>(678);
        System.out.println(g2.getContainer());
        // g1.setContainer("test"); //not possible anymore
        System.out.println(g2.getContainer());
    }
}

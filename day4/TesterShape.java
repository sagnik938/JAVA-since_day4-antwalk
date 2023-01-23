package day4;

public class TesterShape {
    public static void main(String[] args) {
        Shape circle = new Shape();
        Shape rectangle = new Shape();
        System.out.println("Circle Area is "+circle.calcArea( 10 ));
        System.out.println("Rectangle Area is "+rectangle.calcArea( 10 , 10 ));
    }
}

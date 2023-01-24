package day5;

public class ImplementClass implements InterTwo{

    @Override
    public void disp() {
        System.out.println("Hello from display");
    }

    @Override
    public void show() {
        System.out.println("Hello from show");
    }
    @Override
    public void welcomeMessage(){
        System.out.println("Welcome from Class");
    }
    // Testing static method scope
    static void StaticTest(){
        System.out.println("Static method from Implement class");
    }
    
}

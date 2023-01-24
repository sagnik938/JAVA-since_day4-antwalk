package day5;

public class TesterInnerDemo {
    public static void main(String[] args) {
        InnerDemo obj = new InnerDemo();
        InnerDemo.B objinner = obj. new B();
        obj.method();
        objinner.method();
    }
}

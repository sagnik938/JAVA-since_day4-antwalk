package day5;

interface InterOne {
    abstract public void disp();
    default void welcomeMessage(){
        System.out.println("Welcome");
    }
    // Testing static method scope
    static void StaticTest(){
        System.out.println("Static method from I1");
    }
    static int cube(int num){
        return(num*num*num);
    }
}

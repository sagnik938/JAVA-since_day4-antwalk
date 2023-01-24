package day5;

interface  InterTwo extends InterOne{
    abstract public void show();
    // Testing static method scope
    static void StaticTest(){
        System.out.println("Static method from I2");
    }
}

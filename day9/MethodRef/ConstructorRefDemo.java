package day9.MethodRef;

interface MyInterface{
    // Person getPerson();
    Person getPerson(String name,int id);
}

public class ConstructorRefDemo {
    public static void main(String[] args) {
        // MyInterface obj = Person :: new; // invoke default const of class
        // System.out.println(obj.getPerson());

        MyInterface obj = Person :: new; // maps the abstract method with provided method
        // invokes the method(Constructor in this case)
        System.out.println(obj.getPerson("test",90));
    }
}

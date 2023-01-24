package day5;

public class InnerDemo {
    private int i;
    static private int k;
    void method(){
        B b = new B();
        b.j = 34;
        //b.h = 98;
        System.out.println(i+" "+b.j+" "+k);
    }
    public class B{
        private int j;
        // static private int h =78 ; cannot be done
        void method(){
            i = 90;
            this.j = 30;
            k = 89;
            System.out.println(i+" "+j+" "+k);
        }
    }
}

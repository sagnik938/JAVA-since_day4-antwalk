package day6;

class MyThread1 implements Runnable{

    @Override
    public void run() {
        for(int i = 0 ; i < 100 ; i++){
            System.out.println("Value of i is: "+i);
            // try {
            //     Thread.sleep(2000);
            // } catch (Exception e) {
            //     System.out.println(e);
            // }
        }
        
    }

}

class MyThread2 extends Thread{

    @Override
    public void run(){
        for(int i = 0 ; i < 100 ; i++){
            System.out.println("Value of j is: "+i);
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        MyThread1 m1 = new MyThread1();
        Thread t1 = new Thread(m1);
        MyThread2 m2 = new MyThread2();
        t1.run();
        m2.run();

        Thread t = Thread.currentThread();
        System.out.println(t.getName());
    }
    
}

package day6;

public class TesterAccount {
    public static void main(String[] args) {
        AccountHolder acc1 = new AccountHolder();
        Thread t1 = new Thread(acc1);
        Thread t2 = new Thread(acc1);
        t1.start();
        t2.start();
        t1.setName("Anisha");
        t2.setName("Manish");
    }
}

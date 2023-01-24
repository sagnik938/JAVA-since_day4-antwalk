package day5;

public class TesterBank {
    public static void main(String[] args) {
        BankA bA = new BankA();
        BankB bB = new BankB();
        BankC bC = new BankC();

        System.out.println("Bank A: "+bA.getBalance());
        System.out.println("Bank B: "+bB.getBalance());
        System.out.println("Bank C: "+bC.getBalance());
    }

}


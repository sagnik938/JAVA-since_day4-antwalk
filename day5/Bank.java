package day5;

public abstract class Bank {
    int balance;
    abstract int getBalance();
    public void setBalance(int balance) {
        this.balance = balance;
    }
}

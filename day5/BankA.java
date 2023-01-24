package day5;

public class BankA extends Bank{

    @Override
    int getBalance() {
        super.setBalance(100);
        return super.balance;
    } 
}

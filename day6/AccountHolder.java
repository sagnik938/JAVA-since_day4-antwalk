package day6;

public class AccountHolder implements Runnable {
    private Account account = new Account();

    @Override
    public void run() {
       for( int i = 0 ; i < 5 ; i++){
        makeWithdrawl(2000);
        if( account.getBalance()<0 ){
            System.out.println("Account Overdrawn");
        }
       }   
    }

    private void makeWithdrawl(int wAmount){
        if( account.getBalance() >= wAmount ){
            System.out.println(Thread.currentThread().getName()+" withdrawing " + wAmount + " balance" + account.getBalance()); 
            account.setBalance(account.getBalance()-wAmount);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
               System.out.println(e);
            }
        }
        else{
            System.out.println("Insufficient balance");
        }
    }

    // private synchronized void makeWithdrawl(int wAmount){
    //     if( account.getBalance() >= wAmount ){
    //         System.out.println(Thread.currentThread().getName()+" withdrawing " + wAmount + " balance" + account.getBalance()); 
    //         account.setBalance(account.getBalance()-wAmount);
    //         try {
    //             Thread.sleep(1000);
    //         } catch (Exception e) {
    //            System.out.println(e);
    //         }
    //     }
    //     else{
    //         System.out.println("Insufficient balance");
    //     }
}


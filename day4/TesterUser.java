package day4;

public class TesterUser {

    public static void processPayment(User user , String type , int amt){

        if(user.makePayment(amt)){
            System.out.println("Payment Done for user: " + user.getUsername());
        }
        else{
            
            System.out.println("Insufficient balance");
        }
        if( user instanceof PremiumUser){
            PremiumUser puser = (PremiumUser) user;
            System.out.println("Rewards: "+ puser.getRewardPoints());
        }
        System.out.println("Balance: "+user.getBalance());

    }
    public static void main(String[] args) {
        User u1 = new User("User1", "user1@gmail.com", 100, 123);
        User u2 = new PremiumUser("User2", "user2@gmail.com", 200, 133);
        PremiumUser u3 = new PremiumUser("User3", "user3@gmail.com", 100, 143);
        processPayment(u1, "N" , 23);
        processPayment(u2, "P" , 23);
        processPayment(u3, "P" , 56 );
    }
}

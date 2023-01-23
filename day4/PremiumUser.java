package day4;

public class PremiumUser extends User {
    int rewardPoints;

    public PremiumUser(String username, String email, double balance, int id) {
        super(username, email, balance, id);
        this.rewardPoints = 0;
    }

    public int getRewardPoints() {
        return rewardPoints;
    }

    public void setRewardPoints(int rewardPoints) {
        this.rewardPoints = rewardPoints;
    }

    @Override
    public boolean makePayment(double billAmount) {
        if( balance > billAmount){
            balance -= billAmount;
            rewardPoints += 0.1 * billAmount;
            return(true);
        }
        else{
            return(false);
        }
    }
    
    
}

package day4;

public class User {
    String username;
    String email;
    double balance;
    int id;
    public User(String username, String email, double balance, int id) {
        this.username = username;
        this.email = email;
        this.balance = balance;
        this.id = id;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public boolean makePayment(double billAmount){
        if( balance > billAmount){
            balance -= billAmount;
            return(true);
        }
        else{
            return(false);
        }
    }

    
}

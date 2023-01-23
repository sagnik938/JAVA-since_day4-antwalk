package day4;

public class Trainee {
    
    static int counter = 1000;
    private String regID;
    private String name;
    private long contactNumber;
    private String city;

    public Trainee(String name, long contactNumber, String city) {
        this.name = name;
        this.contactNumber = contactNumber;
        this.city = city;
    }
    
    public static int getCounter() {
        return counter;
    }
    public static void setCounter(int counter) {
        Trainee.counter = counter;
    }
    public String getRegID() {
        return regID;
    }
    public void setRegID(String regID) {
        this.regID = regID;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public long getContactNumber() {
        return contactNumber;
    }
    public void setContactNumber(long contactNumber) {
        this.contactNumber = contactNumber;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    } 
}

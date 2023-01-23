package day4.Vehicle_Assignmnet;

public class Truck extends Vehicle{
    int maxPayload;

    public Truck(String ownerName, String licenseNumber, String color, int noOfWheels, int maxPayload) {
        super(ownerName, licenseNumber, color, noOfWheels);
        this.maxPayload = maxPayload;
    }

    public int getMaxPayload() {
        return maxPayload;
    }

    public void setMaxPayload(int maxPayload) {
        this.maxPayload = maxPayload;
    }
    
    
}

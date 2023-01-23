package day4.Vehicle_Assignmnet;

public class Bus extends Vehicle {
    int noOfPassengers;

    public Bus(String ownerName, String licenseNumber, String color, int noOfPassengers) {
        super(ownerName, licenseNumber, color);
        this.noOfPassengers = noOfPassengers;
    }
    public Bus(String ownerName, String licenseNumber, String color, int noOfWheels, int noOfPassengers) {
        super(ownerName, licenseNumber, color, noOfWheels);
        this.noOfPassengers = noOfPassengers;
    }

    public int getNoOfPassengers() {
        return noOfPassengers;
    }

    public void setNoOfPassengers(int noOfPassengers) {
        this.noOfPassengers = noOfPassengers;
    }
    
}

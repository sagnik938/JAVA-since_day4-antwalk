package day4.Vehicle_Assignmnet;

public class Car extends Vehicle {
    int noOfPassengers;

    public Car(String ownerName, String licenseNumber, String color, int noOfPassengers) {
        super(ownerName, licenseNumber, color);
        this.noOfPassengers = noOfPassengers;
    }

    public int getNoOfPassengers() {
        return noOfPassengers;
    }

    public void setNoOfPassengers(int noOfPassengers) {
        this.noOfPassengers = noOfPassengers;
    }
    
    
}

package day4.Vehicle_Assignmnet;

public class Vehicle {
    String ownerName;
    String licenseNumber;
    String color;
    int noOfWheels;
    public Vehicle(String ownerName, String licenseNumber, String color) {
        this.ownerName = ownerName;
        this.licenseNumber = licenseNumber;
        this.color = color;
        this.noOfWheels = 4;
    }
    public Vehicle(String ownerName, String licenseNumber, String color, int noOfWheels) {
        this.ownerName = ownerName;
        this.licenseNumber = licenseNumber;
        this.color = color;
        this.noOfWheels = noOfWheels;
    }
    public String getOwnerName() {
        return ownerName;
    }
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
    public String getLicenseNumber() {
        return licenseNumber;
    }
    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getNoOfWheels() {
        return noOfWheels;
    }
    public void setNoOfWheels(int noOfWheels) {
        this.noOfWheels = noOfWheels;
    }
    
}

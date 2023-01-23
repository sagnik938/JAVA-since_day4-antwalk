package day4.Vehicle_Assignmnet;

public class Road {
    public static void main(String[] args) {
        Vehicle V1 = new Vehicle("Sagnik", "WB3490kl", "RED");
        Vehicle V2 = new Vehicle("Mananveer", "test45678", "BLUE", 10);
        Bus B1 = new Bus("Arijit", "test45679", "YEllOW", 90);
        Bus B2 = new Bus("Shreyansh", "test56783", "PURPLE",10, 10);
        Car c1 = new Car("Rajarshi", "test^&*0", "GREEEN", 3);
        Truck t1 = new Truck("Prajeet", "Test8907j", "Brown", 10, 1000);

        System.out.println(V1.getOwnerName());
        System.out.println(V2.getOwnerName());
        System.out.println(B1.getOwnerName());
        System.out.println(B2.getOwnerName());
        System.out.println(c1.getOwnerName());
        System.out.println(t1.getOwnerName());
    }

}

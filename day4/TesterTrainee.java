package day4;

public class TesterTrainee {
    public static void main(String[] args) {
        Trainee T1 = new Trainee("Sagnik", 7980333873L, "Kolkata");
        Trainee T2 = new Trainee("Arijit", 7980563873L, "Delhi");
        Trainee T3 = new Trainee("Shreyansh", 7980378973L, "Bengaluru");
        Trainee[] t = { T1 , T2 , T3 } ;
        for(Trainee i : t){
            System.out.println("Name: " + i.getName());
            System.out.println("Name: " + i.getContactNumber());
            System.out.println("Name: " + i.getCity());
            System.out.println("************************");

        }
    }
}

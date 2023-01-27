package day5;

public class TesterCity {
    public static void main(String[] args) {
        City c = new City();
        c.setCities("7000", "Kolkata");
        c.setCities("4000", "Mumbai");
        try {
            System.out.println( c.getCityByZip("4000") ); 
        } 
        catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        // finally{
        //     System.out.println("Thanks for using our applictaion");
        // }
    }
}

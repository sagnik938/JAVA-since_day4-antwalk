package Inventory_Assignment;

import Inventory_Assignment.Material.Accessories;
import Inventory_Assignment.Material.Laptop;

import java.util.ArrayList;

public class TesterInventorySystem {
    public static void main(String[] args) {
        ArrayList<Laptop> laps = new ArrayList<Laptop>();
        ArrayList<Accessories> accs = new ArrayList<Accessories>();
        //Creating Objects of Laptops and Accessories
        for( int i = 0 ; i < 10 ; i++) {
            Laptop l = new Laptop(i + 100, "I am Laptop number" + (i + 100));
            laps.add(l);
            Accessories a = new Accessories(i + 800, "I am Accessory number " + (i + 800));
            accs.add(a);
        }
        // Simulation  for placing 10 laptop orders notice only 7 can be placed
        // before RFM is called as Low order level is 3.
        for(int i=0; i<10 ; i++){
            if( Laptop.checkAvailability() ){
                Laptop.Quantity -= 1;
                System.out.println(laps.remove(0));
            }
            else{
                System.out.println("RFM due to insufficient stock(Laptop)");
                break;
            }
       }
        // Simulation  for placing 10 Accessory orders notice only 5 can be placed
        // before RFM is called as Low order level is 5.
        for(int i=0; i<10 ; i++){
            if( Accessories.checkAvailability() ){
                Accessories.Quantity -= 1;
                System.out.println(accs.remove(0));
            }
            else{
                System.out.println("RFM due to insufficient stock(Accessory)");
                break;
            }
        }
    }

}

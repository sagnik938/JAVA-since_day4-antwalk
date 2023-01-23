package day4.Inventory_Assignmnet.Stock;

import java.util.ArrayList;

import day4.Inventory_Assignmnet.Material.Accessories;
import day4.Inventory_Assignmnet.Material.Laptop;

public class Order {
    public static void main(String[] args) {
        int i;
        ArrayList<Laptop> l = new ArrayList<Laptop>();
        ArrayList<Accessories> acc = new ArrayList<Accessories>();
        for(i=0;i<9;i++){
            l.add( new Laptop(i, "laptop"+i) );
        }

        for(i=0;i<10;i++){
            acc.add( new Accessories(i, "Accessory"+i) );
        }
        System.out.println(l);
        System.out.println(acc);

        //Simulating placing orders
         for(i=0;i<10;i++){
             System.out.println("Ordering");
             System.out.println(l.get(i).getDesc());
             System.out.println(l.get(i).getAccID());
             System.out.println("*************");
             l.remove(l.size()-1);
             if(l.size()<=l.get(i).getLowOrderLevelQuantity()){
                 System.out.println("Calling RFM");
                 break;
             }
         }
    }
}

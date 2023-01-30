package Inventory_Assignment.Material;

import Inventory_Assignment.Stock.Inventory;

public class Laptop extends Inventory {
    public static int Quantity = 0;
    public static int LowOrderLevelQuantity = 3;
    int lId;
    String desc;

//    public Laptop(int quantity, int lowOrderLevelQuantity) {
//        super(quantity, lowOrderLevelQuantity);
//    }

    public Laptop(int lId, String desc) {
        this.lId = lId;
        this.desc = desc;
        Quantity += 1;
    }

    @Override
    public int getQuantity() {
        return Quantity;
    }

    @Override
    public void setQuantity(int quantity) {
        Quantity = quantity;
    }

    @Override
    public int getLowOrderLevelQuantity() {
        return LowOrderLevelQuantity;
    }

    @Override
    public void setLowOrderLevelQuantity(int lowOrderLevelQuantity) {
       LowOrderLevelQuantity = lowOrderLevelQuantity;
    }

    public int getlId() {
        return lId;
    }

    public void setlId(int lId) {
        this.lId = lId;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    static public boolean checkAvailability(){
        return Quantity > LowOrderLevelQuantity;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "lId=" + lId +
                ", desc='" + desc + '\'' +
                '}';
    }
}

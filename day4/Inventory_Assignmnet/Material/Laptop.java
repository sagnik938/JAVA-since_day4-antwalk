package day4.Inventory_Assignmnet.Material;

import day4.Inventory_Assignmnet.Stock.Inventory;

public class Laptop extends Inventory {
    String accID;
    String desc;
    public Laptop(int quantity, String accID) {
        super(quantity, 5);
        this.accID = accID;
        this.desc = "I am a Laptop ";
    }
    public String getAccID() {
        return accID;
    }
    public void setAccID(String accID) {
        this.accID = accID;
    }
    public String getDesc() {
        return desc;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }
}

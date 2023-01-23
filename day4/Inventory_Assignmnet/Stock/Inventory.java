package day4.Inventory_Assignmnet.Stock;

public class Inventory {
    int quantity;
    int lowOrderLevelQuantity;
    public Inventory(int quantity, int lowOrderLevelQuantity) {
        this.quantity = quantity;
        this.lowOrderLevelQuantity = lowOrderLevelQuantity;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public int getLowOrderLevelQuantity() {
        return lowOrderLevelQuantity;
    }
    public void setLowOrderLevelQuantity(int lowOrderLevelQuantity) {
        this.lowOrderLevelQuantity = lowOrderLevelQuantity;
    }
    
    
}

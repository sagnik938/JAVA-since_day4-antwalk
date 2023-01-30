package Inventory_Assignment.Stock;

abstract public class Inventory {
    private int quantity;
    private int lowOrderLevelQuantity;

//    public Inventory(int quantity, int lowOrderLevelQuantity) {
//        this.quantity = quantity;
//        this.lowOrderLevelQuantity = lowOrderLevelQuantity;
//    }

    abstract public int getQuantity() ;

    abstract public void setQuantity(int quantity) ;

    abstract public int getLowOrderLevelQuantity() ;
    abstract public void setLowOrderLevelQuantity(int lowOrderLevelQuantity) ;
}

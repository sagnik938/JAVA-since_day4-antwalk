package day4;

class Order{
     int orderID;
     String orderedFoods;
     double totalPrice;
     String status;

    public Order(){
        this.status = "Ordered";
    }
    public Order(int orderID , String orderedFoods){
        this.orderID = orderID;
        this.orderedFoods =  orderedFoods;

    }
    public Order(int orderID , String orderedFoods,String status){
        this.orderID = orderID;
        this.orderedFoods =  orderedFoods;
        this.status = status;

    }

    public double calculatePrice(int unitPrice){
        double totalPrice = unitPrice + (5*unitPrice);
        return(totalPrice);
    }
    public void dispDetails(String objNo){
        System.out.println(objNo + " Order ID:" + this.orderID);
        System.out.println(objNo + " Ordered Foods:" + this.orderedFoods);
        System.out.println(objNo + " Order Status:" + this.status);
        System.out.println("\n");
    }
}
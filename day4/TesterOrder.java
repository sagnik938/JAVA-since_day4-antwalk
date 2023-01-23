package day4;

public class TesterOrder {
    public static void main(String[] args) {
       Order o1 = new Order();
       Order o2 = new Order(200, "Pizza");
       Order o3 = new Order(300, "Burger", "Delivery");
    //    o1.orderID = 101;
    //    o1.orderedFoods = "Pasta";
    //    o1.status = "Ordered";
    //    o1.totalPrice = o1.calculatePrice(10);
    //    System.out.println(o1.totalPrice);
       o1.dispDetails("O1");
       o2.dispDetails("O2");
       o3.dispDetails("O3");



    }
}

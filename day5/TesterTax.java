package day5;

public class TesterTax {
    public static void main(String[] args) {
        Tax p1 = new PurchaseDetails("456tyh", "Credit");
        /* to test dynamic method dispatch */
        System.out.println("Tax amount " + p1.calcTax(100) + " for transaction id " /*+ p1.getPurchaseID()*/);
        Tax s1 = new Seller("India");
        System.out.println("Tax amount " + s1.calcTax(900) + " for location " /*+ s1.getLocation()*/);
    }
}

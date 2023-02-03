package day7;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product{
    int id;
    String name;
    double price;
    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    @Override
    public String toString() {
        return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
    }
    
}

public class FlatMapAssgn {
    public static void main(String[] args) {
        List<Product> l1 = new ArrayList<Product>();
        List<Product> l2 = new ArrayList<Product>();
        List<Product> l3 = new ArrayList<Product>();
        List<List<Product>> l4 = new ArrayList<List<Product>>();
        List<Product> productList = new ArrayList<Product>();

        l1.add( new Product(100, "HP Laptop", 40000));
        l1.add( new Product(101, "Dell Laptop", 43000));
        l1.add( new Product(102, "Asus Laptop", 45000));

        l2.add( new Product(200, "Canon Cam", 25000));
        l2.add( new Product(201, "Nikon Cam", 30000));
        l2.add( new Product(202, "Sony Cam", 35000));

        l1.add( new Product(300, "JBL", 1999));
        l1.add( new Product(301, "Boat", 3000));
        l1.add( new Product(302, "Noise", 2000));

        l4.add(l1);
        l4.add(l2);
        l4.add(l3);
        System.out.println(l4);

        productList = l4.stream().flatMap(l -> l.stream()).collect(Collectors.toList());
        System.out.println(productList);

    }
}

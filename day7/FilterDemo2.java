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

public class FilterDemo2 {
    public static void main(String[] args) {
        List<Product> prodList = new ArrayList<Product>();
        prodList.add( new Product(100 , "Laptop" , 40000) );
        prodList.add( new Product(101 , "Camera" , 25000) );
        prodList.add( new Product(102 , "Smartphone" , 50000) );
        prodList.add( new Product(100 , "SmartTv" , 35000) );
        prodList.add( new Product(100 , "Mouse" , 4000) );
        List<Product> resList = new ArrayList<Product>();

        prodList.stream().filter(p -> p.price > 30000).forEach(pr -> System.out.println(pr));
        resList = prodList.stream().filter(p -> p.price > 30000).collect(Collectors.toList());
        System.out.println(resList);
        
    }
    
}

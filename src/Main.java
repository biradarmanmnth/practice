import Entity.Order;
import Entity.Product;
import utilityClasses.ListOfOrders;

import java.util.*;

public class Main {
    public static void main(String[] args) {
     //flat map example List<List<String>>
        List<List<Product>> listOrders= ListOfOrders.getListOfOrders();
        List<Product> listOfProducts=listOrders.stream().flatMap(Collection::stream).sorted(Comparator.comparing(Product::getPrice)).toList();
        System.out.println(listOfProducts);
    }
}




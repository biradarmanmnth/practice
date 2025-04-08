import Entity.Order;
import Entity.Product;
import utilityClasses.ListOfOrders;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
     //flat map example List<List<String>>
        List<List<Product>> listOrders= ListOfOrders.getListOfOrders();
        List<Product> listOfProducts=listOrders.stream().flatMap(List::stream).sorted(Comparator.comparing(Product::getPrice)).collect(Collectors.toList());
        System.out.println(listOfProducts);
    }
}




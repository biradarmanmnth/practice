package utilityClasses;

//import Entity.Order;
import Entity.Product;

import java.util.Arrays;
import java.util.List;

public class ListOfOrders {

    public static List<List<Product>> getListOfOrders() {
        List<Product> order1 = Arrays.asList(new Product(40000.00, "laptop"), new Product(2000.00, "headset"));
        List<Product> order2 = Arrays.asList(new Product(500.00, "mouse"), new Product(800.00, "toys"));
        List<Product> order3 = Arrays.asList(new Product(40.00, "notebook"), new Product(2000.00, "wireless headset"));
        List<Product> order4 = Arrays.asList(new Product(1000.00, "bag"), new Product(900.00, "gamePlay"));

        return Arrays.asList(order1, order2, order3, order4);
    }
}

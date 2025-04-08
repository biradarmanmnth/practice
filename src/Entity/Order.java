package Entity;

import java.util.List;
import java.util.Objects;

public class Order {
  private int order_id;
  private List<Product> productList;

    public int getProduct_id() {
        return order_id;
    }

    public void setProduct_id(int product_id) {
        this.order_id = product_id;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public String toString() {
        return "Order{" +
                "product_id=" + order_id +
                ", productList=" + productList +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Order order)) return false;
        return order_id == order.order_id && Objects.equals(productList, order.productList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(order_id, productList);
    }
}

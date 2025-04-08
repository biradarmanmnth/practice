package Entity;

public class Product {
    private String name;
    private double price;

    public double getPrice() {
        return price;
    }

    public Product() {
    }

    public Product(double price, String name) {
        this.price = price;
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Order{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

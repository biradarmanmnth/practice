package Employee;

public class FactoryMethod{
public static void main(String [] args) {
    FoodFactory pizzaFactory=new PizzaFactory();
    pizzaFactory.createOrder();

    FoodFactory burgerFactory=new BurgerFactory();
    burgerFactory.createOrder();

}
}

interface Food{
    void prepare();
    void serve();
}

class Pizza implements Food{
   public void prepare(){
        System.out.println("Pizza is getting prepare.");
    }

   public void serve(){
       System.out.println("Pizza is getting served.");
    }
}

class Burger implements Food{
    public void prepare(){
        System.out.println("Burger is getting prepare.");
    }
    public void serve(){
        System.out.println(" Burger is getting served.");
    }
}

abstract class FoodFactory{
    abstract Food createFood();

    public void createOrder(){
        Food food=createFood();
        food.prepare();
        food.serve();
    }
}

class PizzaFactory extends FoodFactory{
    public Food createFood(){
        return new Pizza();
    }
}

class BurgerFactory extends FoodFactory {
    public Food createFood(){
        return new Burger();
    }
}
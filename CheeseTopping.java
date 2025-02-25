package Pizza.Toppings;

public class CheeseTopping extends PizzaTopping {
    @Override
    public Double getPrice() {
        return 2.00; 
    }

    @Override
    public String toNiceString() {
        return "Cheese Topping";
    }
}
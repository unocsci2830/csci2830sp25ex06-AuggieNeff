package Pizza.Toppings;

public class VeggieTopping extends PizzaTopping {
    @Override
    public Double getPrice() {
        return 1.50; 
    }

    @Override
    public String toNiceString() {
        return "Veggie Topping";
    }
}
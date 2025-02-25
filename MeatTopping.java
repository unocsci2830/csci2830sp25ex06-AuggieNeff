package Pizza.Toppings;

public class MeatTopping extends PizzaTopping {
    @Override
    public Double getPrice() {
        return 3.50; 
    }

    @Override
    public String toNiceString() {
        return "Meat Topping";
    }
}
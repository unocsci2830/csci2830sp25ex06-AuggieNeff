package Pizza.Toppings;

public class Mozzarella extends CheeseTopping {
    @Override
    public String toNiceString() {
        return "Mozzarella Cheese";
    }

    @Override
    public Double getPrice() {
        return 1.75;
    }
}

package Pizza.Toppings;

public class Cheddar extends CheeseTopping {
    @Override
    public String toNiceString() {
        return "Cheddar Cheese";
    }

    @Override
    public Double getPrice() {
        return 1.80;
    }
}

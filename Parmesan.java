package Pizza.Toppings;

public class Parmesan extends CheeseTopping {
    @Override
    public String toNiceString() {
        return "Parmesan Cheese";
    }

    @Override
    public Double getPrice() {
        return 2.00;
    }
}
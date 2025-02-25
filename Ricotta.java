package Pizza.Toppings;

public class Ricotta extends CheeseTopping {
    @Override
    public String toNiceString() {
        return "Ricotta Cheese";
    }

    @Override
    public Double getPrice() {
        return 2.25;
    }
}
package Pizza.Toppings;

public class Olives extends VeggieTopping {
    @Override
    public String toNiceString() {
        return "Olives";
    }

    @Override
    public Double getPrice() {
        return 1.00;
    }
}
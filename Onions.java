package Pizza.Toppings;

public class Onions extends VeggieTopping {
    @Override
    public String toNiceString() {
        return "Onions";
    }
    @Override
    public Double getPrice() {
        return 0.75;
    }
}
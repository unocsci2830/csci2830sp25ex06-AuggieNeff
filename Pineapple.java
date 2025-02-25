package Pizza.Toppings;

public class Pineapple extends VeggieTopping {
    @Override
    public String toNiceString() {
        return "Pineapple";
    }

    @Override
    public Double getPrice() {
        return 1.50;
    }
}

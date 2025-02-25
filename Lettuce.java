package Pizza.Toppings;

public class Lettuce extends VeggieTopping {
    @Override
    public String toNiceString() {
        return "Lettuce";
    }

    @Override
    public Double getPrice() {
        return 1.00;
    }
}
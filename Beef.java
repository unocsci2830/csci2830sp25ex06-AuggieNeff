package Pizza.Toppings;

public class Beef extends MeatTopping {
    @Override
    public String toNiceString() {
        return "Beef";
    }
    @Override
    public Double getPrice() {
        return 2.75;
    }
}

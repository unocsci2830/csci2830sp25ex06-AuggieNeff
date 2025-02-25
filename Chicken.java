package Pizza.Toppings;

public class Chicken extends MeatTopping {
    @Override
    public String toNiceString() {
        return "Chicken";
    }
    @Override
    public Double getPrice() {
        return 2.50;
    }
}

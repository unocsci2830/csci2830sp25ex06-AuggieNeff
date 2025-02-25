package Pizza.Toppings;

public class Pepperoni extends MeatTopping {
    @Override
    public String toNiceString() {
        return "Pepperoni";
    }
    @Override
    public Double getPrice() {
        return 2.50;
    }
}
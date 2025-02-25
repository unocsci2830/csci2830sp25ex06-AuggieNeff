package Pizza.Toppings;

public class Sausage extends MeatTopping {
    @Override
    public String toNiceString() {
        return "Sausage";
    }
    @Override
    public Double getPrice() {
        return 2.00;
    }
}
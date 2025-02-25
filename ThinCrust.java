package Pizza.Crust;

public class ThinCrust extends PizzaCrust {
    @Override
    public String toNiceString() {
        return "Thin Crust made with " + ingredient;
    }

    @Override
    public Double getPrice() {
        return 0.50;
    }
}
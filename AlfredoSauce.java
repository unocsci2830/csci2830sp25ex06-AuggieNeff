package Pizza.Sauce;

public class AlfredoSauce extends PizzaSauce {
    @Override
    public String toNiceString() {
        return "Alfredo Sauce";
    }

    @Override
    public Double getPrice() {
        return 0.75;
    }
}
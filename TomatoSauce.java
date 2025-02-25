package Pizza.Sauce;

public class TomatoSauce extends PizzaSauce {
    @Override
    public String toNiceString() {
        return "Tomato Sauce";
    }

    @Override
    public Double getPrice() {
        return 0.50;
    }
}

package Pizza.Sauce;
import Pizza.MenuItem;



public abstract class PizzaSauce implements MenuItem {
    public abstract String toNiceString();

    @Override
    public Double getPrice() {
        return 0.0;  
    }
}
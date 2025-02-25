package Pizza.Crust;

public class ThickCrust extends PizzaCrust {
    private boolean isDeepDish;

    @Override
    public String toNiceString() {
        String deepDishText = isDeepDish ? " (Deep Dish)" : "";
        return "Thick Crust made with " + ingredient + deepDishText;
    }

    public void setIsDeepDish(boolean isDeepDish) {
        this.isDeepDish = isDeepDish;
    }

    @Override
    public Double getPrice() {
        return 1.00;
    }
}
package Pizza;
import java.util.ArrayList;
import java.util.List;

import Pizza.Crust.PizzaCrust;
import Pizza.Sauce.PizzaSauce;
import Pizza.Toppings.PizzaTopping;

public class Pizza implements MenuItem {
    private PizzaCrust crust;
    private PizzaSauce sauce;
    private List<PizzaTopping> toppings;
    private List<MenuItem> selectionList;

    public Pizza(PizzaCrust crust, PizzaSauce sauce, List<PizzaTopping> toppings) {
        this.crust = crust;
        this.sauce = sauce;
        this.toppings = toppings;
        this.selectionList = new ArrayList<>();
        selectionList.add(crust);
        selectionList.add(sauce);
        selectionList.addAll(toppings);
    }

    @Override
    public String toString() {
        String toppingsList = "";
        for (PizzaTopping topping : toppings) {
            toppingsList += "- " + topping.toNiceString() + " ($" + topping.getPrice() + ")\n";
        }
        
        return "Pizza Details:\n" + 
               crust.toNiceString() + " ($" + crust.getPrice() + ")\n" + 
               sauce.toNiceString() + " ($" + sauce.getPrice() + ")\n" + 
               "Toppings:\n" + toppingsList + 
               "Total Price: $" + this.getPrice();
    }

    @Override
    public Double getPrice() {
        Double totalPrice = 0.0;
        for (MenuItem m : this.selectionList) {
            totalPrice += m.getPrice();
        }
        return totalPrice;
    }
}
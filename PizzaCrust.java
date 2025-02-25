package Pizza.Crust;
import Pizza.MenuItem;

public abstract class PizzaCrust implements MenuItem {
    protected String ingredient; 

    public PizzaCrust() {
        this.ingredient = "flour"; 
    }

    public void setIngredient(String ingredient) {
        this.ingredient = ingredient;
    }

    public String getIngredient() {
        return ingredient;
    }

    public abstract String toNiceString();

   
    public String checkIntegrity() {
        if (this instanceof ThickCrust && ingredient.equalsIgnoreCase("cauliflower")) {
            return "Warning: Handle carefully! Thick crust with cauliflower might fall apart.";
        }
        return "";
    }
}
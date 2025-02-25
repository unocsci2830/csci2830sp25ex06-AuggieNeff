package Pizza;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Pizza.Crust.PizzaCrust;
import Pizza.Crust.ThickCrust;
import Pizza.Crust.ThinCrust;
import Pizza.Sauce.PizzaSauce;
import Pizza.Sauce.AlfredoSauce;
import Pizza.Sauce.TomatoSauce;
import Pizza.Toppings.Beef;
import Pizza.Toppings.Cheddar;
import Pizza.Toppings.Chicken;
import Pizza.Toppings.Lettuce;
import Pizza.Toppings.Mozzarella;
import Pizza.Toppings.Olives;
import Pizza.Toppings.Onions;
import Pizza.Toppings.Parmesan;
import Pizza.Toppings.Pepperoni;
import Pizza.Toppings.Pineapple;
import Pizza.Toppings.PizzaTopping;
import Pizza.Toppings.Ricotta;
import Pizza.Toppings.Sausage;

public class PizzaMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What kind of crust would you like?");
        System.out.println("1 - Thin Crust");
        System.out.println("2 - Thick Crust");
        System.out.print("Your choice: ");
        int crustChoice = input.nextInt();
        PizzaCrust crust = (crustChoice == 1) ? new ThinCrust() : new ThickCrust();

        System.out.println("Select crust ingredient:");
        System.out.println("1 - Flour");
        System.out.println("2 - Cauliflower");
        System.out.print("Your choice: ");
        int ingChoice = input.nextInt();
        String ingredient = (ingChoice == 1) ? "flour" : "cauliflower";
        crust.setIngredient(ingredient);

        if (crust instanceof ThickCrust) {
            System.out.println("Deep Dish? (Y/N)");
            boolean validChoice = false;
            while (!validChoice) {
                String deepDishChoice = input.next();
                switch (deepDishChoice.toLowerCase()) {
                    case "y" -> {
                        ((ThickCrust) crust).setIsDeepDish(true);
                        validChoice = true;
                    }
                    case "n" -> {
                        ((ThickCrust) crust).setIsDeepDish(false);
                        validChoice = true;
                    }
                    default -> System.out.println("Please enter Y or N.");
                }
            }
        }

        System.out.println("What kind of sauce would you like?");
        System.out.println("1 - Tomato Sauce");
        System.out.println("2 - Alfredo Sauce");
        System.out.print("Your choice: ");
        int sauceChoice = input.nextInt();
        PizzaSauce sauce = (sauceChoice == 1) ? new TomatoSauce() : new AlfredoSauce();

        System.out.println("How many toppings? (Max 4): ");
        int numToppings = input.nextInt();
        numToppings = Math.min(numToppings, 4);  // Ensure max 4 toppings

        List<PizzaTopping> toppings = new ArrayList<>();
        System.out.println("Choose your toppings:");
        System.out.println("1  - Sausage\n2  - Pepperoni\n3  - Chicken\n4  - Beef\n5  - Olives\n6  - Onions\n7  - Pineapple\n8  - Lettuce\n9  - Mozzarella\n10 - Parmesan\n11 - Cheddar\n12 - Ricotta");
        
        for (int i = 0; i < numToppings; i++) {
            System.out.print("Your choice: ");
            int toppingChoice = input.nextInt();
            switch (toppingChoice) {
                case 1 -> toppings.add(new Sausage());
                case 2 -> toppings.add(new Pepperoni());
                case 3 -> toppings.add(new Chicken());
                case 4 -> toppings.add(new Beef());
                case 5 -> toppings.add(new Olives());
                case 6 -> toppings.add(new Onions());
                case 7 -> toppings.add(new Pineapple());
                case 8 -> toppings.add(new Lettuce());
                case 9 -> toppings.add(new Mozzarella());
                case 10 -> toppings.add(new Parmesan());
                case 11 -> toppings.add(new Cheddar());
                case 12 -> toppings.add(new Ricotta());
                default -> System.out.println("Invalid choice, skipping.");
            }
        }

        Pizza pizza = new Pizza(crust, sauce, toppings);
        System.out.println("\n" + pizza);

        String integrityWarning = crust.checkIntegrity();
        if (!integrityWarning.isEmpty()) {
            System.out.println(integrityWarning);
        }

        input.close();
    }
}
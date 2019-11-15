import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<String> validInput = new HashSet<String>();
        validInput.addAll(Arrays.asList(new String[] {"simple", "elementary", "sophisticated", "basic", "advanced"}));

        String typeOfBeverage;
        do {
            System.out.println("Please enter the type of beverage you want (simple, elementary, sophisticated, basic, advanced):");
            typeOfBeverage = sc.nextLine();
        } while (!validInput.contains(typeOfBeverage));

        Beverage coffee = new Coffee();

        if (typeOfBeverage.equals("simple")) {
            coffee = new Simple(coffee);
        }
        if (typeOfBeverage.equals("elementary")) {
            coffee = new Elementary(coffee);
        }
        if (typeOfBeverage.equals("sophisticated")) {
            coffee = new Sophisticated(coffee);
        }
        if (typeOfBeverage.equals("basic")) {
            coffee = new Basic(coffee);
        }
        if (typeOfBeverage.equals("advanced")) {
            coffee = new Advanced(coffee);
        }

        System.out.printf(coffee.getDescription());
    }
}

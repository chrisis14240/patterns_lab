import java.util.Scanner;

public class Main {

    public static void handleTransportation(String criteria, String level) {
        TransportManager  manager = new TransportManager();

        if (level .equals("low")) {
            manager.setStrategy((criteria.equals("money"))? new BicycleStrategy() : new CarStrategy());
        }

        if (level .equals("mid")) {
            manager.setStrategy(new BusStrategy());
        }

        if (level .equals("high")) {
            manager.setStrategy((criteria.equals("money"))? new CarStrategy() : new BicycleStrategy());
        }

        manager.gotTotheAirport();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String criteria;
        do {
            System.out.println("Please insert the criteria to define which method to use (money, time):");
            criteria = sc.nextLine();
        } while (!criteria.equals("money") && !criteria.equals("time"));

        String level;
        do {
            System.out.println("Please insert the level of " + criteria + " you want to spent (low, mid, high):");
            level = sc.nextLine();
        } while (!level.equals("low") && !level.equals("mid") && !level.equals("high"));


        handleTransportation(criteria, level);
    }
}

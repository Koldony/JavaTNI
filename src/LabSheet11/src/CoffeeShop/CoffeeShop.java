package CoffeeShop;

import java.util.Scanner;

public class CoffeeShop {
    static Scanner scanner = new Scanner(System.in);
    public static Espresso orderEspresso() {
        System.out.print("Enter a size: ");
        String size = scanner.nextLine();
        Espresso e = new Espresso(size);
        System.out.print("Press 'y' or 'Y' for adding a shot: ");
        String addShot = scanner.nextLine();
        if (addShot.equalsIgnoreCase("y")) {
            System.out.print("How many shots for adding in Espresso");
            int shot = scanner.nextInt();
            e.addShot(shot);
        }
        return e;
    }

    public static Frappuccino orderFrappuccino() {
        System.out.print("Enter a size: ");
        String size = scanner.nextLine();
        System.out.print("Press 'y' or 'Y' for adding whipping cream: ");
        String option = scanner.next();
        boolean whipped = option.equalsIgnoreCase("y");
        return new Frappuccino(size, whipped);
    }

    public static void main(String[] args) {
        System.out.println("Press 1 for ordering Espresso");
        System.out.println("Press 2 for ordering Frappuccino");
        while (true) {
            System.out.print("Enter an option: ");
            int option = scanner.nextInt();
            if (option == 1) {
                orderEspresso();
            } else if (option == 2) {
                orderFrappuccino();
            } else break;
            System.out.print("Do you want to order more [y/Y]");
            String addMore = scanner.nextLine();
            if (!addMore.equalsIgnoreCase("y")) {
                break;
            }
        }
        
    }
}

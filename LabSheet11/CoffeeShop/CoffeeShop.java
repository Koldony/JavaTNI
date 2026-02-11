package CoffeeShop;

import java.util.Scanner;

public class CoffeeShop {
    static Scanner scanner = new Scanner(System.in);
    public static Espresso orderEspresso() {
        System.out.print("Enter a size: ");
        String size = scanner.next();
        Espresso e = new Espresso(size);
        System.out.print("Press 'y' or 'Y' for adding a shot: ");
        String addShot = scanner.next();
        if (addShot.equalsIgnoreCase("y")) {
            System.out.print("How many shots for adding in Espresso: ");
            int shot = scanner.nextInt();
            e.addShot(shot);
        }
        return e;
    }

    public static Frappuccino orderFrappuccino() {
        System.out.print("Enter a size: ");
        String size = scanner.next();
        System.out.print("Press 'y' or 'Y' for adding whipping cream: ");
        String option = scanner.next();
        boolean whipped = option.equalsIgnoreCase("y");
        Frappuccino f = new Frappuccino(size, whipped);
        return f;
    }

    public static void main(String[] args) {
        int espressoCount = 0;
        int frappuccinoCount = 0;
        double totalPrice = 0;
        System.out.println("Press 1 for ordering Espresso");
        System.out.println("Press 2 for ordering Frappuccino");
        while (true) {
            System.out.print("Enter an option: ");
            int option = scanner.nextInt();
            if (option == 1) {
                Espresso order1 = orderEspresso();
                System.out.println(order1);
                espressoCount++;
                totalPrice += order1.calculateFinalPrice();
            } else if (option == 2) {
                Frappuccino order2 = orderFrappuccino();
                System.out.println(order2);
                frappuccinoCount++;
                totalPrice += order2.calculateFinalPrice();
            } else break;
            System.out.println();
            System.out.print("Do you want to order more [y/Y]: ");
            String addMore = scanner.next();
            if (!addMore.equalsIgnoreCase("y")) break;
        }

        System.out.println("You ordered " + espressoCount + " Espresso");
        System.out.println("You ordered " + frappuccinoCount + " Frappuccino");
        System.out.println("Total Price = " + totalPrice);
    }
}
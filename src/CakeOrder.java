import java.util.Scanner;

public class CakeOrder extends Bakery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Birthday Cake's Details:");
        System.out.print("Enter a message on cake: ");
        String message = scanner.nextLine();
        System.out.print("Enter a flavor: ");
        String flavor = scanner.nextLine();
        System.out.print("How many pound: ");
        double pound = scanner.nextDouble();

        BirthdayCake order1 = new BirthdayCake(message, pound, flavor, 350);
        System.out.println(order1);

        System.out.println("\nCup Cake's Details:");
        System.out.print("Enter a flavor : ");
        String cup_flavor = scanner.next();
        System.out.print("How many piece : ");
        int piece = scanner.nextInt();

        Cupcake order2 = new Cupcake(piece, cup_flavor, 65);
        System.out.println(order2);

        System.out.println("\nPie's Details:");
        System.out.print("How many slice : ");
        int slice = scanner.nextInt();

        Pie order3 = new Pie(slice, 70);
        System.out.println(order3);

        System.out.println("\nTotal price = " +
                (order1.calculateTotalPrice() + order2.calculateTotalPrice()
                + order3.calculateTotalPrice()));
    }
}

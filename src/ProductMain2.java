import java.util.Scanner;

public class ProductMain2 {
    public static void main(String[] args) {
        String line = "------------------------------------------------";
        Product product1 = new Product();
        product1.name = "Pens";
        product1.price = 10.5;
        product1.quantity = 50;

        Product product2 = new Product();
        product2.name = "Notebooks";
        product2.price = 25.75;
        product2.quantity = 20;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Mini Shop");
        System.out.println(line);
        System.out.println("Press [1] to buy Pen");
        System.out.println("Press [2] to buy Notebook");
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        while(num != 1 && num != 2) {
            System.out.print("Invalid number! Enter a number, again: ");
            num = scanner.nextInt();
        }
        if (num == 1) {
            System.out.println();
            product1.showInfo();
            System.out.println(line);
            System.out.print("How many Pens do you want to buy? ");
            int amount = scanner.nextInt();
            product1.sell(amount);
            System.out.println(line);
            product1.showInfo();
        } if (num == 2) {
            System.out.println();
            product2.showInfo();
            System.out.println(line);
            System.out.print("How many Notebooks do you want to buy? ");
            int amount = scanner.nextInt();
            product2.sell(amount);
            System.out.println(line);
            product2.showInfo();
        }



    }
}
import java.util.Scanner;

public class ProductMain4 {
    public static void main(String[] args) {
        String line = "------------------------------------------------";
        Scanner scanner = new Scanner(System.in);
        Product products[] = new Product[4];
        System.out.println("Welcome to MINI SHOP!!");
        System.out.println(line);
        setting_product(products);
        int i = 1;
        for(Product p : products) {
            System.out.println("Press " + i + " buy " + p.name + " (items=" + p.quantity + ")");
        }
        System.out.println(line);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        while(num != 1 && num != 2 && num != 3 && num !=4) {
            System.out.print("Invalid number! Enter a number, again: ");
            num = scanner.nextInt();
        }
        if (num == 1) {
            System.out.println();
            products[0].showInfo();
            System.out.print("How many Pens do you want to buy? ");
            int amount = scanner.nextInt();
            products[0].sell(amount);
            System.out.println();
            products[0].showInfo();
            System.out.println(line);
        } if (num == 2) {
            System.out.println();
            products[1].showInfo();
            System.out.print("How many Pencils do you want to buy? ");
            int amount = scanner.nextInt();
            products[1].sell(amount);
            System.out.println();
            products[1].showInfo();
            System.out.println(line);
        } if (num == 3) {
            System.out.println();
            products[2].showInfo();
            System.out.print("How many Markers do you want to buy? ");
            int amount = scanner.nextInt();
            products[2].sell(amount);
            System.out.println();
            products[2].showInfo();
            System.out.println(line);
        } if (num == 4) {
            System.out.println();
            products[3].showInfo();
            System.out.print("How many Highlighters do you want to buy? ");
            int amount = scanner.nextInt();
            products[3].sell(amount);
            System.out.println();
            products[3].showInfo();
            System.out.println(line);
        }

    }
    public static void setting_product(Product... products) {
        String[] names = {"Pens", "Pencils", "Markers", "Highlighters"};
        double[] prices = {25.5, 17.25, 30, 35};
        int[] quantities = {20, 35, 10, 40};

        for (int i=0; i<products.length; i++) {
            products[i] = new Product();
            products[i].name = names[i];
            products[i].price = prices[i];
            products[i].quantity = quantities[i];
        }
    }
}

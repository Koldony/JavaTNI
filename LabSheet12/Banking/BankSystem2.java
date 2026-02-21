package Banking;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class BankSystem2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your bank account: ");
        String accId = scan.nextLine();
        AccountTransaction acc = new AccountTransaction(accId);

        if (!acc.hasAccountId()) {
            System.out.println("Bank account not found...");
            return;
        }

        System.out.println();
        System.out.println("Press 1 to deposit");
        System.out.println("Press 2 to withdraw");
        System.out.println("Press 3 to check balance");
        System.out.println("Press 4 to exit");

        while (true) {
            System.out.print("\nEnter menu: ");
            String menu = scan.nextLine();
            if (menu.equals("1")) {
                try {
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = Double.parseDouble(scan.nextLine());
                    acc.deposit(depositAmount);
                    System.out.println("Current Balance: " + acc.getAccBalance());
                } catch (Exception e) {
                }
            } else if (menu.equals("2")) {
                try {
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawalAmount = Double.parseDouble(scan.nextLine());
                    acc.withdraw(withdrawalAmount);
                    System.out.println("Your Balance: " + acc.checkBalance());
                } catch (Exception e) {
                }
            } else if (menu.equals("3")) {
                System.out.println("Your Balance: " + acc.checkBalance());
            }
            else if (menu.equals("4")) break;
            else System.out.print("");
        }
    }
}

package Banking;

import java.util.Scanner;

public class BankSystem1 {
    public static String input_account_id() {
        Scanner scan = new Scanner(System.in);
        String accId;
        while (true) {
            System.out.print("Enter account id: ");
            accId = scan.nextLine();
            if (accId.length() == 10) return accId;
            else System.out.print("Enter account id: "); accId = scan.nextLine();
        }
    }
    public static double input_initial_balance() {
        Scanner scan = new Scanner(System.in);
        double accBalance;

        while (true) {
            try {
                System.out.println();
                System.out.print("Enter your initial deposit amount: ");
                accBalance = Double.parseDouble(scan.nextLine()); return accBalance;
            } catch (NumberFormatException e) {
                System.out.print("Try again!! ");
            }
        }
    }

    public static void main(String[] args) {
        String bank_acc = input_account_id();
        double initial_balance = input_initial_balance();

        OpenNewAccount account =  new OpenNewAccount(bank_acc, initial_balance);
        String result = account.recordAccount();
        System.out.println();
        System.out.println(result);
    }
}

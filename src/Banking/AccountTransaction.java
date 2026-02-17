package Banking;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AccountTransaction extends BankAccount {
    public AccountTransaction(String accId) {
        super(accId, 0);

    }
    public boolean hasAccountId() throws FileNotFoundException {
        try {
            File file = new File(getFilename());
            if (!file.exists()) return false;
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String[] data = scanner.nextLine().split(",");
                if (data[0].equals(getAccId())) scanner.close();
                return true;
            }
            scanner.close();
        } catch (Exception e) {
        } return false;
    }
    public void deposit(double amount) {
       
    }
    public void withdraw() {

    }
    public void checkBalance() {

    }
}

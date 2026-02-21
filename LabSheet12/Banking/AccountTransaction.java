package Banking;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class AccountTransaction extends BankAccount {
    public AccountTransaction(String accId) {
        super(accId);
    }
    public boolean hasAccountId() {
        try {
            File file = new File(getFilename());
            if (!file.exists()) return false;
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String[] data = scanner.nextLine().split(",");
                setAccBalance(Double.parseDouble(data[1]));
                if (data[0].equals(getAccId())) {
                    scanner.close();
                    return true;
                }
            }
            scanner.close();
        } catch (IOException e) {
        } return false;
    }
    @Override
    public void deposit(double amount) {
        setAccBalance(getAccBalance() + amount);

    }
    @Override
    public void withdraw(double amount) {
        if (getAccBalance() >= amount) {
            setAccBalance(getAccBalance() - amount);

        }
    }
    @Override
    public double checkBalance() {
        return getAccBalance();
    }
}
package Banking;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class OpenNewAccount extends BankAccount {
    public OpenNewAccount(String accId, double accBalance) {
        super(accId,accBalance);
    }
    public String recordAccount() {
        if (isExistingAccount()) return "This account has been created!!";
        try {
            FileWriter savefile = new FileWriter(getFilename(), true);
            savefile.write(toString() + "\n");
            savefile.close();
        } catch (IOException e) {
            return "Error!!";
        }
        return "Created account success!!";
    }
    private boolean isExistingAccount(String account_name) {
        try {
            File file = new File(getFilename());
            if (!file.exists()) return false;
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] data = line.split(",");
                if (data[0].equals(getAccId())) scanner.close();
                return true;
            } scanner.close();
        } catch (IOException e) {
        } return false;
    }
}

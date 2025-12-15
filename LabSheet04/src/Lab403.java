import javax.swing.*;

public class Lab403 {
    static void main() {
        String USERNAME = "admin";
        String PASSWORD = "Admin1234";
        while (true) {
            String user = JOptionPane.showInputDialog("Enter Username: ");
            String pass = JOptionPane.showInputDialog("Enter Password: ");
            if (user.equalsIgnoreCase(USERNAME) && pass.equals(PASSWORD) && user != null && pass != null) {
                JOptionPane.showMessageDialog(null, "Login Success!!");
                break;
            }
            else {
                JOptionPane.showMessageDialog(null, "Login Fail...", null, JOptionPane.WARNING_MESSAGE);
            }
        }
    }
}

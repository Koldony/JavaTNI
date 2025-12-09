import javax.swing.*;

public class Lab402 {
    public static void main(String[] args) {
        String id = JOptionPane.showInputDialog("Enter student-id:");
        while (id.length() != 10) {
            id = JOptionPane.showInputDialog("Enter your id, again:");
        } if (id.substring(2,4) == "131") {
            JOptionPane.showMessageDialog(null,"Student ID: " + id +
                    "\nMajor: Information Technology (IT)");
        }
    }
}

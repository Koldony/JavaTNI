import javax.swing.*;

public class Lab307 {
    public static void main(String[] args) {
        double total = 0;
        while (true) {
            double price = Double.parseDouble(JOptionPane.showInputDialog(null,"Input price [press 0 to stop]:"));
            while (price < 0) {
                price = Double.parseDouble(JOptionPane.showInputDialog(null,"Invalid price!!\nInput price [press 0 to stop]:"));
            } if (price == 0) {
                break;
            }
            total += price;
        }
        JOptionPane.showMessageDialog(null, "Total price is " + total + " baht.");
    }
}
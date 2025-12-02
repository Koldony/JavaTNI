import javax.swing.*;

public class Lab307 {
    public static void main(String[] args) {
    double price = 0;
    double total = 0;
    boolean he = true;
    while (he) {
        if (price > 0) {
            price = Double.parseDouble(JOptionPane.showInputDialog(null,"Input price [press 0 to stop]:"));
            total += price;
        } if (price == 0) {
            JOptionPane.showInputDialog(null,"Invalid price!!\nInput price [press 0 to stop]:");
            he = false;
        } else {
            JOptionPane.showMessageDialog(null,"Total price is " + total + " baht.");
        } if (p)
    }
    }
}

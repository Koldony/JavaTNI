import javax.swing.*;

public class Ex301 {
    public static void main(String[] args) {
        double total_price = Double.parseDouble(JOptionPane.showInputDialog("Enter total price:"));

        int coupon = JOptionPane.showConfirmDialog(null,"Do you have coupon?",
                "Coupon",JOptionPane.YES_NO_OPTION);

        if (coupon == 0) {
            int discount_coupon = Integer.parseInt(JOptionPane.showInputDialog(null,"How many discount(%)?"));
            double discount = total_price * discount_coupon / 100;
            double payment = total_price - discount;
            JOptionPane.showMessageDialog(null,"You get discount "+ discount + " baht." +
                    "\nTotal price is " + payment + " bath.");
        }
        else {
            if (total_price >= 1500) {
                double discount = total_price * 10 / 100;
                double payment = total_price - discount;
                JOptionPane.showMessageDialog(null,"You get discount 10% ("+ discount + ")" + " baht." +
                        "\nTotal price is " + payment + " bath.");
            } else {
                JOptionPane.showMessageDialog(null, "Total price is " + total_price + " bath.");
            }
        }
    }
}

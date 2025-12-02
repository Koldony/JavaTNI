import javax.swing.*;

public class Lab302 {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog(null, "Enter your name:");
        double height = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter your height (cm.)"));
        int gender = JOptionPane.showConfirmDialog(null,"Are your biological gender is Male?",
                "Coupon",JOptionPane.YES_NO_OPTION);
        if (gender == 0) {
            JOptionPane.showMessageDialog(null,"Hello. Mr." + name +
                    "\nIf your height is " + height + "cm." + "\nYour weight should be " + (height - 100) + " kg.");
        } else if (gender == 1) {
            int gender2 = JOptionPane.showConfirmDialog(null,"Are your biological gender is Female?",
                    "Coupon",JOptionPane.YES_NO_OPTION);
            if (gender2 == 0) {
                JOptionPane.showMessageDialog(null,"Hello. Ms." + name +
                        "\nIf your height is " + height + "cm." + "\nYour weight should be " + (height - 110) + " kg.");
            } else {
                JOptionPane.showMessageDialog(null,"You can use BMI to measure your weight and height");
            }
        }
    }
}

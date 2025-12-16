import javax.swing.*;

public class Lab506 {
    public static boolean is_prime_number(int number) {
        if (number <= 1) return false;
        if (number == 2) return true;
        if (number % 2 == 0) return false;
        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            if (number % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Enter an integer"));
        while (num<1) {
            num = Integer.parseInt(JOptionPane.showInputDialog("Enter an integer"));
        }
        JOptionPane.showMessageDialog(null,is_prime_number(num)?num+" is Prime number" :
                num+" is NOT Prime number");
    }
}

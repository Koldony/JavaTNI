import javax.swing.*;

public class Ex305 {
    public static void main(String[] args) {
        int score = Integer.parseInt(JOptionPane.showInputDialog("Enter your score:"));

        while (score < 0 || score > 100) {
            score = Integer.parseInt(JOptionPane.showInputDialog(null,"Invalid score!!\nEnter your score:"));
        }
        JOptionPane.showMessageDialog(null,score >= 50?"PASS":"FAIL");
    }
}

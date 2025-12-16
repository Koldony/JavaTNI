import javax.swing.*;

public class Lab502 {
    public static String find_grade(int score) {
        if (score >= 80 && score <= 100) {
            return "A";
        } else if (score >= 70 && score <= 79) {
            return "B";
        } else if (score >= 60 && score <= 69) {
            return "C";
        } else if (score >= 50 && score <= 59) {
            return "D";
        } else {
            return "F";
        }
    }

    public static int cal_score(int midterm, int Final) {
        return midterm + Final;
    }

    public static int input_score(String message, int limit_score) {
        int score = Integer.parseInt(JOptionPane.showInputDialog(message));
        while (score < 0 || score > limit_score) {
            score = Integer.parseInt(JOptionPane.showInputDialog("Score must be in range between 0 and " + limit_score +
                    "\n" + message));
        }
        return score;
    }

    public static void main(String[] args) {
        int confirm = JOptionPane.showConfirmDialog(null,"Do you want to check your score?", "Check score", JOptionPane.YES_NO_OPTION);
        if (confirm == 0) {
            int midterm = input_score("Enter midterm score:",45);
            int Final = input_score("Enter Final score:",55);
            JOptionPane.showMessageDialog(null,"Your score is " + cal_score(midterm,Final) +
                    "\nYou get grade " + find_grade(cal_score(midterm,Final)));
        } else {
            JOptionPane.showMessageDialog(null,"END PROGRAM!!");
        }
    }
}

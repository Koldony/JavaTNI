import javax.swing.*;

public class Lab205 {
    public static void main(String[] args) {
        final int INAMINUTE = 60;
        final int hour = 0;

        int minute = Integer.parseInt(JOptionPane.showInputDialog("Input minutes: "));
        int inHour = hour+minute;
        int thisHour = inHour/INAMINUTE;
        int thisMinute = minute%INAMINUTE;

        JOptionPane.showMessageDialog(null,
                 minute + " minutes is "+ thisHour + " hour " + thisMinute + " minute");
    }
}

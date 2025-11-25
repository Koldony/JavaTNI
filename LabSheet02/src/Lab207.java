import javax.swing.*;
import java.text.DecimalFormat;

public class Lab207 {
    public static void main(String[] args) {
        final double INAHOUR = 7.50;
        final double TAX = 0.15;
        DecimalFormat form = new DecimalFormat("#,###.00");

        JOptionPane.showMessageDialog(null,"Welcome to the playroll application");
        String name = JOptionPane.showInputDialog(null,"Enter employee name:");
        int hour = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter total hour for this employee"));

        double payout = INAHOUR*hour;
        double taxingit = payout * TAX;
        double afterTax = payout - taxingit;
        JOptionPane.showMessageDialog(null,
                "Employee name: "+name +
                        "\nHour worked: "+hour +
                        "\nHourly wage: "+"$"+form.format(INAHOUR) +
                        "\nGross earnings: "+"$"+form.format(payout) +
                        "\nTax rate: "+TAX +
                        "\nTax: "+"$"+form.format(taxingit)+
                        "\nNet earnings: "+"$"+form.format(afterTax));
    }
}

import java.text.DecimalFormat;
import java.util.Scanner;

public class Lab202 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        double n1 = Integer.parseInt(scanner.next());
        scanner.nextLine();
        System.out.print("Enter number 2: ");
        double n2 = Integer.parseInt(scanner.next());
        DecimalFormat form = new DecimalFormat("##");

        System.out.println("Summation = "+form.format(n1+n2));
        System.out.println("Subtraction = "+form.format(n1-n2));
        System.out.println("Multiplication = "+form.format(n1*n2));
        System.out.println("Division = "+(n1/n2));
        System.out.println("Modulus = "+form.format(n1%n2));
    }
}

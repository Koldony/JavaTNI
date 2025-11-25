import java.text.DecimalFormat;
import java.util.Scanner;

public class Lab204 {
    public static void main(String[] args) {
        final int INAMINUTE = 60;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input hour : ");
        int hour = Integer.parseInt(scanner.next());
        scanner.nextLine();
        System.out.print("Input minute: ");
        int minute = Integer.parseInt(scanner.next());

        int time = hour*INAMINUTE;
        int currentTime = time+minute;

        System.out.println("Total time is "+currentTime + " minutes");
    }
}

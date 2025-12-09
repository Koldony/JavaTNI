import java.util.Scanner;

public class Ex402 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first  message: ");
        String message1 = scanner.nextLine();
        System.out.print("Enter the second message: ");
        String message2 = scanner.nextLine();

        System.out.print("\nSensitive comparison    : ");
        if (message1.equals(message2)){
            System.out.print("Both messages are the same");
        } else {
            System.out.print("Both messages are NOT the same");
        }

        System.out.print("\nInsensitive comparison  : ");
        if (message1.equalsIgnoreCase(message2)){
            System.out.print("Both messages are the same");
        } else {
            System.out.print("Both messages are NOT the same");
        }

    }
}

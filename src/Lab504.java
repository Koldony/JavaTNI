import java.util.Scanner;

public class Lab504 {
    public static boolean check_password(String pass) {
        return pass.length() < 8;
    }
    public static boolean check_password(String pass, String confirm_pass) {
        return confirm_pass != pass;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Create password: ");
        String password = scanner.nextLine();
        while (check_password(password)) {
            System.out.print("Invalid Password! Create password: ");
            password = scanner.nextLine();
        }
        System.out.print("Enter confirm password: ");
        String confirm_password = scanner.nextLine();
        while (check_password(confirm_password)) {
            System.out.print("Password do not match! Enter confirm password: ");
            confirm_password = scanner.nextLine();
        }
        System.out.println();
        System.out.println("Password set successfully!!");




    }
}

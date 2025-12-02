import java.util.Scanner;

public class Lab308 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many number to input: ");
        int numInput = scanner.nextInt();
        int maximum = 0;
        int minimum = 0;
        int even = 0;
        int odd = 0;
        int num = 0;
        for (int i = 1; i <= numInput; i++) {
            System.out.print("Enter number " + i + ": ");
            num = scanner.nextInt();
            if (num%2==0) {
               even++;
            } if (num%2!=0) {
                odd++;
            } if (num>maximum) {
                maximum = num;
            } if (num<minimum) {
                minimum = num;
            }
        }
        System.out.println("Maximum = " + maximum);
        System.out.println("Minimum = " + minimum);
        System.out.println("Even number = " + even);
        System.out.print("Odd number  = " + odd);

    }
}

import java.util.Scanner;

public class Ex604 {
    public static Scanner scanner = new Scanner(System.in);
    public static int input_length() {
        System.out.print("How many number to input");
        int length = scanner.nextInt();
        while (length < 1) {
            System.out.print("How many number to input: ");
            length = scanner.nextInt();
        }
        return length;
    }
    public static int[] input_array(int length) {
        int[] numbers = new int[length];
        for (int i=0; i<numbers.length; i++) {
            System.out.print("Enter number: ");
            numbers[i] = scanner.nextInt();
        }
        return numbers;
    }
    public static int count_even(int... numbers) {
        int count = 0;
        for (int num : numbers) {
            if (num%2==0) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
       int length = input_length();
       int[] numbers = input_array(length);
        System.out.print("There are " + count_even(numbers) + " number(s) in array = ");
        for (int num : numbers) {
            if (num % 2 == 0)
                System.out.print(num + " ");
        }
    }
}

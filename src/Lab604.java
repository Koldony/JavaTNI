import java.util.Scanner;

public class Lab604 {
    public static Scanner scanner = new Scanner(System.in);
    public static void display_array(int[] numbers) {
        System.out.println("List of numbers in array: 47, 13, 82, 17, 61, 29, 94, 36");
    }
    public static boolean check_index(int[] numbers, int index) {
        return index >= 0 && index < numbers.length;
    }
    public static int input_index(int[] numbers) {
        int index;
        System.out.print("Enter index: ");
        index = scanner.nextInt();
        while (!check_index(numbers, index)) {
            System.out.print("Invalid index!! Enter index, again: ");
            index = scanner.nextInt();
        }
        return index;
    }

    public static void main(String[] args) {
        int[] numbers = {47, 13, 82, 17, 61, 29, 94, 36};
        display_array(numbers);
        int index = input_index(numbers);
        System.out.println();
        System.out.println("The number at index " + index + " is " + numbers[index]);
        if (index - 1 < 0) {
            System.out.println("The number before index " + index + " is Out of range!!");
        }
        else {
            System.out.println("The number before index " + index + " is " + numbers[--index]);
        }
        System.out.println("The number after  index " + ++index + " is " + numbers[++index]);
    }
}

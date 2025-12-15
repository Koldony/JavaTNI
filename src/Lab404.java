import java.util.Scanner;

public class Lab404 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String end = "";
        while (true){
            System.out.print("Enter word: ");
            String word = scanner.nextLine();
            if (word.equalsIgnoreCase("stop")) {
                break;
            }
            end = end + word + " ";
        }
        System.out.println(end.trim());
    }
}
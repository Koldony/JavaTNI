import java.util.Scanner;

public class Lab404 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = "";
        while (true){
            System.out.print("Enter word: ");
            word = scanner.nextLine();
            if (word.toLowerCase().toUpperCase() == "stop") {
                break;
            }
        }
        System.out.println(word.concat(word));
    }
}

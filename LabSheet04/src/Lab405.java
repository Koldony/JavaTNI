import java.util.Scanner;

public class Lab405 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String sentence;
        System.out.print("Input sentence: ");
        sentence = sc.nextLine();
        while (true) {
            if (sentence.endsWith(".")) {
                break;
            } else {
                System.out.print("The sentence must end with full stop point: ");
                sentence = sc.nextLine();
            }
        }
        System.out.println();
        String[] words = sentence.split(" ");
        for (String word : words) {
            System.out.println(word);
        }
    }
}

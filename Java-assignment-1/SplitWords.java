import java.util.Scanner;

public class SplitWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        // Split the sentence into words using space as delimiter
        String[] words = sentence.split(" ");

        // Print each word on a new line
        System.out.println("Words in the sentence:");
        for (String word : words) {
            if (!word.isEmpty()) {  // ignore extra spaces
                System.out.println(word);
            }
        }

        sc.close();
    }
}

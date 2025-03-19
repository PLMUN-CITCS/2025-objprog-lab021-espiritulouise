import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("\nEnter a sentence (or type 'exit' to quit): ");
            String sentence = scanner.nextLine().trim();

            if (sentence.equalsIgnoreCase("exit")) {
                System.out.println("Exiting program. Goodbye!");
                break;
            }

            if (sentence.isEmpty()) {
                System.out.println("No words entered. Try again.");
                continue;
            }

            String[] words = sentence.split("\\s+");
            System.out.println("The sentence has " + words.length + " words.");
        }

        scanner.close(); // Close scanner after exiting the loop
    }
}

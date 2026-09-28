package Syntax;
import java.util.Scanner;
public class syntaxtask {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // part 1.1 while loop
        int countWhile = 1;
        while (countWhile <= 3) {
            System.out.println("While loop iteration: " + countWhile);
            countWhile++;
        }

        // part 1.2 do while loop
        int countDoWhile = 1;
        do {
            System.out.println("Do-While loop iteration: " + countDoWhile);
            countDoWhile++;
        } while (countDoWhile <= 3);

        // part 1.3 for loop increment
        System.out.println("increment from 1 to 10");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // part 1.4 for loop decrement
        System.out.println("decrement from 10 to 1");
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        // part 1.5 iterate through string
        String sampleText = "Java";
        for (int i = 0; i < sampleText.length(); i++) {
            System.out.println(sampleText.charAt(i));
        }

        // part 1.6 loop inside loop (nested)
        for (int i = 1; i <= 3; i++) {
            System.out.println("Outer loop i = " + i);
            for (int j = 1; j <= 2; j++) {
                System.out.println("   Inner loop j = " + j);
            }
        }


        // // Part 2. Simple Dialog with Loop
        System.out.println("\n==========================================");
        System.out.println("=== PART 2: SIMPLE DIALOG WITH LOOP ===");
        System.out.println("==========================================");

        String userChoicePart2;
        do {
            System.out.print("Enter any string to uppercase: ");
            String inputStr = scanner.nextLine();

            // Print uppercased version
            System.out.println("Uppercase result: " + inputStr.toUpperCase());

            System.out.print("Do you want to continue? (Y/N): ");
            userChoicePart2 = scanner.nextLine();
        } while (userChoicePart2.equalsIgnoreCase("Y"));


        // // Part 3. Improved Dialog with Loop
        System.out.println("\n==========================================");
        System.out.println("=== PART 3: IMPROVED DIALOG WITH LOOP ===");
        System.out.println("==========================================");

        String userChoicePart3;
        do {
            System.out.print("Enter any string to reverse: ");
            String inputStr = scanner.nextLine();

            // Print reversed order using loop and charAt()
            System.out.print("Reversed string: ");
            for (int i = inputStr.length() - 1; i >= 0; i--) {
                System.out.print(inputStr.charAt(i));
            }
            System.out.println();

            System.out.print("Do you want to continue? (Y/N): ");
            userChoicePart3 = scanner.nextLine();
        } while (userChoicePart3.equalsIgnoreCase("Y"));


        // Part 4 previous Project (3.3) into Loop
        System.out.println("\n==========================================");
        System.out.println("=== PART 4: REPEATING CONVERSATION LOOP ===");
        System.out.println("==========================================");

        String userChoicePart4;
        do {
            System.out.print("Hello! What is your name? ");
            String name = scanner.nextLine();
            System.out.println("Nice to meet you, " + name + "!");

            System.out.print("How are you feeling today? ");
            String mood = scanner.nextLine();
            System.out.println("Glad to hear that you are feeling '" + mood + "'!");

            System.out.print("Do you want to repeat the whole conversation? (Y/N): ");
            userChoicePart4 = scanner.nextLine();
        } while (userChoicePart4.equalsIgnoreCase("Y"));

        System.out.println("\nProgram finished successfully.");
        scanner.close();
    }
}
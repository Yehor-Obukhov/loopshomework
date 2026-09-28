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
    }
}
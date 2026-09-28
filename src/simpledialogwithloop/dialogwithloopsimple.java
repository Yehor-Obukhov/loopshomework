package simpledialogwithloop;
import java.util.Scanner;

public class dialogwithloopsimple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // part 2 simple dialog with loop
        System.out.println("simple dialog with loop");

        String userChoicedialog;
        do {
            System.out.print("Enter any string to uppercase: ");
            String inputStr = scanner.nextLine();
            System.out.println("Uppercase result: " + inputStr.toUpperCase());
            System.out.print("Do you want to continue? (Y/N): ");
            userChoicedialog = scanner.nextLine();
        } while (userChoicedialog.equalsIgnoreCase("Y"));
    }
}

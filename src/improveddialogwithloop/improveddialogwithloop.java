package improveddialogwithloop;
import java.util.Scanner;

public class improveddialogwithloop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // part 3 improved dialog with loop
        System.out.println("improved dialog with loop");

        String userChoiceimprov;
        do {
            System.out.print("enter any string to reverse: ");
            String inputStr = scanner.nextLine();
            System.out.print("reversed string: ");
            for (int i = inputStr.length() - 1; i >= 0; i--) {
                System.out.print(inputStr.charAt(i));
            }
            System.out.println();

            System.out.print("Do you want to continue? (Y/N): ");
            userChoiceimprov = scanner.nextLine();
        } while (userChoiceimprov.equalsIgnoreCase("Y"));
    }
}

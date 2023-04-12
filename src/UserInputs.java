import java.util.Scanner;
public class UserInputs {
    Scanner scanner = new Scanner(System.in);
    int userInputSlot;

    public void getUserInputs() {
        userInputSlot = scanner.nextInt();
        scanner.nextLine();
    }
}

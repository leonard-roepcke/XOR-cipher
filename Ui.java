import java.util.Scanner;

public class Ui {
    private Controller controller;

    public Ui(Controller controller) {
        System.out.println("UI initialized");
        this.controller = controller;
    }

    public String getKey() {
        return "01000110"; 
    }

    public String getMessage() {
        return getUserInput("Enter a message to encript");
    }

    public String getUserInput(String message) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(message + ": ");
        String anser = scanner.nextLine();

        return anser;
    }
}

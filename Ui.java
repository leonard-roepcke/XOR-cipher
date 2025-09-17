import java.util.Scanner;
public class Ui{
    private Controller controller;
    private Scanner scanner;
    private String text;
    public Ui(Controller controller) {
        scanner = new Scanner(System.in);

        System.out.println("UI initialized");
        this.controller = controller;
    };

    public String getMessage(){
        text = "";
        while(text.isEmpty()){
            System.out.print("Please enter your message to encript: ");
            text = scanner.nextLine();
        }
        return text;
        
    }
}
public class Ui{
    private Controller controller;
    public Ui(Controller controller) {
        System.out.println("UI initialized");
        this.controller = controller;
    };

    public String getKey() {
        // Placeholder for getting the key from the user
        return "01000110";
    }

    public String getMessage() {
        // Placeholder for getting the message from the user
        return "Hello, World!";
    }

}
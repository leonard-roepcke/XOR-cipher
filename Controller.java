
public class Controller{
    private Ui ui;
    private Logic logic;

    private String key;
    private String message;
    private String binaryMessage;
    private String encriptedMessage;

    public Controller() {
        System.out.println("Controller initialized");
        ui = new Ui(this);
        logic = new Logic();

        key = ui.getKey();
        message = ui.getMessage();
        binaryMessage = logic.convertMessageToBinary(message);
        encriptedMessage = logic.encriptMessage(binaryMessage, key);

        System.out.println("Key: " + key);
        System.out.println("Message: " + message);
        System.out.println("Message in binary: " + logic.convertMessageToBinary(message));
        System.out.println("Encripted message: " + encriptedMessage);
    };
}

public class Controller{
    private Ui ui;
    private Logic logic;

    private String key;
    private String message;
    private String binaryMessage;
    private String encriptedMessage;
    private String encriptedBinaryMessage;
    private String endBinaryMessage;
    private String endMessage;

    public Controller() {
        System.out.println("Controller initialized");
        ui = new Ui(this);
        logic = new Logic();

        key = ui.getKey();
        message = ui.getMessage();
        binaryMessage = logic.convertMessageToBinary(message);
        encriptedBinaryMessage = logic.encriptMessage(binaryMessage, key);
        encriptedMessage = logic.convertBinaryToMessage(encriptedBinaryMessage);
        endBinaryMessage = logic.encriptMessage(encriptedBinaryMessage, key);
        endMessage = logic.convertBinaryToMessage(endBinaryMessage);


        System.out.println("Key: " + key);
        System.out.println("Message: " + message);
        System.out.println("Message in binary__________: " + logic.convertMessageToBinary(message));
        System.out.println("Encripted message in binary: " + encriptedBinaryMessage);
        System.out.println("Encripted message in text__: " + encriptedMessage);
        System.out.println("Decripted message in binary: " + endBinaryMessage);
        System.out.println("Decripted message in text__: " + endMessage);
    };
}
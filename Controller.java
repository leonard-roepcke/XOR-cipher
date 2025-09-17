
public class Controller{
    private Ui ui;
    private Logic logic;

    public Controller() {
        System.out.println("Controller initialized");
        ui = new Ui(this);
        logic = new Logic();

        System.out.println(ui.getMessage());
        
    };
}
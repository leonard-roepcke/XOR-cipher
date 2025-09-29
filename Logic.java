public class Logic{
    public Logic() {
        System.out.println("Logic initialized");
    }

    public String convertMessageToBinary(String message) {
        StringBuilder binary = new StringBuilder();
        for (char c : message.toCharArray()) {
            String binString = String.format("%8s", Integer.toBinaryString(c)).replace(' ', '0');
            binary.append(binString);
        }
        return binary.toString();
    }
}

public class Logic{

    private String encriptedMessage = "";

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

    public String encriptMessage(String binaryMessage, String key){
        encriptedMessage = "";
        for(int i = 0; i < binaryMessage.length(); i++){
            encriptedMessage = encriptedMessage + ((char)binaryMessage.charAt(i) ^ key.charAt(i % key.length()));
        }
        return encriptedMessage;
    }

    public String convertBinaryToMessage(String binaryMessage) {
        StringBuilder message = new StringBuilder();
        for (int i = 0; i < binaryMessage.length(); i += 8) {
            String byteString = binaryMessage.substring(i, Math.min(i + 8, binaryMessage.length()));
            char character = (char) Integer.parseInt(byteString, 2);
            message.append(character);
        }
        return message.toString();
    }
}

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
        
        for(int i = 0; i < binaryMessage.length(); i++){
            encriptedMessage = encriptedMessage + ((char)binaryMessage.charAt(i) ^ key.charAt(i % key.length()));
        }
        return encriptedMessage;
    }

    
}

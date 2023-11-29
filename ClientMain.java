import java.io.IOException;

public class ClientMain {
    public static void main(String[] args) {
        ProxyClient client = new ProxyClient();
        try {
            client.startConnection("127.0.0.1", 60000);
            client.sendMessage("Hello from the client!");
            // Add more interactions as needed
            client.stopConnection();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

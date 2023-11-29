import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        ProxyServer server = new ProxyServer();
        try {
            server.start(60000);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

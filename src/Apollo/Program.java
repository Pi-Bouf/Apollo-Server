package Apollo;

import org.java_websocket.server.WebSocketServer;

import java.net.InetSocketAddress;

public class Program {
    public static void main (String[] args)
    {
        System.out.println("Hey, mon pote ! :D Tout roule ? ;)");
        String host = "127.0.0.1";
        int port = 8887;

        WebSocketServer server = new Server(new InetSocketAddress(host, port));
        server.run();

        System.out.println("Le serveur est lancé !");
    }
}

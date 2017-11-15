package Apollo;

import org.java_websocket.WebSocket;
import org.java_websocket.handshake.ClientHandshake;
import org.java_websocket.server.WebSocketServer;

import java.net.InetSocketAddress;

public class Server extends WebSocketServer {

    public Server(InetSocketAddress address) {
        super(address);

        System.out.println("Serveur lancé !");
    }

    @Override
    public void onClose(WebSocket arg0, int arg1, String arg2, boolean arg3) {
        System.out.println("OnClose");
    }

    @Override
    public void onError(WebSocket arg0, Exception arg1) {
        System.out.println("OnError");
        System.out.println(arg1.toString());
    }

    @Override
    public void onMessage(WebSocket arg0, String arg1) {
        System.out.println("OnMessage");
    }

    @Override
    public void onOpen(WebSocket arg0, ClientHandshake arg1) {
        System.out.println("OnOpen");
    }
}
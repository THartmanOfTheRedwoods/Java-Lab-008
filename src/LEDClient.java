import com.google.gson.Gson;
import com.google.gson.JsonArray;
import org.zeromq.SocketType;
import org.zeromq.ZMQ;
import org.zeromq.ZContext;
import java.util.concurrent.TimeUnit;

public class LEDClient {
    private ZContext zctx;
    private ZMQ.Socket zsocket;
    private Gson gson;
    private String connStr;
    private final String topic = "GPIO";

    private static final int[] OFF = {0, 0, 0};

    public LEDClient(String protocol, String host, int port) {
        zctx = new ZContext();
        zsocket = zctx.createSocket(SocketType.PUB);
        this.connStr = String.format("%s://%s:%d", protocol, "*", port);
        zsocket.bind(connStr);
        this.gson = new Gson();
    }

    public void send(int[] color) throws InterruptedException {
        JsonArray ja = gson.toJsonTree(color).getAsJsonArray();
        String message = topic + " " + ja.toString();
        System.out.println(message);
        zsocket.send(message);
    }

    public void blinkN(int[] color, int times, int miliseconds) throws  InterruptedException{
        int o = 0;
        int p = 0;
        for(int i=0; i<times; i++) {
            if (i%2 == 0 && i>0){
                o++;
            }
            if(i%3 == 0 && i>0){
                p++;
            }
            int[] newColors = {i, o, p};
            send(newColors);
            TimeUnit.MILLISECONDS.sleep(30);
        }
        send(LEDClient.OFF);
        color[0] = 255;
        System.out.println(color[0]);
        for( int i=0; i<20; i++){
            if (color[1] == 255){
                color[2] = 255;
                color[0] = 0;
                color[1] = 0;
                send(color);
            } else if(color[2] == 255){
                color[0] = 255;
                color[1] = 0;
                color[2] = 0;
                send(color);
            } else if(color[0] == 255){
                color[1] = 255;
                color[2] = 0;
                color[0] = 0;
                send(color);
            }
            TimeUnit.MILLISECONDS.sleep(500);
        } send(LEDClient.OFF);
    }

    public void close() throws InterruptedException {
        TimeUnit.SECONDS.sleep(2); // Allow the socket a chance to flush.
        this.zsocket.close();
        this.zctx.close();
    }

    public static void main(String[] args) {
        LEDClient ledClient = new LEDClient("tcp", "192.168.86.250", 5001);
        try {
            int[] color = {0, 0, 255};
            ledClient.blinkN(color, 255, 0);
            ledClient.close();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
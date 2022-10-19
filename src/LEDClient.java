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

    //public void blinkN(int[] color, int times, int miliseconds) throws  InterruptedException{
       // for(int i=0; i<times; i++) {
          //  send(color);
           // TimeUnit.MILLISECONDS.sleep(miliseconds);
           // send(LEDClient.OFF);
            //TimeUnit.MILLISECONDS.sleep(miliseconds);
       // }
        public void fadingLights(int[] color, int times, int miliseconds) throws  InterruptedException {
            int x = 0;
            int redCycle = 0;
            int greenCycle = 0;
            int blueCycle = 0;
            for (int i = 0; i < times; i++) {
                if (color[0] < 255 && redCycle != 2) {
                    for (; color[0] < 255; color[0]++) {

                        send(color);
                        TimeUnit.MILLISECONDS.sleep(miliseconds);
                        System.out.println(color);
                    }
                    for (; color[0] > 0; color[0]--) {
                        send(color);
                        TimeUnit.MILLISECONDS.sleep(miliseconds);
                        System.out.println(color);
                    }
                    redCycle += 1;
                }
                if (color[1] < 255 && greenCycle != 2) {
                    for (; color[1] < 255; color[1]++) {

                        send(color);
                        TimeUnit.MILLISECONDS.sleep(miliseconds);
                        System.out.println(color);
                    }
                    for (; color[1] > 0; color[1]--) {
                        send(color);
                        TimeUnit.MILLISECONDS.sleep(miliseconds);
                        System.out.println(color);
                    }
                    greenCycle += 1;
                }
                if (color[2] < 255 && blueCycle != 2) {
                    for (; color[2] < 255; color[2]++) {

                        send(color);
                        TimeUnit.MILLISECONDS.sleep(miliseconds);
                        System.out.println(color);
                    }
                    for (; color[2] > 0; color[2]--) {
                        send(color);
                        TimeUnit.MILLISECONDS.sleep(miliseconds);
                        System.out.println(color);
                    }
                    blueCycle += 1;
                }
                }
            }


    public void close() throws InterruptedException {
        TimeUnit.SECONDS.sleep(2); // Allow the socket a chance to flush.
        this.zsocket.close();
        this.zctx.close();
    }

    public static void main(String[] args) {
        LEDClient ledClient = new LEDClient("tcp", "192.168.86.250", 5001);
        try {
            int[] color = {0, 0, 0};
            ledClient.fadingLights(color, 1, 15);
            ledClient.close();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
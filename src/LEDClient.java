import com.google.gson.Gson;
import com.google.gson.JsonArray;
import org.zeromq.SocketType;
import org.zeromq.ZMQ;
import org.zeromq.ZContext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
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
        for(int i=0; i<times; i++) {
            send(color);
            TimeUnit.MILLISECONDS.sleep(miliseconds);
            send(LEDClient.OFF);
            TimeUnit.MILLISECONDS.sleep(miliseconds);
        }
    }
    public void blend(int[] color, int miliseconds) throws  InterruptedException{
        send(color);
        TimeUnit.MILLISECONDS.sleep(miliseconds);
    }

    public void close() throws InterruptedException {
        TimeUnit.SECONDS.sleep(2); // Allow the socket a chance to flush.
        this.zsocket.close();
        this.zctx.close();
    }

    public static void main(String[] args) {
        LEDClient ledClient = new LEDClient("tcp", "192.168.86.250", 5001);
        try {
            int[] red = {255,0,0};
            int[] orange = {255,165,0};
            int[] yellow = {255,255,0};
            int[] green = {0,255,0};
            int[] blue = {0,0,255};
            int[] purple = {160,32,240};
            Random rand = new Random();
            List<int[]> rainbow = new ArrayList<int[]>(
                    Arrays.asList(red, orange, yellow, green, blue, purple)
            );
            System.out.println(rainbow);
            // Flashing Halloween colors
            for (int i = 0; i <= 10; i++) {
                ledClient.blinkN(orange, 1, 1000);
                ledClient.blinkN(purple, 1, 1000);
            }
            // Blinks random colors of the rainbow
            for (int i = 0; i <= 30; i++) {
                ledClient.blend(rainbow.get(rand.nextInt(rainbow.size())), 1000);
            }
            ledClient.close();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
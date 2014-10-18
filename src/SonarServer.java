import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by admin on 10/18/2014.
 */
public class SonarServer {
    public static void main(String[] args) {
        try {
            System.out.println("hello, welcome to the server...");
            ServerSocket welcomeHome = new ServerSocket(8899);

            while (true) {
                Socket s = welcomeHome.accept();
                System.out.println("client connected.");
                new SonarHandler(s);
                welcomeHome = new ServerSocket(8899);
            }

        } catch (Throwable e) {
            main(new String[]{});

        }

    }
}

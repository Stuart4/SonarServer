import java.io.*;
import java.net.Socket;

/**
 * Created by admin on 10/18/2014.
 */
public class SonarHandler {
    public SonarHandler(Socket s) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader (s.getInputStream()));
        StringBuilder sb = new StringBuilder();

        FileWriter f = new FileWriter(new File("toDecode.m3a"));

        String line;

        while((line = br.readLine()) != null) {
            f.write(line);
        }


    }
}

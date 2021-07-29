import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.logging.XMLFormatter;

class Main {
    public static void main(String[] args) throws IOException {
        URL url = new URL("http://maven.apache.org");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        BufferedReader stream = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        StringBuffer buffer = new StringBuffer();
        while (stream.readLine() != null) {
            buffer.append(stream.readLine());
        }
        System.out.println("test: " + buffer.toString());
    }

}


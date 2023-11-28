package Task22.shapes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputHelper {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static String getInput(String message) {
        System.out.println(message);
        try {
            return reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            return "0";
        }
    }

    public static void closeBufferedReader() {
        try {
            reader.close();
        } catch (IOException e) {
            System.out.println("unable to close BufferedReader");
            e.printStackTrace();
        }
    }
}

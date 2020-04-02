package demo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Client {

    public static void main(String[] args) throws IOException {
        String type = (new BufferedReader(new InputStreamReader(System.in))).readLine();
        HummerH1Model h1 = new HummerH1Model();
        if("0".equals(type)) {
            h1.setAlarm(false);
        }
        h1.run();

        HummerH2Model h2 = new HummerH2Model();
        h2.run();
    }
}

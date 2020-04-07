package CommandAndChain;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 最高层调用类
 */
public class Client {

    public static void main(String[] args) throws Exception {
        Invoker invoker = new Invoker();
        while (true) {
            System.out.print("#");
            String input = (new BufferedReader(new InputStreamReader(System.in))).readLine();
            if(input.equals("quit") || input.equals("exit")) {
                return;
            }
            System.out.println(invoker.exec(input));
        }
    }
}

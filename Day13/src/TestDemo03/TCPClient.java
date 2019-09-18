package TestDemo03;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class TCPClient {
    public static void main(String[] args) throws Exception {
        Socket client = new Socket("127.0.0.1", 55555);
        Scanner sc = new Scanner(System.in);
        String str;
        while (true) {
            System.out.println("内容：");
            str = sc.next();
            OutputStream out = client.getOutputStream();
            out.write(str.getBytes());
            InputStream in = client.getInputStream();
            byte[] bytes = new byte[48];
            int len = in.read(bytes);
            System.out.println(new String(bytes, 0, len));
        }
    }
}

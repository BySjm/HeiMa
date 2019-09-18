package TestDemo03;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TCPServer {
    public static void main(String[] args) throws Exception {
        ServerSocket server = new ServerSocket(55555);
        Scanner sc = new Scanner(System.in);
        String str;
        Socket socket = server.accept();
        while (true) {
            InputStream in = socket.getInputStream();
            byte[] bytes = new byte[1024];
            int len = in.read(bytes);
            System.out.println(new String(bytes, 0, len));

            OutputStream out = socket.getOutputStream();
            System.out.println("内容：");
            str = sc.nextLine();
            out.write(str.getBytes());
        }
        //in.close();
        //socket.close();
        //server.close();
    }
}

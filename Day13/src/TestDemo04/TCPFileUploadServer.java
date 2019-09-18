package TestDemo04;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPFileUploadServer {
    public static void main(String[] args) throws Exception {
        ServerSocket server = new ServerSocket(55555);
        Socket socket = server.accept();
        InputStream in = socket.getInputStream();
        FileOutputStream out = new FileOutputStream(System.currentTimeMillis() + ".jpg");
        System.out.println("开始接收图片");
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = in.read(bytes)) != -1) {
            out.write(bytes, 0, len);
        }
        System.out.println("图片接收完毕");
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("接收到你的信息了，你可以去死了".getBytes());
        System.out.println("成功给客户端发送信息了");
        outputStream.close();
        in.close();
        socket.close();
        server.close();
    }
}

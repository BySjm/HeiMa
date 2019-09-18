package TestDemo02;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class SocketServerDemo {
    public static void main(String[] args) throws Exception {
        //1.创建服务器对象
        ServerSocket server = new ServerSocket(6666);
        System.out.println("服务器启动成功...");
        //2.接收客户端
        Socket client = server.accept(); //accept方法具有阻塞功能
        System.out.println("接收客户端了:" + client.getInetAddress().getHostAddress());
        //3.获取通道中的输入流
        InputStream in = client.getInputStream();
        //4.调用in的read方法
        byte[] bs = new byte[1024];
        int len = in.read(bs);//网络流中read方法也具有阻塞功能
        System.out.println("客户端发来贺电:" + new String(bs, 0, len));
        //===============================
        //5.获取通道中的输出流
        OutputStream out = client.getOutputStream();
        //6.调用out的write方法
        out.write("您的消息我已经收到了,您可以安息了...".getBytes());
        System.out.println("已经给客户端反馈信息...");
        //===============================

        //5.释放资源
        out.close();
        in.close();
        client.close();
        server.close();
        System.out.println("服务器关闭...");
    }
}

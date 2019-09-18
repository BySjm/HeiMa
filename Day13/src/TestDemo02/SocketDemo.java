package TestDemo02;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class SocketDemo {
    public static void main(String[] args) throws Exception {
        //1.创建客户端
        Socket client = new Socket("127.0.0.1",6666);
        System.out.println("已成功连接到服务器...");
        //2.获取通道中的输出流
        OutputStream out = client.getOutputStream();
        //3.调用out的write方法
        out.write("你好服务器,我是你大爷!!!".getBytes());
        System.out.println("数据发送成功....");
        //=======================
        //4.获取通道中输入流
        InputStream in = client.getInputStream();
        //5.调用in的read方法
        byte[] bs = new byte[1024];
        int len = in.read(bs);
        System.out.println("服务器反馈说:" + new String(bs, 0, len));
        //=======================
//        //4.释放资源
        in.close();
        out.close();
        client.close();
        System.out.println("客户端关闭了...");
    }
}

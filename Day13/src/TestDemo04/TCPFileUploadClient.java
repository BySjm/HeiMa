package TestDemo04;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class TCPFileUploadClient {
    public static void main(String[] args) throws Exception{
        Socket client = new Socket("127.0.0.1",55555);
        OutputStream out = client.getOutputStream();
        FileInputStream inputStream = new FileInputStream("C:\\Users\\SanJiaoMao\\Pictures\\Saved Pictures\\head.jpg");
        byte[] bytes = new byte[1024];
        int len = 0;
        System.out.println("正在发送数据");
        while ((len = inputStream.read(bytes)) != -1){
            out.write(bytes, 0 ,len);
        }
        client.shutdownOutput();
        System.out.println("给客服端发送数据完毕");
        InputStream in = client.getInputStream();
        int read = in.read(bytes);
        System.out.println("反馈的数据是:" + new String(bytes, 0, read));
        in.close();
        inputStream.close();
        out.close();
        client.close();
    }
}

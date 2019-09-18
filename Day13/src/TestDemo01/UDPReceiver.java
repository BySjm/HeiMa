package TestDemo01;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPReceiver {
    public static void main(String[] args) throws Exception{
        DatagramSocket ds = new DatagramSocket(55555);
        DatagramPacket dp = new DatagramPacket(new byte[1024], 1024);
        ds.receive(dp);
        System.out.println("数据接收成功");
        int len = dp.getLength();
        byte[] data = dp.getData();
        System.out.println(new String(data, 0 ,len));
        ds.close();
    }
}

package TestDemo01;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UdpSender {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket();
        byte[] bytes = "卡莎都出来了？你玩的可是S10？".getBytes();
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length, InetAddress.getByName("127.0.0.1"), 55555);
        ds.send(dp);
        System.out.println("数据发送成功");
        ds.close();
    }
}

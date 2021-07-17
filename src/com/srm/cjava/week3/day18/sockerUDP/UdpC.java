package week3.day18.sockerUDP;

import java.net.*;

class UdpC {
    public static void main(String a[]) {
        try {
            InetAddress ia = InetAddress.getByName(a[0]);
            int port = Integer.parseInt(a[1]);
            DatagramSocket ds = new DatagramSocket();
            byte buffer[] = a[2].getBytes();
            DatagramPacket dp = new DatagramPacket(buffer, buffer.length, ia, port);
            ds.send(dp);

            ds.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

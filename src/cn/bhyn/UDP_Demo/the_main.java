package cn.bhyn.UDP_Demo;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class the_main {

    public static void main(String[] args) throws UnknownHostException {
        UDP_Send us = new UDP_Send(InetAddress.getByName("localhost"),8889);
        us.setMsg("Hello");

        UDP_Receive ur = new UDP_Receive(InetAddress.getByName("localhost"),8889);

        Thread ts = new Thread(us);
        Thread tr = new Thread(ur);

        ts.start();
        tr.start();
    }
}

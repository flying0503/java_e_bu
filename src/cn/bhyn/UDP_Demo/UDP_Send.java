package cn.bhyn.UDP_Demo;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

import static java.lang.Thread.sleep;

public class UDP_Send implements Runnable {
    private int port = 0;
    private InetAddress iaddress = null;
    private DatagramSocket socket = null;
    private String msg = null;

    UDP_Send(InetAddress iaddress,int port){
        try {
            this.iaddress = iaddress;
            this.port = port;
            this.socket = new DatagramSocket(this.port);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public InetAddress getIaddress() {
        return iaddress;
    }

    public void setIaddress(InetAddress iaddress) {
        this.iaddress = iaddress;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public void run() {
        while (true){
            DatagramPacket packet = null;
            byte data[] = msg.getBytes();
            packet = new DatagramPacket(data,data.length,iaddress,port);
            System.out.println(new String(data));
            try {
                socket.send(packet);
                sleep(1000);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}

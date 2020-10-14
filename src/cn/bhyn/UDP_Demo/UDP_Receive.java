package cn.bhyn.UDP_Demo;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDP_Receive implements Runnable{
    private int port = 0;
    private InetAddress iaddress = null;
    private DatagramSocket socket = null;
    private String msg = null;

    UDP_Receive(InetAddress iaddress,int port){
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
        while(true){
            try{
                byte data[] = new byte[512];
                DatagramPacket packet =new DatagramPacket(data,data.length);
                socket.receive(packet);
                msg = new String(packet.getData(),0,packet.getLength(),"GB2312");
                System.out.println(packet.getAddress()+" : "+packet.getPort()+">"+msg);
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }
}

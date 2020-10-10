package cn.bhyn.The_Thread;

public class My_Thread extends Thread {
    @Override
    public void run() {
        for (int i = 0;i<20;i++)
            System.out.println("my_thread:"+i);
    }
}

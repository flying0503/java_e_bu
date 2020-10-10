package cn.bhyn.The_Thread;

/*
* 创建多线程程序的第一种方式，创建Thread类子类
* java.Lang.Thread类，是描述线程的类，我们想要实现多线程，就必须继承Thread类
* 实现步骤：
*   1.创建一个Thread类的子类
*   2.在Tread类的子类中重写Thread的run方法，设置线程任务
*   3.创建Thread类的子类对象
*   4.调用Thread类中的方法start方法，开启新的线程，执行run方法
*       void start()使该线程开始执行；Java虚拟机调用线程的run方法。
*       结果是两个线程并发的执行，多次启动一个线程是非法的。特别是当线程已经结束执行后，不能再重新启动。
*  Java程序属于抢占式调度，优先级高的优先执行
* */

public class The_Thread {
    public static void main(String[] args) {
        My_Thread mt = new My_Thread();
        mt.start();

        for (int i = 0; i < 20; i++) {
            System.out.println("main:"+i);
        }
    }
}

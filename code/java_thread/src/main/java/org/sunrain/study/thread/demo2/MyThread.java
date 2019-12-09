package org.sunrain.study.thread.demo2;

// RunnableTest.java 源码
public class MyThread implements Runnable {

    private int ticket = 10;

    public void run() {
        for (int i = 0; i < 20; i++) {
            if (this.ticket > 0) {
                System.out.println(Thread.currentThread().getName() + " 卖票：ticket" + this.ticket--);
            }
        }
    }
}
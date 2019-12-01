package com.banyuan.homework;

public class NotifyThread extends Thread {

    Tools tool;

    public NotifyThread(Tools tool) {
        this.tool = tool;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (tool) {
                tool.notify();
            }
        }
    }
}

package com.banyuan.homework;

import java.util.concurrent.CountDownLatch;

public class DelThread extends Thread {

    Tools tool;

    public DelThread(Tools tool) {
        this.tool = tool;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (tool) {
                if (!tool.flag) {
                    if (tool.cd.getCount() > 0) {
                        tool.del();
                        tool.cd.countDown();
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }else {
                        try {
                            tool.flag=!tool.flag;
                            tool.cd.await();  //
                            tool.cd = new CountDownLatch(2);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }
}

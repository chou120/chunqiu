package com.banyuan.homework;

import java.util.concurrent.CountDownLatch;

public class AddThread  implements   Runnable {

    Tools  tool;

    public AddThread(Tools  tool) {
        this.tool=tool;
    }

    @Override
    public void run() {
        while(true){
            //System.out.println("线程数量为:"+tool.cd.getCount());
            synchronized (tool) {
               if(tool.flag){
                    if (tool.cd.getCount() > 0) {
                        tool.add();
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

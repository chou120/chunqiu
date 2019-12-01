package com.banyuan.xianchengchi;

public class Demo1  implements  Runnable {

    @Override
    public void run() {
        long   start=System.currentTimeMillis();
        for (int i = 0; i <100000; i++) {
            System.out.println(Thread.currentThread().getName()+"-----"+i);
        }

        long   end=System.currentTimeMillis();
        System.out.println(end-start);
    }
}

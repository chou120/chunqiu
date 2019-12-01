package com.banyuan.group;

public class MyThread  implements    Runnable {



    @Override
    public void run() {
        for (int i = 0; i <50; i++) {

            System.out.println(Thread.currentThread().getName()+"-----"+i);

            try {
                Thread.sleep(1100);
            } catch (InterruptedException e) {
                System.err.println("执行中断异常");
            }


        }
    }
}

package com.banyuan.threadDemo6;

public class Test {
    public static void main(String[] args) {
        MyThread  mt1=new MyThread();
        mt1.setFlag(true);

        MyThread  mt2=new MyThread();
        mt2.setFlag(false);

        mt1.start();

        mt2.start();
        /**
         * 生产者和消费者的问题
         *
         * A               B
         * 苹果    ---->   换栗子
         *
         * A: 你先给我栗子
         * B: 你先给我苹果
         *
         *
         */




    }


}

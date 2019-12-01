package com.banyuan.group;

public class ThreadGroupDemo {


    public static void main(String[] args) {

        ThreadGroup  tg=new ThreadGroup("java线程");

        MyThread  mt1=new MyThread();

        Thread  t1=new  Thread(tg,mt1,"A");
        Thread  t2=new  Thread(tg,mt1,"B");
        Thread  t3=new  Thread(tg,mt1,"C");
        Thread  t4=new  Thread(tg,mt1,"D");

        tg.setDaemon(true);
            System.out.println(tg.isDaemon());   //

        t1.start();
        t2.start();
        t3.start();
        t4.start();


        tg.interrupt();








//        System.out.println(t1.getThreadGroup().getName());
//        System.out.println(t2.getThreadGroup().getName());
//        System.out.println(t3.getThreadGroup().getName());
//        System.out.println(t4.getThreadGroup().getName());

    }

}

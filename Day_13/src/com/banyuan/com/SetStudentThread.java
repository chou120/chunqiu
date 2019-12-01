package com.banyuan.com;

import sun.lwawt.macosx.CSystemTray;

public class SetStudentThread  implements   Runnable{

    Student   s;
    public  SetStudentThread(Student s){
        this.s=s;
    }


    @Override
    public void run() {
       //     Student   s=new  Student();
        boolean   flag=true;
        while(true) {
            synchronized (s) {
                if(s.flag) {  //当 括号里面的 唤醒的机制 成功
                    try {
                        System.out.println("set在等待...");
                        // Thread.sleep(1000);
                        s.wait();  //等待中的时候     当前线程户不会继续抢占资源？   sleep()睡眠结束 会不会抢
                        //  s.notify();   表示唤醒当前线程
                    } catch (InterruptedException e) {

                        e.printStackTrace();
                    }
                }

                    if (flag) {
                        s.name = "李浩";
                        s.age = 100;
                        flag = !flag;
                    } else {
                        s.name = "张三";
                        s.age = 12;
                        flag = !flag;
                    }
                    //
                System.out.println(s.name+"---"+s.age);
                    s.flag=true;
                    s.notify();//唤醒的是是执行者的线程

                }


        }
    }
}

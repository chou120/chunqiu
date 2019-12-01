package com.banyuan.home;

public class MyThread {

    /**
     * 线程的消费者和生产者问题
     * 生产者提供产品  和 消费者消费产品
     */
    public static void main(String[] args) {
            Student s=new Student();
            SetStudentThread st=new SetStudentThread(s);
            GetStudentThread gt=new GetStudentThread(s);
            UseStudentThread ut=new UseStudentThread(s);

            Thread  t=new Thread(st);
            Thread  t1=new Thread(gt);
            Thread  t2=new Thread(ut);

            //  notify()  只会唤醒其中一个线程

            t.start();
            t1.start();
            t2.start();




    }


}

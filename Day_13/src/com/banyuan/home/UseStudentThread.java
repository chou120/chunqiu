package com.banyuan.home;

public class UseStudentThread implements  Runnable {


    Student s;
    public UseStudentThread(Student s){
        this.s=s;
    }

    @Override
    public void run() {
       
        while (true){
            synchronized (s) {
                if(s.str.equals("3")){
                    try {
                        System.out.println("Use在等待...");
                        s.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName()+"Use被唤醒"+s.name + "---" + s.age);
                s.str="3";
                //先唤醒在等待
                s.notify();//唤醒是 生产者的线程

            }



        }

    }
}

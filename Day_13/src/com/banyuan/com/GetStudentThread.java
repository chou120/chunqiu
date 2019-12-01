package com.banyuan.com;

public class GetStudentThread implements  Runnable {


    Student   s;
    public  GetStudentThread(Student s){
        this.s=s;
    }

    @Override
    public void run() {
        //Student   s=new  Student();
        while (true){
            synchronized (s) {
                if(!s.flag){
                    try {
                        System.out.println("get在等待...");
                        s.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(s.name + "---" + s.age);
                s.flag=false;
                //先唤醒在等待
                s.notify();//唤醒是 生产者的线程

            }



        }

    }
}

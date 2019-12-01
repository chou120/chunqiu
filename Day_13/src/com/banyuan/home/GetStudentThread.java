package com.banyuan.home;

public class GetStudentThread implements  Runnable {


    Student s;
    public  GetStudentThread(Student s){
        this.s=s;
    }

    @Override
    public void run() {

        while (true){
            synchronized (s) {
                if(s.str.equals("2")){
                    try {
                        System.out.println("get在等待...");
                        s.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName()+"get被唤醒"+s.name + "---" + s.age);
                s.str="2";
                //先唤醒在等待
                s.notify();//唤醒是 生产者的线程

            }



        }

    }
}

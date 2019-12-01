package com.banyuan.anli;

public class Test {


    public static void main(String[] args) {

//        new  Thread()
//        {
//
//            @Override
//            public void run() {
//                for (int i = 0; i < 20; i++) {
//                    System.out.println("----"+Thread.currentThread().getName()+"------"+i);
//                }
//            }
//        } .start();


//        new  Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 20; i++) {
//                    System.out.println("----"+Thread.currentThread().getName()+"------"+i);
//                }
//            }
//            }
//        ).start();


        new  Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("----"+Thread.currentThread().getName()+"---Runnale---");
            }
        }){
            @Override
            public void run() {
                System.out.println("----"+Thread.currentThread().getName()+"---Thread---");
            }
        }.start();





    }

}

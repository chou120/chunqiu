package com.banyuan.fx01.patten04;

public class Test2 {

    public static void main(String[] args) {
//       Single2  s1= Single2.getSingle();
//        Single2  s2=Single2.getSingle();
//
//        System.out.println(s1.hashCode());
//        System.out.println(s2.hashCode());


        SingleThread  st1=new SingleThread();
        SingleThread  st2=new SingleThread();
        SingleThread  st3=new SingleThread();
        SingleThread  st4=new SingleThread();
        SingleThread  st5=new SingleThread();

        st1.start();
        st2.start();
        st3.start();
        st4.start();
        st5.start();











    }

}

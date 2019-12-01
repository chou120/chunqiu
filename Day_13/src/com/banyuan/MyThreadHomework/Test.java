package com.banyuan.MyThreadHomework;

public class Test {

    public static void main(String[] args) {
        Homework  h=new Homework();
        ThreadA   a=new ThreadA(h);
        ThreadB   b=new ThreadB(h);
        ThreadC   c=new ThreadC(h);
        ThreadD   d=new ThreadD(h);

        a.start();
        b.start();
        c.start();
        d.start();

    }

}

package com.banyuan.homework;

public class Test {

    public static void main(String[] args) {

        Tools  tool=new  Tools();

        AddThread  add=new AddThread(tool);

        Thread  a=new Thread(add,"线程A");
        Thread  b=new Thread(add,"线程B");


        DelThread  de=new DelThread(tool);
        de.setName("线程C");
        DelThread  de2=new DelThread(tool);
        de2.setName("线程D");

        a.start();
        b.start();
        de.start();
        de2.start();



    }


}

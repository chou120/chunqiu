package com.banyuan.fx01.patten04;

public class Single {


    /**
     *  单例模式：程序在开启之后  直到关闭之前  一直是唯一的一个对象（该对象的对应的类里面的构造器只能是私有化）
     *  饿汉模式
     *  懒汉模式：用的时候再创建  或者是没有的时候再创建
     *
     *
     */
    private  static   Single  single=new Single();

    private  Single(){}

    public  static  Single  getSingle(){
        return  single;
    }


}

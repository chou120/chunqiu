package com.banyuan.cglib;

import net.sf.cglib.proxy.Enhancer;

public class Test {

    public static void main(String[] args) {
        Enhancer   enhancer=new Enhancer(); //既能代理接口也能代理class
        Worker  w=new Worker();
        Worker  obj=(Worker)enhancer.create(w.getClass(),new  CglibDynProxyImpl());

        obj.sumbit("张宇跑了...");
        obj.defend();

    }


}

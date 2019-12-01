package com.banyuan.fx01.fx02;

public class Demo {

    public static void main(String[] args) {

        InfoImpl<String>  info=new InfoImpl<>();
        info.setT("年后");
        info.getT();
        System.out.println("---"+info.getShow());

        /*
            常见的泛型接口    set    map
        */



    }

}

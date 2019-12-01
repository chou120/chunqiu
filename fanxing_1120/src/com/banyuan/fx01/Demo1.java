package com.banyuan.fx01;

import java.util.ArrayList;
import java.util.List;

public class Demo1 {

    public static void main(String[] args) {

        List list=new ArrayList<>();
        list.add("nihao");
        list.add(123);

        System.out.println((Integer) list.get(0)+123124);  //Exception in thread "main" java.lang.ClassCastException: java.lang.String cannot be cast to java.lang.Integer

        //
        List<String>  li=new ArrayList<>();
        li.add("1231");
       // li.add(1231);  //把错误的情况提升到 编译期间  这样的

      //加入说 现在有一个  坐标类型









    }


}

package com.banyuan.fx01.fx04;

import java.util.ArrayList;
import java.util.List;

public class Demo1 {

    public static void main(String[] args) {

        List<Integer> list1=new ArrayList<>();

        List<String> list2=new ArrayList<>();

        System.out.println(list1.getClass()==list2.getClass()); //true   这就叫泛型擦除  跟泛型信息没一点关系

        //如果我们想要修改类型擦除之后的类型   可以按以下方式写:


    }

}

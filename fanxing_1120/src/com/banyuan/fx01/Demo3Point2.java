package com.banyuan.fx01;

import java.util.HashMap;
import java.util.Map;

public class Demo3Point2 {


    public static void main(String[] args) {

        //我们在创建对象  使用里面属性的时候 可以提前把要使用类型就已经给声明好了
        Point2<Integer,Integer>  point=new Point2<Integer, Integer>();

        point.setX(123);
        point.setY(1233);


        Point2<Integer,String>  point2=new Point2<Integer, String>();

        point2.setX(2132);
        point2.setY("东经");

        int   i=point2.getX()+1;
        String   y=point2.getY()+1;

        System.out.println(i+"----"+y);

        Map   map=new HashMap();



    }

}

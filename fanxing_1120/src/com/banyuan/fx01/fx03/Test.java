package com.banyuan.fx01.fx03;

public class Test {

    public static void main(String[] args) {
        Point<Integer,String>  p1=new Point<>();
        p1.setK(1231);
        p1.setV("我");


        Point<Integer,String>  p2=new Point<>();
        p2.setK(1231);
        p2.setV("我");

        System.out.println(Point.compare(p1, p2));



    }

}

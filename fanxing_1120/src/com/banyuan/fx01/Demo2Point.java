package com.banyuan.fx01;

public class Demo2Point {

    public static void main(String[] args) {

        Point  p=new Point();
//        p.setX("东经120度");
//        p.setY("北纬23度");

//        p.setX(120);
//        p.setY(23);

        p.setX("东经120");
        p.setY(23);


        Integer   i=(Integer) p.getY()+1;

        Integer x=(Integer) p.getX()+12;  //把异常从 运行提升到 编译的时候





        System.out.println("东经:"+p.getX()+"北纬:"+i);



    }

}

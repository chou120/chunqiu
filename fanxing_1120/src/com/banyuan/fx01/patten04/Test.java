package com.banyuan.fx01.patten04;

public class Test {

    public static void main(String[] args) {
       Single  s1= Single.getSingle();
        Single  s2=Single.getSingle();

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());


    }

}

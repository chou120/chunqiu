package com.banyuan.cn;

public class Test {

    public static void main(String[] args) {

            Mythread  mt=new Mythread();

            PersonA a=new PersonA(mt);
            PersonB b=new PersonB(mt);
            a.start();
            b.start();

    }

}

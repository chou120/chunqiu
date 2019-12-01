package com.banyuan.threadHomework;

public class Homework {

    public static void main(String[] args) {
    Bank  bank=new Bank();
    PersonA  a=new PersonA(bank);
    PersonB  b=new PersonB(bank);
    a.start();
    b.start();


    }


}

package com.banyuan.threadHomework;

public class Bank {

    static  int  money=1000;
    public  synchronized void  getMmoneyA(int money){
        Bank.money-=money;
        System.out.println("A取走了"+money+"元");
    }
    public  synchronized void  getMoneyB(int money){
        Bank.money-=money;
        System.out.println("B取走了"+money+"元");
    }

}

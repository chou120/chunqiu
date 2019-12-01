package com.banyuan.cn;

public class Mythread {

    /**
     *  一个账户 1000块钱 :两个人 A B  分别在柜台和ATM机 取钱
     *  A每次取钱100  B每次取200   最终在控制台输出每个人取钱数
     */
     int   money=1000;


     public        void  getMoneyA(int  money) {
        if(money>=100){
            this.money -= money;
            System.out.println(Thread.currentThread().getName() + "----A取了100");
        }


     }


    public      void  getMoneyB(int  money) {

        if (this.money >=money) {
            this.money -= money;
            System.out.println(Thread.currentThread().getName() + "----B取了200");
        }

    }



    }

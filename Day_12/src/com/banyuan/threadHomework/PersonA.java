package com.banyuan.threadHomework;

public class PersonA  extends Thread {

    Bank  bank;

   public  PersonA(Bank  bank){
        this.bank=bank;
    }

    @Override
    public void run() {

       while(Bank.money>=100){
           bank.getMmoneyA(100);
//           try {
//               Thread.sleep(1000);  //A取了休息
//           } catch (InterruptedException e) {
//               e.printStackTrace();
//           }
       }

    }
}

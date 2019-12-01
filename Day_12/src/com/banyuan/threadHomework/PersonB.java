package com.banyuan.threadHomework;

public class PersonB extends Thread {

    Bank  bank;

   public PersonB(Bank  bank){
        this.bank=bank;
    }

    @Override
    public void run() {

       while(Bank.money>=200){
           bank.getMoneyB(200);
//           try {
//               Thread.sleep(1000);  //B取了休息
//           } catch (InterruptedException e) {
//               e.printStackTrace();
//           }
       }

    }
}

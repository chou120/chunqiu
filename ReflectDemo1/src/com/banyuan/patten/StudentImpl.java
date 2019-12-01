package com.banyuan.patten;

public class StudentImpl implements   Student {

    private   int money;

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }


    @Override
    public void buyCar() {
        System.out.println("张宇要去买车....");
    }


}

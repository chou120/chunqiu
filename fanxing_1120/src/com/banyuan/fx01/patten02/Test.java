package com.banyuan.fx01.patten02;

public class Test {


    public static void main(String[] args) {

        CreateAnimla   ca=new DogFactory();
        Dog  dog=(Dog)ca.createAnimal();




    }

}

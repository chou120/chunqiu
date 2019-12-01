package com.banyuan.fx01.patten02;

public class CatFactory implements  CreateAnimla {

    @Override
    public Animal createAnimal() {
        return new Cat();
    }
}

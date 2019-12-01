package com.banyuan.fx01.patten02;

public class DogFactory implements  CreateAnimla {

    @Override
    public Animal createAnimal() {
        return new Dog();
    }
}

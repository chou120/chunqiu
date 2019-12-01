package com.banyuan.fx01.fx02;

public class InfoImpl<T> implements Info<T> {

    private  T   t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }


    @Override
    public T getShow() {

        return this.t;
    }
}

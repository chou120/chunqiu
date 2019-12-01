package com.banyuan.fx01;

public class Point2<T1,T2> {

    /**
     * 泛型可以应用在类上
     */

    T1   x;
    T2   y;

    public T1 getX() {
        return x;
    }

    public void setX(T1 x) {
        this.x = x;
    }

    public T2 getY() {
        return y;
    }

    public void setY(T2 y) {
        this.y = y;
    }
}

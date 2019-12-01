package com.banyuan.fx01.fx03;

public class Point<K,V> {

    private   K  k;
    private   V  v;

    public K getK() {
        return k;
    }

    public void setK(K k) {
        this.k = k;
    }

    public V getV() {
        return v;
    }

    public void setV(V v) {
        this.v = v;
    }

    // 泛型的标志  在访问修饰符和返回值之间 作用: J就是告诉你 这个泛型方法
    public  static  <K,V>    boolean    compare(Point<K,V>  p1,Point<K,V>  p2){

        return p1.getK().equals(p2.getK())&&p1.getV().equals(p2.getV());


    }






}

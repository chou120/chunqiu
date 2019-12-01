package com.banyuan.threadSetAndGet;

public class Test {


    /**
     * 一次输出大量的相同的数据  不美观   为了交替输出    对代码进行修改
     * @param args
     */

    public static void main(String[] args) {
        Cake  cake=new  Cake();
        SetCakeThread  st=new SetCakeThread(cake);
        GetCakeThread  gt=new GetCakeThread(cake);

        gt.start();
        st.start();


    }

}

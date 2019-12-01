package com.banyuan.xianchengchi;

import java.util.concurrent.*;

public class CallableDemo {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService es= Executors.newFixedThreadPool(2);

        Future<Integer> in1=es.submit(new MyCallable());
        Future<Integer> in2=  es.submit(new MyCallable());

        Integer  i=in1.get();
        Integer  i2=in2.get();

        System.out.println(i+"----"+i2);

            es.shutdown();





    }


}

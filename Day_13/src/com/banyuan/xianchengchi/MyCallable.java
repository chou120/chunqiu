package com.banyuan.xianchengchi;

import java.util.concurrent.Callable;

public class MyCallable  implements Callable<Integer> {

    /**
     * Callable  好处 : call()方法有返回值    可以抛出异常
     *           弊端:  实现Callable 代码比较复杂
     * @return
     * @throws Exception
     */


    @Override
    public Integer call() throws Exception {

        int  sum=0;

        for (int i = 0; i < 1000; i++) {
            sum+=i;
        }

        return   sum;

    }
}

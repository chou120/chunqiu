package com.banyuan.fx01.patten04;

public class Single2 {


    private static  volatile  Single2 single;

    /**
     * volatile  对他的认识:
     *   对于变量的写操作 不依赖于当前值,被它修饰的变量没有包含在具有其他变量  表达式
     *   其实被volatitl 修饰的变量独立于任何程序的状态  包括变量的当前状态
     *
     *   尤其是在多线程的时候  去及时的感知共享变量的改变    并且使其他线程可以立即得到该变量的最新值
     *
     *          synchronized
     *
     */

    private String str;

    private Single2() {
        str = "你好";
    }

    public String getStr() {
        return str;
    }

    public  static Single2 getSingle() {
        // 线程安全解决   指令重新排序

        //  volatile  保持数据的原子性
        /**
         * 1.首选single ==null 分配空间
         * 2.创建实例对象
         * 3.将single应用指向这个对象
         *   A  1.             B.1
         *
         *      2.               2
         *
         *      3.                3.
         *
         */

        if (single == null) {
            synchronized (Single2.class) { //1
                if (single == null) {  //2
                    System.out.println(Thread.currentThread().getName() + "我还是2的...");
                    single = new Single2(); //3
//
//                    A  ---> 1--->2 --->3(可能会发生创建非null对象 但是不是本身)
//                    B  ----->1 --->2--->3   正常创建   但是在  A--->B占用了   jvm 内部的事情
//

                }
            }
        }


        return single;
    }

    /**
     * 以上的这种写法 叫传统的懒汉式单例     经过测试 发现 有不同的hash值 代表有不同的对象
     */


}

package cn;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

    private   String  name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public  static   void    get(){

    }

    public static void main(String[] args) {

        /**
         *  LinkedHashSet：由 链表和哈希表组成
         *  hash表保证元素的唯一性
         *  链表保证元素有序性
         */

        LinkedHashSet  set=new LinkedHashSet();
        set.add("消耗胡子");
        set.add("你要来一发嘛");
        set.add("明天大保健啊!!!");
        set.add(234);
        set.add(true);
        set.add(new Student());

        Iterator   it=set.iterator();


        System.out.println(set);


    }

}

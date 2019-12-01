package banyuan.cn;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class CollectionDemo4 {

    public static void main(String[] args) {
       ArrayList  list=new ArrayList();

        list.add("hahah");
        list.add("hehehi");
        list.add("121412");
        list.add(12312);
        list.add("aqqe123");
        list.add(new Person("zhansan",34));
        Object  s=list.set(2,"大保健");

        System.out.println(s+"---"+list.get(2));

        System.out.println(list.indexOf(3));
        System.out.println(list.lastIndexOf(3)); // 没有找到目标值的时候返回-1

        ListIterator listIt= list.listIterator();

        if(listIt.hasPrevious()){
            System.out.println("---"+listIt.previous());
        }

        if(listIt.hasNext()){
            System.out.println(listIt.next());
        }

        if(listIt.hasNext()){
            System.out.println(listIt.next());
        }

        if(listIt.hasPrevious()){
            System.out.println("---"+listIt.previous());
        }









    }


}

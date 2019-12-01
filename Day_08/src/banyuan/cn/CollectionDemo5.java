package banyuan.cn;

import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class CollectionDemo5 {

    public static void main(String[] args) {

        LinkedList   list=new LinkedList();
        list.add("时候");
        list.add("哈是的撒");
       // list.addFirst("hashsa s");
        list.addLast("我是你");

       // list.offerFirst("撒哈哈是");

       // System.out.println(list.poll()+"---"+list);

        list.push("李四");
        list.push("李w");

        System.out.println(list.pop());


        Vector   f=new Vector();
        Object [] obj=new Object[15];
           f.addElement("那好");
            f.addElement("那好2");
            //f.copyInto(obj);

        f.insertElementAt("你好色",1);

      //  System.out.println(f.elementAt(1));  //charAt()
        f.setElementAt("王八", 1);


        Stack   s=new Stack();
        s.push("鸭子1");
        s.push("鸭子2");
        s.push("鸭子3");
        s.push("鸭子4");
        s.push("鸭子5");
        s.push("鸭子6");

        System.out.println("----"+s.get(0));



        System.out.println(s.search("鸭子3"));





    }


}

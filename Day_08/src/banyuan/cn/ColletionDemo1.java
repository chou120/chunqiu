package banyuan.cn;


import java.util.ArrayList;
import java.util.Collection;

public class ColletionDemo1 {

    /*
        Collection  跟接口   子接口  1.可以存放一些 重复数据 2.不可以存放重复数据


     */

    public static void main(String[] args) {

        Collection con =new ArrayList();//  ArrayList   LinkedList   Vector    Stack;
        //int  [] arr={12,34,56};//数组能不能放
        Integer [] in=new Integer[2];
        in[0]=19;
        in[1]=20;


        con.add(7);   //这里面到底是什么类型
        con.add("hah");
        con.add(23.45F);

        con.add(true);//
        con.add("哈哈哈");
        con.add(true);//?  这个true 在集合中的位置哟没有变化


        con.add(new Person("战三",3));

        con.add(in);
        Collection con2 =new ArrayList();
        con2.add(new  Person("斩杀大",12));

        con.addAll(con2);

        System.out.println(con.contains(new Person("战三",3)));

        System.out.println(con.remove(true));
        con.clear();

        System.out.println(con.isEmpty());


        System.out.println(con);

        //能不能把集合转换成数组
//        Object [] obj=con.toArray();
//        for (int i = 0; i < obj.length; i++) {
//            System.out.println(obj[i]);
//        }


        con=new ArrayList();
        con2=new ArrayList();
        con.add("7");
        con.add(8);
        con.add("哈哈");
        con.add("ppd");
        con.add(true);

        con2.add("5");
        con2.add(83);
        con2.add("444哈");

        con2.retainAll(con);

        System.out.println("con="+con);
        System.out.println("con2="+con2);


        Person  p=new Person("李四",23);


        con.add(p);
        con.add(p);

        System.out.println(con);




















    }

}

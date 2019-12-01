package cn;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo1 {

    public static void main(String[] args) {

        Set set= new HashSet();   //1.元素的存储是无序的 2.元素是唯一的
//        set.add("陈浩");
//        set.add("年后");
//        set.add("哈哈哈");
//        set.add("java");
//        set.add("C");
//        set.add("js");
//        set.add(334);
//        set.add(true);
//
//        set.add("true2");
//        set.add(23.4);set.add('a');
//
//        set.add("陈浩");
//        set.add(334);
        set.add(new Student("张三",23));
        set.add(new Student("李四",24));
        set.add(new Student("王五",23));
        set.add(new Student("赵6",23));
        set.add(new Student("田七",23));
        set.add(new Student("张三",23));

//        ArrayList  list=new ArrayList();
//        list.add(new Student("张三",23));
//        list.add(new Student("张三",23));

        // System.out.println(list);
        //System.out.println(set);

//       Object[] obj= set.toArray();
//        for (Object  ob:obj) {
//            Student  st=(Student)ob;
//            System.out.println(st.toString());
//        }


        //迭代器
//         Iterator it= set.iterator();
//
//         while (it.hasNext()){
//             Student  s=(Student)it.next();
//             System.out.println(s.toString());
//         }


















    }

}

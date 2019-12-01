package cn;

import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {

        TreeSet<Student>  set=new TreeSet();
        /*
            里面的元素是按照自然顺序对元素进行排序
            里面的数据也是唯一的

         */
//        set.add("你还");
//        set.add(true);
//        set.add(23.4);
//        set.add(new Student("陈浩",29));

//        set.add(123);
//        set.add(23);
//        set.add(43);
//        set.add(12);
//        set.add(1);
//        set.add(234);

//        set.add("v");
//        set.add("t");
//        set.add("g");
//        set.add("a");

//         set.add("周2");
//         set.add("周6");
//        set.add("王1");
//        set.add("周5");
//        set.add("周3");


        set.add(new Student("陈浩中",23));
        set.add(new Student("陈浩南",24));
        set.add(new Student("陈浩北",22));
        set.add(new Student("陈浩东",21));
        set.add(new Student("陈浩西",27));
        set.add(new Student("陈浩西",21));
        set.add(new Student("陈浩西",19));
        set.add(new Student("陈浩",27));

        for (Student s:set) {
            System.out.println(s.toString());
        }



    }


}

package mapDemo1;

import cn.Student;

import java.util.*;

public class MapDemo1 {

    public static void main(String[] args) {
        /**
         * Map  是以键值对的方式进行数据存储   key   一个地址  ---->   value    hash表
         */
        Map  map=new HashMap();
        Integer[]  in=new Integer[2];
        map.put(1, 12);
        map.put("小强","蟑螂");
        map.put(true, true);
        map.put(8.9, 45.6);
        map.put(in,"小伙子,开房不?");
        map.put(new Student(), new Student("张三",23));
        map.put("", "");
        map.put(null, null);  //jdk 低版本的时候 不支持  null    nullPointerE...
        map.put(null, "");  //map 集合 键唯一  值可变

        map.put("哈哈", "蟑螂");
       // map.clear();
        System.out.println("----"+map.containsKey(8.9));
        System.out.println(map.remove("哈哈"));
        System.out.println(map.remove(null, ""));
        System.out.println(map.replace("小强", "蟑螂","屎壳郎" ));



        Set set=map.keySet();  //获取所有的map键
//        Iterator   it=set.iterator();
//        while (it.hasNext()){
//            System.out.println(it.next());
//        }

        for ( Object   ob:set) {
            System.out.println("键是:"+ob+",值是:"+map.get(ob));
        }







       // System.out.println(map);



    }

}

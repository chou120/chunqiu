package mapDemo1;

import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo5 {


    public static void main(String[] args) {
        TreeMap<Student,String> map=new TreeMap<>();  //以红黑树 结构进行数据存储   可以保证键的唯一性
//        map.put(2,"spring的轻量级框架");
//        map.put(4,"微服务框架");
//        map.put(1, "服务器的负载均衡");
//        map.put(3, "热部署");

        map.put(new Student("陈浩",23),"剑圣");
        map.put(new Student("陈浩",23),"剑圣2");
        map.put(new Student("王麻子",22),"剑圣3");
        map.put(new Student("大跑车",22),"剑圣4");


        System.out.println(map);

        Map m=new Hashtable<>();
        m.put("haha ", "hahasas ");
        m.put(true, true);
        m.put(4.5, 4.5);
        m.put(3, 3);
        m.put("", "");

        //m.put(null, "哈哈哈"); //java.lang.NullPointerException  null  不可以当成键  也不可以当成值
        //m.put("六", null);


        System.out.println(m.get("六"));


    }

}

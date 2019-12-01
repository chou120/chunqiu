package mapDemo1;

import java.util.*;

public class Fx {

    public static void main(String[] args) {
//
//        List<List> list1=new ArrayList<>();
////        list.add("陈浩");
////        list.add("流浪汉");
////        list.add("张伟");
////        list.add("王炯");
////        list.add("王红");
////        list.add("崔佳佳");
//
//       // int  a=19;
//
//        List<String> list2=new ArrayList<>();
//        list2.add("陈浩2");
//        list2.add("流浪汉2");
//        list2.add("张伟2");
//        list2.add("王炯22");
//        list2.add("王红2");
//        list2.add("崔佳佳2");
//        List<String> list3=new ArrayList<>();
//        list3.add("陈浩3");
//        list3.add("流浪汉3");
//        list3.add("张伟3");
//        list3.add("王炯3");
//        list3.add("王红3");
//        list3.add("崔佳佳3");
//
//        list1.add(list2);
//        list1.add(list3);
//
//
//        for(List  o:list1){
//
//            for(Object  obj:o){
//                System.out.println("----"+obj);
//
//            }
//        }

        /**
         * for(数据类型  变量名:要遍历的目标 ){ 目标有   集合 和 数组
         *
         *
         * }
         *
         *
         */


        Map map=new HashMap<>();

        Map  map2=new HashMap();
        Map  map3=new HashMap();

        map2.put("刘德华21", "朱丽倩");
       map2.put("蔡徐坤2", "乔碧萝");
        map2.put("张宇2", "刘国泰");
        map2.put("陈浩2", "崔佳佳");
        map2.put("张伟2", "余思佳");

        map3.put("刘德华3", "朱丽倩");
        map3.put("蔡徐坤3", "乔碧萝");
        map3.put("张宇3", "刘国泰");
        map3.put("陈浩3", "崔佳佳");
        map3.put("张伟3", "余思佳");


        map.put(map2, "三年二班");
        map.put(map3, "四年六班");

      Set  set= map.keySet();
        for(Object   obj:set){
            //这个键是  集合map类型  如果想要完整 的输出这个键的内容 就必须对键进行遍历
            Map   m=(Map)obj;  //第一个循环里面所有的集合
            Set  ss=m.keySet();//获取  第一个循环里面的 map集合里面的所有的键
            for(Object  str:ss){
                System.out.println(str+"的老婆"+m.get(str));
            }

        }




    }


}

package mapDemo1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo3 {

    public static void main(String[] args) {
            Map   map1=new HashMap();
            Map  map2=new HashMap();

            map2.put("年后", "我是你爸爸");
            map2.put("pdd", "我是你yey");
            map2.put("jax", "我是你xxx");
            map2.put("水井盖", "你大爷");

        Map  map3=new HashMap();

        map3.put("年后1", "我是21431爸");
        map3.put("pdd1", "我是12312ey");
        map3.put("jax1", "我是你12312x");
        map3.put("水井盖1", "你12312312312312");

        Map  map4=new HashMap();

        map4.put("年22后221", "我123123123123121爸");
        map4.put("pd2222d1", "我1231231232ey");
        map4.put("ja22222x1", "123123122312x");
        map4.put("水2222井盖1", "fsdvsd2312312312");


        Map  map5=new HashMap();

        map5.put("年5", "我12HHHHHHH3121爸");
        map5.put("p5", "我1231231232ey");
        map5.put("j555", "123123122312x");
        map5.put("555555", "fsdvsd2312312312");



        map1.put(map2,map3);
        map1.put(map4, map5);

       Set st=map1.keySet();
       //输出键的值:
        for (Object obj:st){
            Map  m=(Map)obj;
           Set  tt= m.keySet();
           for(Object   o:tt){
               System.out.println("键的值是:"+o+"---对应的值是:"+m.get(o));
           }
        }



    }

}

package mapDemo1;

import cn.Student;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo2 {

    public static void main(String[] args) {
            Map   map1=new HashMap();
            Map  map2=new HashMap();
            map2.put("年后", "我是你爸爸");
              map2.put("pdd", "我是你yey");
             map2.put("jax", "我是你xxx");
             map2.put("水井盖", "你大爷");

         map1.put("第一个人",map2);

         Set  set=map1.keySet();
        for (Object   ob:set) {
            //System.out.println(ob+"-----"+map1.get(ob));
            Map  m=(Map)map1.get(ob);

            Set  s= m.keySet();

            for (Object  o:s) {
                System.out.println(ob+"------"+m.get(o));
            }

        }


    }

}

package mapDemo1;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

public class MapDemo4 {

    public static void main(String[] args) {

        /**
         * LinkedHashMap     map接口  哈希表和 链表的实现
         *
         */
        LinkedHashMap<Integer,String>  link=new LinkedHashMap<Integer,String>();
        link.put(9527, "周星星");
        link.put(1001, "吴孟达");
        link.put(1002, "陈法蓉");
        link.put(1003, "梅艳芳");
        link.put(1004, "邱淑贞");


        Set<Integer> set=link.keySet();
        for (Integer  i:set){

            System.out.println(i+"="+link.get(i));

        }

        //System.out.println(link);


    }


}

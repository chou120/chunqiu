package banyuan.cn;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionDemo2 {

    public static void main(String[] args) {
        List list=new ArrayList();
//        list.add("hahsahs");
//        list.add(new Person("你大爷",23));
//        list.add(true);
//
//        list.add(2,"你好");  //在指定位置进行插入
//
//        list.add("asdhahudwa");
//        list.add("baozhao");

       // list.remove(true);
       // list.remove(3);

        //System.out.println( list.subList(1,3));


//        for (int i = 0; i < list.size(); i++) {
//            list.get(i);
//            System.out.println();
//        }

        //  System.out.println(list.get(1));

        list.add(new Person("你大爷",23));
        list.add(new Person("你2大爷",23));
        list.add(new Person("你3大爷",23));
        list.add(new Person("你4大爷",23));
        list.add(new Person("你5大爷",23));

//       Iterator  it= list.iterator();  //得到迭代器
//
//       while(it.hasNext()){
//           Person  p=(Person) it.next();
//           System.out.println(p.getName());
//       }
//
//        for (集合或者数组里面的元素类型   变量:进行循环的目标对象) {
//
//        }

        for(Object p:list) {
            Person  s=(Person) p;
            System.out.println(s.toString());
        }





    }


}

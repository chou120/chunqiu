package banyuan.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {

    public static void main(String[] args) {

        List list=new ArrayList<>();
        list.add(2131);
        list.add(124);
        list.add(4);
        list.add(6543);
        list.add(61343);
        list.add(651231243);
        list.add(623543);


        Collections.sort(list);
        Collections.binarySearch(list,4);

        System.out.println( Collections.binarySearch(list,4));

       // Collections.shuffle(list);//打乱集合里面的数据顺序

        System.out.println(list);

        Collections.reverse(list);
        System.out.println(list);

        List list2=new ArrayList<>();
        list2.add("哈哈哈");

        System.out.println(Arrays.asList(list,list2));
        int  [] sss={21,3415,5,6125,12};
          int [] a=  Arrays.copyOf(sss,3);

        for (int b:a) {
            System.out.println(b);
        }




    }

}

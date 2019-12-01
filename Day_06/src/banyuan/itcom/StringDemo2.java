package banyuan.itcom;

import java.io.UnsupportedEncodingException;

public class StringDemo2 {

    public static void main(String[] args) {


        String  st="你好啊,我是你爸爸";


        st="你好";
        String  st1="我是";
        System.out.println(st.compareTo(st1));
        /**
         * int len1 = value.length;
         *         int len2 = anotherString.value.length;
         *         int lim = Math.min(len1, len2);
         *         char v1[] = value;
         *         char v2[] = anotherString.value;
         *
         *         int k = 0;
         *         while (k < lim) {
         *             char c1 = v1[k];
         *             char c2 = v2[k];
         *             if (c1 != c2) {
         *                 return c1 - c2;
         *             }
         *             k++;
         *         }
         *         return len1 - len2;
         */

       // System.out.println(st.charAt(3));

        st="ABCdeF";
        st1="abcDEf";

        System.out.println(st.compareToIgnoreCase(st1));

        System.out.println(st.concat(st1));// = + 号

        st="无极之道,在于延续";

        System.out.println(st.contains("于"));

        System.out.println(st.endsWith("延续"));
        System.out.println("-----"+st.startsWith("无极"));


        st="ABCdAeFhahaAeFnihe  AeF 嘿嘿  AeF";
//        try {
//            byte[] by=st.getBytes("iso-8859-1");
//
//            for (int i = 0; i < by.length; i++) {
//                System.out.println(by[i]);
//            }
//        } catch (UnsupportedEncodingException e) {
//            e.printStackTrace();
//        }


        System.out.println(st.indexOf('A')); //表示返回第一出现的位置
        System.out.println(st.lastIndexOf( 'A'));

        System.out.println(st.indexOf('A',2)); //表示从第几个位置开始查找 直到遇到第一个满足条件的字符
       // st=" ";
        System.out.println(st.isEmpty());

        System.out.println(st.replace('C','⚔'));
        System.out.println(st.replace("Ae","剑圣"));

        System.out.println(st.replace("AeF","jax"));

        System.out.println(st.replaceFirst("AeF","剑姬"));

        st="剑姬打jax 剑圣来了，瞎子 没看见 走了 安其拉来了";
        String [] s=st.split(" ");
        for (int i = 0; i < s.length; i++) {
            System.out.println("----"+s[i]);
        }



        st="剑姬打jax 剑圣来了，瞎子 没看见 走了 安其拉来了";

        System.out.println(st.substring(1));
        System.out.println(st.substring(2,8));//不包含最后指定位置
        System.out.println(st.toCharArray()[1]);

        System.out.println("ABC".toLowerCase());


        System.out.println(" _hahah   haha  ".trim()+"----");

        //   utf-8  3      GBK  2

        char  [] c={'a','v'};
        new  String(c);
        System.out.println(String.valueOf(c));







    }

}

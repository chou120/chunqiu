package banyuan.com.dateDemo;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigNumber2 {

    public static void main(String[] args) {

        //什么是包装类     对于基本数据类型进行打包处理的
        //  包装类给不同的数据类型之间提供了一些相互转换的方法
        /*
               八大基本上数据类型: byte short  int long   float double  char  boolean

                          Byte     Short    Integer Long    Float   Double   Character   Boolean
         */

//        String   str="1231412";
//        int   num=34;
//
//        Integer  i=num; //自动装箱  变成了 Integer       new Integer(num);
//
//
//        Integer  in=new Integer(str);   //  装箱
//        // int   n=in.intValue();   //拆箱    机器给我们进行了自动拆箱
//        System.out.println(in+num);
//
//
//        Double   dou=new  Double(str);
//
//      //  dou=12.34;
//
//        System.out.println(12.34+dou);
//
//        dou=123.45;
//
//        double  d=dou.doubleValue();
//        int   t=(int)d;
//
//        i=new Integer(t);
//
//        System.out.println("i===="+i);



        //int   num=214236475867980;
       // Integer  in=new Integer("214236475867980");
        BigInteger   bg=new BigInteger("2142364758679801432536451342536457689867567681432536457");
        long   lo=2142364758632431233L;
        System.out.println(bg+"---"+Integer.MAX_VALUE);

            bg=new BigInteger("34");
            BigInteger  bg2=new BigInteger("45");
        System.out.println(bg.multiply(bg2));


       BigInteger[] v= bg2.divideAndRemainder(bg);

        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i]);
        }

        char  [] c={'a','b','v','d'};

        Character   ch=new Character('a');

        System.out.println(ch.compareTo('n'));

        System.out.println(Character.codePointAt(c,2));


        ch=new Character('8');
        System.out.println( Character.isDigit(ch));







    }


}

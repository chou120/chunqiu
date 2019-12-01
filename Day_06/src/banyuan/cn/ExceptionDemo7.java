package banyuan.cn;

import javax.swing.*;

public class ExceptionDemo7 {


    public static void main(String[] args) {

        System.out.println(fun());




    }

    public  static  int  fun(){
        int a=1;
        int b=0;

        try {
            System.out.println(a/b);
            b=2;
        }catch (Exception e){
            b=8;
            return b;
        }finally {
            b=20;
            System.out.println("你猜我户不会执行..."+b);
            //return  b;
        }
        return  b;


    }

}

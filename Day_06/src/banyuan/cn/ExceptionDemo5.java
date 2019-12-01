package banyuan.cn;

public class ExceptionDemo5 {

    public static void main(String[] args) throws  ArithmeticException {
        /*
            throws
         */
       // System.out.println("----"+(1/0)); //虚拟机在执行到错误代码的时候  直接就停止了 不会再去执行后面代码了

        System.out.println("我是错误后面的代码");

        getShow();




    }



    public   static  void   getShow() throws  NullPointerException,ArrayIndexOutOfBoundsException{

        int  [] arr=null;
        System.out.println(arr[0]);

    }






}

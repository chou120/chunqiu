package banyuan.cn;

public class ExceptionDemo2 {

    /**
     * 异常： 就是java程序在执行过程中所遇到的错误 （此时的错误也叫运行时异常...）
     */
    public static void main(String[] args) {

        try{
           System.out.println(1/0);
            int  []arr=null;
            System.out.println(arr[0]);

        }catch (ArithmeticException  | NullPointerException | ArrayIndexOutOfBoundsException e){
            //jdk1.7以后的新特性
            e.printStackTrace();

        }finally {

        }



    }




}

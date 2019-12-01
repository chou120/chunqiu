package banyuan.cn;

public class ExceptionDemo {

    /**
     * 异常： 就是java程序在执行过程中所遇到的错误 （此时的错误也叫运行时异常...）
     */
    public static void main(String[] args) {

        //System.out.println(1/0); //ArithmeticException

        int  [] arr={1,45,6,78,9,012};
       // System.out.println(arr[9]); //ArithmeticException

        arr=null;
     //   System.out.println(arr[0]); //NullPointerException

        //编译的目的是为了检查语法是否符合逻辑  是否符合规范

       // System.err.println("哈哈哈");


//       try{
//           System.out.println(1/0);
//       } catch (Exception e){
//           e.printStackTrace(); //错误和错误原因
//       }

//        try{
//            System.out.println(1/0);
//        }finally {
//            System.out.println("我是finally代码块");
//        }

        try {
            System.out.println(1/0);
        }catch (ArithmeticException  e){
            e.printStackTrace();
        }finally {
            //  关闭资源用的   这里在io流用的比较多
            System.out.println("不管我的事情....");
        }



       //s System.out.println(1/0);

        System.out.println("你猜我有没有执行...");


    }




}

package banyuan.cn;

public class ExceptionDemo4 {
    public static void main(String[] args) {
            new ExceptionDemo4().show();
    }


    public  void  show(){

       try{
           System.out.println(1/0);
       }catch (ArithmeticException e){
           e.printStackTrace();
       }



    }

}

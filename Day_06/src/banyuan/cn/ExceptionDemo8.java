package banyuan.cn;

public class ExceptionDemo8 {


    public  static  void   check(int score){
        if(score<0||score>150){
            try {
                throw   new  MyException("您输入的分数超出范围....");
            } catch (MyException e) {
                e.printStackTrace();
            }

        }        else{
            System.out.println("输入正确...");
        }
    }

    public static void main(String[] args) {
        check(-1);
    }

}

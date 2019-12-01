package banyuan.cn;

public class ExceptionDemo6 {

    public static void main(String[] args) {

//        try {
//            check(-1);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        int  a=9;
            try{

                System.out.println("哈哈"+(1/0));

            }catch (Exception e){
               // e.printStackTrace();
                //System.exit(0);
                //return ;
                a=10;
                //System.out.println("----"+a);
                return ;
            }finally {
                a=11;
                System.out.println("一直执行");
            }

            System.out.println("a="+a);
        /*
            如果catch里面有return  语句 请问 finally里面的代码还会不会执行   如果执行 那么实在return之前还是之后
         */

    }


    public  static  void  check(int score) throws Exception {  //分数是否符合规范  0 150

            if(score<0 || score>150){
                throw  new ArithmeticException("啊...你这分数有点怪...");
            }else {
                System.out.println("你输入分数对的....");
            }



    }


}

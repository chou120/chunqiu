package banyuan.com;

import java.util.Scanner;

public class ZhengZeDemo1 {


    public static void main(String[] args) {
        //做一个 qq号码的验证  还有密码的验证
//        Scanner  sc=new Scanner(System.in);
//        System.out.println("请输入qq:");
//        String   qq=sc.next();
        System.out.println(checkQqAndPwd("1231223"));




    }



    public  static   boolean  checkQqAndPwd(String qq){

        char [] ch=qq.toCharArray();

        //char []chs={'1','2','A'};

        // 6     12     长度
        //  qq里面不能有除数字以外的字符
     //  if(chs.length>=6 && chs.length<=12 ){

           for (int i = 0; i <ch.length; i++) {
               if(!Character.isDigit(ch[i])){  //如果是true那么   这个字符肯定是数字
                   System.out.println("---"+i);
                   return  false;
               }
           }
     //  }else{

    //   }
        return true;

    }


}

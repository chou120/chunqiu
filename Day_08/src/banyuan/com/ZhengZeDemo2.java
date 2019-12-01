package banyuan.com;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ZhengZeDemo2 {

    public static void main(String[] args) {

//        String  str="sadwqe12_413";
//        String  reg="[a-zA-Z_0-9]{1,}";
//        reg="\\w{1,}";
//
//        str="萨达是的哈稍等哈稍等哈撒大声地 ?   ！@#￥%……&*（）";
//        reg="\\W+";
//        System.out.println(str.matches(reg));
//
//        str="132";
//        reg="\\d{3}";
//        System.out.println(str.matches(reg));
//
//        str="+4";
//
//        reg="\\+\\d";

        //判断一下你这个手机号码是不是满足条件      11位   1开头
//        Scanner  sc=new  Scanner(System.in);
//        System.out.println("请输入手机号码:");
//        String  str=sc.next();
//
//        String   reg="^[1][35789][0-9]{9}$";
//                    reg="^(\\+86)?[1][35789][0-9]{9}$";
//
//        System.out.println(str.matches(reg));

        //邮箱  xxxx@xx.com

            String   str="https://www.baidu.com";
              String  reg="^(http)[s]?\\:\\//[w]{3}\\.\\w+\\.(com|cn)";

            // str="qqeqeeeeeeewegtwe6";
           //  reg="[a-z]?";  // ??  关闭贪婪模式    [x]??   尽可能往少的去匹配      [x]?  有就尽量去匹配 没有那也就不匹配

              str="abc\"bcd\"abd\"hah\"";
              reg="\"(.*？)\"";  //  在小范围内尽量去匹配满足这种格式的字符

        System.out.println(str.replaceAll(reg,"#"));






    }


}

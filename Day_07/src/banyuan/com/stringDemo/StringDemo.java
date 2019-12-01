package banyuan.com.stringDemo;

public class StringDemo {

    public static void main(String[] args) {

        String  str="hello";    //他们有什么区别

        String  str2=new  String("hello");

        //String   st="a"+"b"+"c";



        System.out.println(str.equals(str2)); //true
        System.out.println(str==str2);//false


        str="hello";
        str2="hel"+"lo";

        System.out.println(str.equals(str2)); //true
        System.out.println(str==str2);//      true


        str="hello";
        str2="world";

        String  str3="helloworld";

        System.out.println(str3==str+str2); //false
        System.out.println(str3.equals(str+str2)); // true



    }

}

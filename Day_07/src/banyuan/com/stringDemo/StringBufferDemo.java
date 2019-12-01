package banyuan.com.stringDemo;

public class StringBufferDemo {

    public static void main(String[] args) {

        StringBuffer  sb=new StringBuffer(20);

        System.out.println(sb.capacity()); //理想状态下的初始大小
        System.out.println(sb.length()); //  实际数据的长度

        sb=new StringBuffer("哈哈哈");
        System.out.println(sb);


        sb.append("张三");
        sb.append("李四").append(45).append(true).append(new char[]{'a','b'}).append(new Student("妹子","23"));
        System.out.println(sb);

        char ch=sb.charAt(22);
        System.out.println(sb+"----"+ch);


        StringBuffer  st=sb.delete(22,sb.length());  //
        System.out.println(st+"----sb："+sb);

        System.out.println(sb.deleteCharAt(14));


        char[]  c=new char[10];

        sb.getChars(0,5,c,3);

        System.out.println(new  String(c));


        sb.insert(3,"无极之道");
        System.out.println(sb);


        System.out.println(sb.replace(3,7,"六眼剑圣"));



        sb.reverse();

        System.out.println(sb);



        String st1="李四王五";
        StringBuffer  sb2=new StringBuffer("张三王五");

        String    ss=st1.substring(1);
        System.out.println("String 字符串截取之后的值:"+ss+",字符串本身的值:"+st1);

        String sb3=sb2.substring(1);

        System.out.println("Stringbuffer截取之后的值是:"+sb3+",StringBuffer本身的值是:"+sb2);









    }

}

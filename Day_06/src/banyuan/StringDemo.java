package banyuan;

import java.io.UnsupportedEncodingException;

public class StringDemo {

    public static void main(String[] args) {

        String  s="hello Java"; //    s指向的数据 hello java 存在常量池里面

        s="你好"+"幸福啊!!!"; //问: s的内容的值有没有变化？  被String所定义的数据能不能改变  思考下；自己写一个能证明String类型的数据不能改变的方法....

        String  st=new  String();

        System.out.println("st的内容:"+st+"|");
        System.out.println(st.length());

        byte [] by=new byte[]{68,67,98};

        String strs="你好哈哈哈";
        by=strs.getBytes();

        try {
            st=new String(by,"ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        System.out.println("iso-8859-1对字节数组进行解码:"+st);



        char [] ch={'男','女','搭','配','A','B'};
        st=new String(ch,2,3);


        String  sst="nihao";
        st=new String(sst);





        System.out.println(st==sst);



    }

}

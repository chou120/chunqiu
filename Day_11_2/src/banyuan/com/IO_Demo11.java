package banyuan.com;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class IO_Demo11 {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        /**
         * Properties
         *         跟map类似
         */
        Properties  pro=new Properties();
    //    InputStream  is=new FileInputStream(new File("src//pro.properties"));
//        pro.load(is);
//
//        System.out.println(pro.values());

//        pro.setProperty("9527","张三");
//        pro.setProperty("9528","张三2");
//
         // Writer  writer=new FileWriter(new  File("src//pro.properties"),true);

//        pro.store(writer,"handsome");


        //   NIO  newIO jdk1.7           IO  jdk1.4

        Path   p=Paths.get("2.txt");
       // System.out.println(p);
        Files.copy(p , new FileOutputStream(new File("3.txt")));

        List list=new ArrayList<>();
        list.add("哈哈哈");
        list.add("呵呵你");

        Files.write(p,list, Charset.forName("gbk"));



    }

}

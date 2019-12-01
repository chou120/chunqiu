package banyuan.com;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class IO_Demo7 {
    /**
     * 这个案例是转换流
     * @param args
     * @throws IOException
     */

    public static void main(String[] args) throws IOException {

        File  file=new File("1.txt");
        if(!file.exists()){
            file.createNewFile();
        }

        OutputStreamWriter  os=new OutputStreamWriter(new FileOutputStream(file,true));
        os.write("我是你爸爸真伟大是的撒多大所爱仕达大所多无暗杀大王");
       // os.close();
        os.flush();  //为什么刷新之后  我就能读取文件数据    就是因为这里有缓冲区的存在
        os.write("哈哈哈");
        os.flush();

        //转换流
        InputStreamReader   is=new InputStreamReader(new FileInputStream(file));
        char [] ch=new char[(int)file.length()/3]; //  utf-8 以三个字节存储汉字   gbk格式是以两个字节
        is.read(ch);


        System.out.println(new String(ch));
        is.close();
        os.close();

        BufferedWriter   bw=new BufferedWriter(new FileWriter(file));
        bw.write("sas");


        BufferedReader  br=new BufferedReader(new FileReader(file));
        br.readLine();






    }
}

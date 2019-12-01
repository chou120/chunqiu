package banyuan.cn;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class IO_Demo5 {

    public static void main(String[] args) throws IOException {
        // 字符流
        File   file=new File("1.txt");


        Writer writer=new FileWriter(file);
            String  str="萨达鞍山市大奥所";
            writer.write(str);  //

        writer.close();

        Reader   read=new FileReader(file);

     //   char[] ch=new char[]; //如果是中英文混合会出现长度多余的情况
    List list=new ArrayList<>();

        int   line=read.read();
            while (line!=-1){
                list.add((char)line);
                line=read.read();
            }
        read.close();
        System.out.println(list);


    }


}

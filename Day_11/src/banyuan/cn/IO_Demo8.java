package banyuan.cn;

import java.io.*;

public class IO_Demo8 {

    public static void main(String[] args) throws IOException {

        File  file=new File("1.txt");
        if(!file.exists()){
            file.createNewFile();
        }

        OutputStreamWriter  os=new OutputStreamWriter(new FileOutputStream(file));
        os.write("我是你爸爸真伟大");
        os.close();


        //转换流
        InputStreamReader   is=new InputStreamReader(new FileInputStream(file));
        char [] ch=new char[(int)file.length()];
        is.read(ch);

        System.out.println(new String(ch));
        is.close();
        //os.close();


    }


}

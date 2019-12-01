package banyuan.cn;

import java.io.*;

public class IO_Demo7 {

    public static void main(String[] args) throws IOException {

        File  file=new File("1.txt");

        Writer  writer=new FileWriter(file);
        BufferedWriter  bw=new BufferedWriter(writer);
        bw.write("你好");

        bw.close();


        Reader read =new FileReader(file);
        BufferedReader  br=new BufferedReader(read);
        char [] ch=new char[(int)file.length()];
        br.read(ch);

        System.out.println(new String(ch));


//        OutputStream  is=new FileOutputStream(file);
//        String  str="我是你爸爸真伟大";
//        is.write(str.getBytes("GBK"));
//
//        is.close();









    }


}

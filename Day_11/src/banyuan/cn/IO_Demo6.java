package banyuan.cn;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class IO_Demo6 {

    public static void main(String[] args) throws IOException {
        //字节缓冲流
        File   file=new File("1.txt");

        InputStream  is=new FileInputStream(file);

        BufferedInputStream   bis=new BufferedInputStream(is);



        byte  [] by=new byte[(int)file.length()];

        long  start=System.currentTimeMillis();

        bis.read(by);

        long  end=System.currentTimeMillis();

        System.out.println("花费了"+(end-start)+"毫秒");

        bis.close();
        is.close();

        //如何在文档中写入图片？



    }


}

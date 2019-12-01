package banyuan.com.cn.io2;

import java.io.*;

public class IO_Demo5 {

    public static void main(String[] args) throws IOException {

        //找到一个文件
        File file = new File("12.txt");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        byte[] by=new byte[(int)file.length()];
        InputStream is=null;
        try {
            is=new FileInputStream(file);
            //is.read(by); //一次读取所有的
            is.read(by,1,8); //往指定的位置进行输入内如 输入到by里面
            System.out.println(new String(by));


        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            is.close();

        }
    }

}
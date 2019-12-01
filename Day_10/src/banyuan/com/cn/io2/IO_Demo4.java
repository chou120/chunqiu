package banyuan.com.cn.io2;

import java.io.*;

public class IO_Demo4 {

    public static void main(String[] args){

        //找到一个文件
        File file=new File("12.txt");
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        String   str="我是你爸爸！！！";

        /**
         * 文件流：
         *      字节流      输入流    读入数据
         *                 InputStream
         *
         *                 输出流    读出数据
         *                 OutputStream
         *      字符流
         *
         */
        InputStream   is= null;
        OutputStream  os=null;
        try {
            is = new FileInputStream(file);
            int   line=is.read();
            byte [] by=new byte[(int)file.length()];
            int count=0;

            while(line!=-1){
                by[count]=(byte)line;
                count++;
                line=is.read();

            }
            //str=new String(by);

            //System.out.println(str);

           os=new FileOutputStream(file,true);
            //os.write(str.getBytes());
            os.write("\r\n".getBytes());
            os.write("21312".getBytes());
            os.write(123);


        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(os!=null){
                    os.close();   //关闭流 释放资源       谁先开  谁后关
                }
                if(is!=null){
                    is.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }

}

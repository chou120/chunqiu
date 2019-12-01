package banyuan.com;

import java.io.*;

public class Homework {
    /**
     *  练习: 以文件流的方式把指定文件夹中的图片,mp3读取到指定的文件夹中去
     * @param args
     */

    public static void main(String[] args) throws IOException {

    File file=new File("//Users//sanye//img//1.jpg");
    if(!file.exists()){
        file.createNewFile();
    }
      //  System.out.println(file.getAbsolutePath());
    //读取文件
        InputStream  is=new FileInputStream(file);
        byte[] by=new  byte[(int)file.length()];

        is.read(by);
        File  file2=new File("//Users//sanye//resp//img//1.jpg");

        if(!file2.exists()){
            file2.createNewFile();
        }

        OutputStream  os=new FileOutputStream(file2);
            os.write(by);

            os.close();
            is.close();









    }

}

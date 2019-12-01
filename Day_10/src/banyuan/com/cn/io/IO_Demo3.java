package banyuan.com.cn.io;

import java.io.File;
import java.io.FilenameFilter;

public class IO_Demo3 {


    public static void main(String[] args) {
        //文件过滤器
        //比如说 我想找到指定文件夹下面的所有的 以.jpg或者 .png结尾的文件
        File file =new  File("/Users/sanye/IdeaProjects");

//        String  []  str=file.list(new FilenameFilter() {
//            @Override
//            public boolean accept(File dir, String name) {
//            //dir  目录中的文件被找到
//                if(dir.exists()){
//                    return name.endsWith(".pdf")||name.endsWith(".doc");
//                }
//                return  false;
//
//            }
//        });
//
//        for (String  s:str) {
//            System.out.println(s.toString());
//        }

       String [] str= file.list(new MyFilenameFilter());

        for (String  s:str) {
           System.out.println(s.toString());
        }



    }


}

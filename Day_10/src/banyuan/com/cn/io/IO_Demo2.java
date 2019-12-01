package banyuan.com.cn.io;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class IO_Demo2 {

    static  List<File> list=new ArrayList<>();

    public static void main(String[] args) {

        File file=new File("/Users/sanye/IdeaProjects");

//      String [] str=  file.list();
//        for (String file2:str) {
//            System.out.println(file2);
//        }
//        File [] fil=file.listFiles();
//
//        for (File  f:fil) {
//            System.out.println(f);
//        }

        //如何去获取当前文件夹下面的所有的文件 包括隐含的文件

        List<File> list=getFileList(file);
        for (File  f:list) {
            System.out.println(f);
        }


    }

    public   static List getFileList(File  file ){

        File []  fileList=file.listFiles();

        if(fileList!=null){
            for (int i = 0; i < fileList.length; i++) {

                if(!fileList[i].isDirectory()){
                    list.add(fileList[i]);
                }else{
                   getFileList( fileList[i]);
                }

            }
        }

        return  list;

    }





}

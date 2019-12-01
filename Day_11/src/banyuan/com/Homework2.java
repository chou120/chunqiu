package banyuan.com;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Homework2 {
    /**
     *  将集合中的数据全部写入到指定的文档中
     * @param args
     */

    public static void main(String[] args) throws IOException {

        File file=new File("1.doc");
        if(!file.exists()){
            file.createNewFile();
        }

        List list=new ArrayList<>();
        list.add("哈哈哈");
        list.add(true);
        list.add(12.14);
        list.add('a');
        list.add(65);
//        list.add(new Student("张三", "南京xxxx"));
//        list.add(new Student("李四","北京"));
//        list.add(list);
//
//        List list2=new ArrayList<>();
//        list2.add("哈哈嘿嘿");
//        list2.add(true);
//        list2.add(12.14);


        OutputStream os=new FileOutputStream(file);
        for (Object obj:list) {
            String   str=String.valueOf(obj);
            os.write(str.getBytes());
          // os.write(",".getBytes());
        }
       // os.write(97);



        InputStream  is=new FileInputStream(file);
        byte [] by=new byte[(int)file.length()];
        is.read(by);

        System.out.println(new String(by));
        os.close();




    }

}

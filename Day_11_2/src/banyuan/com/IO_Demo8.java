package banyuan.com;

import java.io.*;
import java.nio.file.Paths;
import java.util.Date;

public class IO_Demo8 {

    public static void main(String[] args) throws IOException {

//        BufferedWriter br=new BufferedWriter(new FileWriter(new File("1.txt")));
//
//        br.write(120);
//
//        br.close();
//

//          数据操作流
//        DataOutputStream   dos =new    DataOutputStream(new FileOutputStream(new File("1.txt")));
//        dos.writeInt(65);
//        dos.writeChar(65);
//        dos.close();
//
//
//        DataInputStream  dis=new DataInputStream(new FileInputStream(new File("1.txt")));
//        System.out.println(dis.readInt());
//        System.out.println(dis.readChar());
//        dis.close();


//内存操作流
        /**
         * 操作字节数组
         *  ByteArrayInputStream
         *  ByteArrayOutputStream
         *
         * 操作字符数组的
         * CharArrayReader
         * CharArrayWriter
         *
         * 操作字符串
         * StringReader
         * StringWriter;
          */

//        StringWriter  sw=new StringWriter();
//        sw.write("哈哈哈你好");
//        sw.append("称号");
//        sw.close();
//
//        StringReader   st=new StringReader(sw.toString());
//        char []  ch=new  char[sw.toString().length()];
//        st.read(ch);
//
//        System.out.println(new String(ch));


        /**
         * 打印流:
         *  字节打印流
         *  字符打印流
         */
        //System.out.println();
//        PrintStream   ps=new PrintStream(new File("1.txt"));  //没有追加的方法  每次重新启动项目 都会把源文件内容清空
//        ps.print("我是你爷爷...");
//
//        ps.append("刘国泰...");
//        ps.append("刘国泰.222..");
//        ps.append("刘国泰.3333..");
       // ps.close();

       // ps.flush();


//        int [] arr=null;
//
//
//            while(true){
//                try {
//                System.out.println(arr[4]);
//                }catch (Exception  e){
//                    ps.println(new Date()+":"+e);
//
//                }finally {
//
//                }
//            }


        /*
            标准输入输出流
               System.in   InputStream

         */

//        InputStream  is=System.in;
//        BufferedReader    br=new BufferedReader(new InputStreamReader(is));
//        System.out.println("请输入一行数据:");
//        String   str=br.readLine();
//        System.out.println(str);
//        br.close();


//        OutputStream os=System.out;
//        BufferedWriter  bw=new BufferedWriter(new OutputStreamWriter(os));
//        bw.write("陈浩.......- -!");
//
//        bw.close();

        /**
         *  在eclipse里面编辑能正常执行  但是在idea不行
         */

        File  file=new  File("1.txt");
        RandomAccessFile   raf=new RandomAccessFile(file,"rw"); //   "r"  "rw" "rws" or "rwd"
      //  raf.seek(2);  //找到指定的位置

        byte []  by=new byte[(int)raf.length()];
        raf.read(by);

        System.out.println(new  String(by));
        raf.close();






    }

}

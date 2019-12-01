package banyuan.com.stringDemo;

public class StringBufferAndString {


    public static void main(String[] args) {
        String  str1=new  String("武器大师");
        String  str2=new String("快乐风男");
        getStr(str1,str2);

        System.out.println("调用方法之后得到的数据:str1="+str1+"---,str2="+str2);


        StringBuffer  sb=new StringBuffer("武器大师");

        StringBuffer  sb2=new StringBuffer("快乐风男");

        getSb(sb,sb2);

        System.out.println("sb="+sb+",sb2="+sb2);


    }

    //首先对字符串进行比较
    public  static   void  getStr(String  str1,String  str2){
        str1=str2;
        str2=str1+str2;


    }

    public  static   void  getSb(StringBuffer  str1,StringBuffer  str2){

        str1=str2;
        str2= str1.append(str2);

        

    }




}

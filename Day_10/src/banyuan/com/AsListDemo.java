package banyuan.com;

public class AsListDemo {


    public static void main(String[] args) {


        //我不想传递一个数组
        //  只有四个数字

        System.out.println(getSum(12,34,56,7,89,9,0,123));






    }


    public  static  int   getSum(int...a){

        int sum=0;
        for (int i = 0; i <a.length; i++) {
            sum+=a[i]; //sum=sum+arr[i];
        }
        return  sum;

    }


    public  static   int    getSum(int x,int y){

        return  x+y;

    }



    //我现在要做任意长度的数据求和
//    public   static int  getSum(int [] arr){
//          int sum=0;
//        for (int i = 0; i <arr.length; i++) {
//            sum+=arr[i]; //sum=sum+arr[i];
//        }
//
//        return sum;
//
//    }
//
//



}

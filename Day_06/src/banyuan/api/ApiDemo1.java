package banyuan.api;

public class ApiDemo1 {

    /**
     * api:application   programming   interface  应用程序接口
     * @param args
     *
     */


    public static void main(String[] args) throws CloneNotSupportedException {

        Object      obj=new Object();

        Object ob=obj;
        System.out.println("ob和obj是不是同一个对象:"+obj.equals(ob));



        System.out.println(obj.hashCode());        //491044090
        System.out.println(obj.toString());

        obj=new Student("1",1);
        System.out.println(obj.getClass()+"---"+obj.getClass().getName());
        System.out.println(obj.toString());
        System.out.println("stu的hashcode"+obj.hashCode());


        Student   st=new Student("张三1",23);
        Student   st2=new Student("张三",23);
        System.out.println(st.equals(st2));         //传递过来的对象和当前对象不一样

              //clone    表示克隆一个对象的副本

                Student   s=(Student)st.clone();
                System.out.println("------"+s.equals(st));




         // clone();
        st=null;

        System.gc();




    }


}

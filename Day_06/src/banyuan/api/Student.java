package banyuan.api;

public class Student implements  Cloneable{

    private  String name;
    private  int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println(this.name+"被垃圾回收了...");
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

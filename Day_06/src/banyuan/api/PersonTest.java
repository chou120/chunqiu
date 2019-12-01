package banyuan.api;

public class PersonTest {
    public static void main(String[] args) {

        Person p=new Person("张伟",22);
        Person p2=new Person("张伟",22);
        System.out.println(p.equals(p2));

            p=new Person();
            p2=new Person();
        System.out.println("-----"+p.equals(p2));//true



    }
}

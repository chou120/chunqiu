package banyuan.api;

public class Person {

    private   String   name;
    private  int  age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    //重写equals方法


    @Override
    public boolean equals(Object obj) {
        boolean  flag=false;
        if(obj==null){
            return flag;
        }
        if(this.getClass()!=obj.getClass()){
            return flag;
        }
        if(this==obj){
            flag=true;
            return flag;
        }
        Person per=(Person)obj;
        if(this.getAge()!=per.getAge()){
            return flag;
        }
        if(this.getName()!=null&&per.getName()!=null){
                if(this.getName().equals(per.getName())){
                    flag=true;
                    return  flag;
                }

        }

        return flag;
    }
}

package com.banyuan.fx01.fx05;

import java.util.ArrayList;
import java.util.List;

public class Main {


    static    class Animal{};
    static   class  Cat  extends  Animal{};
    static  class   MCat  extends   Cat{}

    static   class  Dog  extends  Animal{};

    static   class   Read<T>{
//
//        public   T  read(List<T>  list){
//
//            return  list.get(0);
//        }

//        public   T  read(List<? extends  T>  list){
//        //上述写法  指定了集合里面的数据类型只能是 T 及其子类 或者孙子类都行   这样其实有实现了 多态
//        //  此种写法 唯一不好地方:只能读取 不能添加
//        //list.add(new  Animal());  报错    但是  我就要往里面添加
//
//            return  list.get(0);
//        }

    }


    static  class Add<T>{

        public  <T>  void add(List< ? super   T>  list,T  t){


            list.add(t);

          //  Animal  an=list.get(0);
           // Cat  cat=list.get(0);


        }


    }




    public static void main(String[] args) {

        List<Animal>  listAnimal=new ArrayList<>();
        List<Cat>  listCat=new ArrayList<>();
        listAnimal.add(new Animal());
        listCat.add(new Cat());

        //Read<Animal>  animalRead=new Read<>();
        //Cat  cat=animalRead.read(listCat);  此时  List<Animal>  和   List<Cat>  没有任何关系  如何 对这种写法进行改进

        //修改之后的测试
     //   Cat  cat=(Cat)animalRead.read(listCat);


        Add<Cat>  addCat=new Add<>();
        addCat.add(listCat,new Cat());
       // addCat.add(listAnimal,new Cat());
       // addCat.add(listCat, new MCat());



        List< ? extends  Animal>  list=listAnimal;


        List<? super   Cat>  li=new ArrayList<>();
        li.add(new MCat());
        li.add(new  Cat());
      //  li.add(new Animal());
        /*
            ?  extend  T   T 及其子类都可取出
            ？ super   T    T及其父类不能存放  作为上限

         */

        /**
         * ?  和  T  有什么不同
         * ?是在泛型类和泛型方法使用的时候 用
         * T是在泛型类和方向方法声明的时候用
         */





    }





}

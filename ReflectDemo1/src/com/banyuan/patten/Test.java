package com.banyuan.patten;

public class Test {

    public static void main(String[] args) {

        StudentImpl  st=new StudentImpl();
      //  st.buyCar();

        /**
         * 找预算师预算成本 降到最低
         * 找一个人 帮我做这个事情
         * PersonA
         *
         */

        st.setMoney(1000000);
        PersonA  p=new PersonA(st);
        p.buyCar();

        //这种写法的方式 叫 静态代理    提前知道代理的类是谁

        /**
         *  P    ---  > A    当时  不知道代理的过程和代理人具体是哪一个  直到 他们"见面"的时候  才会确定 代理类是谁
          */






    }



}

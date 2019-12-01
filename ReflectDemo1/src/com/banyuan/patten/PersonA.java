package com.banyuan.patten;

public class PersonA  implements Student {

    //对哪个对象进行管理
    private   StudentImpl  student;

    public PersonA(StudentImpl student) {
        this.student = student;
    }


    @Override
    public void buyCar() {

        if(student.getMoney()>100000){
            student.buyCar();
        }else{
            System.out.println("穷逼,没钱.....");
        }



    }



}

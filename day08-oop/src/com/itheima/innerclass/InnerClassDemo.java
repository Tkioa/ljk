package com.itheima.innerclass;
//一个类可以有五个部分:变量、构造器、方法、代码块、内部类;例如System.out.println();不属于任一部分,所以不能直接写。
public class InnerClassDemo {
    public static void main(String[] args) {
        Outer.Inner oi = new Outer().new Inner("王麻子");
        System.out.println(oi.getName());
        oi.show();
        People.Student stu = new People().new Student();
        stu.MM();
    }
}

class People{
    int age = 100;
    class Student{
        int age = 90;
        public void MM(){
            int age = 80;
            System.out.println(age);
            System.out.println(this.age);
            System.out.println(People.this.age);
        }
    }
}
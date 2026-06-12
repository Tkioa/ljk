package com.itheima.Extends2;
//super用于访问父类中的成员变量和成员方法。
public class Test {
    public static void main(String[] args) {
        B b = new B();
        b.show(10);
    }
}

class A{
    int a = 1;
    public void show(){
        System.out.println("好😊");
    }
}

class B extends A{
    int a = 2;
    public void show(int a){
        System.out.println("hello");
        super.show();
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(super.a);
    }
}
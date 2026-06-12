package com.itheima.interface1;
//接口不可以创建对象
public class Test {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(B.NAME);
        a.show();
        a.print();
    }
}

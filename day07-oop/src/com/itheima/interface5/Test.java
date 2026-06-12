package com.itheima.interface5;
//接口的多继承
public class Test {
    public static void main(String[] args) {

    }
}

interface A{
    void show();
}
interface B{
    void go();
}
interface C extends A,B{
    void print();
}
class D implements C{
    @Override
    public void go() {

    }

    @Override
    public void show() {

    }

    @Override
    public void print() {

    }
}
package com.itheima.singleClass;
//饿汉式单例
public class A {
    //1.私有化构造器
    private A() {}
    //2.定义一个静态变量来作为唯一对象。
    //public static final A a = new A();
    private static A a = new A();
    //private修饰a防止被外部创建对象。
    public static A getInstance() {
        return a;
    }
}

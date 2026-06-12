package com.itheima.abstract3;

public abstract class Animal {
    public final void write(){//final修饰防止模版被修改。
        System.out.println("动物要开始去吃饭");
        System.out.println("动物似乎吃饱了");
        print();
        System.out.println("动物开始睡觉了");
    }
    public abstract void print();
}

package com.itheima.polymorphsm2;

public class Cat extends Animal{
    @Override
    public void run(){
        System.out.println("😾跑的快");
    }

    public void catchMouse(){//独有方法;多态不能直接调用。
        System.out.println("抓老鼠");
    }
}

package com.itheima.interface1;

public class A implements B,C{
    @Override
    public void print(){
        System.out.println("打印");
    }
    @Override
    public void show(){
        System.out.println("显示");
    }
}

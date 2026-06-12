package com.itheima.polymorphsm3;

public class Dog extends Animal{
    @Override
    public void run(){
        System.out.println("🐶跑的快");
    }

    public void eat(){
        System.out.println("吃狗粮");
    }
}

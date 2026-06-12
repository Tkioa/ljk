package com.itheima.polymorphsm3;

public class Cat extends Animal{
    @Override
    public void run(){
        System.out.println("😾跑的快");
    }

    public void catchMouse(){
        System.out.println("😾抓老鼠");
    }
}

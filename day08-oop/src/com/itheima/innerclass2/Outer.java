package com.itheima.innerclass2;
//静态内部类只能访问静态成员，不能访问实例成员。
public class Outer {
    private static final String NAME = "刘京凯";
    public static void show(){
        System.out.println("展示");
    }
    private int age = 10;
    public static class Inner{
        public void print(){
            System.out.println(NAME);
            show();
            //System.out.println(age);报错
        }
    }
}

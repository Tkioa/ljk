package com.anik.helloworld.var;

/**
 * 变量的使用
 * 优点：变量的使用，可以重复使用，可以保存数据，存储大量的重复数据，在后期更新更容易修改。
 */
public class demo01 {
    public static void main(String[] args) {
        printVar();
    }

    public static void printVar() {
        int age = 18;
        System.out.println(age);
        //定义一个小数变量，并赋值
        double score = 90.5;
        System.out.println(score);
        score = 91.2;
        System.out.println(score);
        char ch1 = 'A';
        System.out.println(ch1);
        System.out.println(ch1+1);
    }
}

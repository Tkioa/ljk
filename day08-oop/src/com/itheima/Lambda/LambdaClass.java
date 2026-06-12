package com.itheima.Lambda;

/**
 * Lambda表达式指java中的函数。
 * 可以替代“函数式接口”的匿名内部类对象。只能有一个抽象方法。
 * Lambda简化规则:
 * 1.参数列表中的参数类型可以全部省略不写;
 * 2.当只有一个参数时，小括号可以省略不写，但多个参数不可以省略。
 * 3.若方法体只有一行代码,大括号{}可以不写,同时分号也要省略。
 */
public class LambdaClass {
    public static void main(String[] args) {
        Animal cat = ()->
            System.out.println("喵喵喵");
        cat.voice();
    }
}

@FunctionalInterface
interface Animal{
    void voice();
}
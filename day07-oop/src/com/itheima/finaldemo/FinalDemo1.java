package com.itheima.finaldemo;

public class FinalDemo1 {
    //3.被final修饰的变量一定要赋值且只能被赋值一次。且变量名应该全部大写。一般修饰静态变量。
    public static final int MAX = 100;
    public static void main(String[] args) {
        final int [] arr = {11,22,3,44};//当final修饰数组这种引用型变量,数组本身不能被改变,但数组的元素可以改变。
        arr[2] = 23;
    }
}
//1.被final修饰的类不能被继承.
final class A{}
//class B extends A{}

//2.被final修饰的方法不能被重写.
class C{
    public final void print(){}
}
class D extends C{
    //@Override
    //public void print(){}
}


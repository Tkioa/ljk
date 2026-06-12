package com.itheima.method;

/**
 * return可以运用在无返回值类型的方法中，用来中断方法的执行；
 */
public class MethodDemo3 {
    public static void main(String args[]) {
        print(10, 0);
    }

    //写一个除法运算的方法
    public static void print(int a, int b) {
        if (b == 0) {
            System.out.println("除数不能为0");
            return;
        }
        System.out.println(a / b);
    }
}

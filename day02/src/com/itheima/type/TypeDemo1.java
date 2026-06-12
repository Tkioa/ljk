package com.itheima.type;

/**
 * 自动类型转换，范围小的可以直接赋值给范围大的
 */
public class TypeDemo1 {
    public static void main(String[] args) {
        byte a = 10;
        print(a);
        print2(a);
    }

    public static void print(int a) {
        System.out.println(a);
    }

    public static void print2(double a) {
        System.out.println(a);
    }
}

package com.itheima.type;

/**
 * 强制类型转换
 */
public class TypeDemo2 {
    public static void main(String[] args) {
        int a = 10;
        print((byte) a);//---------------------------------------------
        double b = 20.5;
        print((byte)b);//浮点型转换为整数型，直接丢掉小数部分；
    }

    public static void print(byte a) {
        System.out.println(a);
    }
}

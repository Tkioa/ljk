package com.itheima.method;

public class MethodDemo1 {
    public static void main(String args[]) {
        int a = getMax(10, 20);
        System.out.println(a);
    }

    //定义一个方法，求任意两个数的最大值，返回类型为int
    public static int getMax(int a, int b) {
        int max = 0;
        max = a > b ? a : b;
        return max;
    }
}

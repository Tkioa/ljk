package com.itheima.type;
//表达式中的类型转换
public class TypeDemo3 {
    public static void main(String[] args) {
        System.out.println(sum(10,20,30.3));
        System.out.println(sum2((byte)12,(byte)44,(short)10));
    }
    public static double sum(int a,int b,double c){
        return a+b+c;//最终返回值的类型由范围类型最大的决定。
    }
    public static int sum2(byte a,byte b,short c){
        return a+b+c;//byte,short,char默认转换为int计算,因为在求和时可能超出范围导致溢出。
    }
}

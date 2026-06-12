package com.itheima.operator;

public class OperatorDemo1 {
    public static void main(String[] args) {
        operatorDemo1(10,20);
        operatorDemo2();
    }
    public static void  operatorDemo1(int a,int b){
        System.out.println(a+b);
        System.out.println(a/b);//得到整数
        System.out.println(1.0*a/b);//得到小数
    }
    public static void operatorDemo2(){
        int a = 5;
        System.out.println("anika"+a+'a');//anika 5a
        System.out.println(a+'a'+"anika");//102anika,+运算符能算则算，不能算则拼接；
    }
}

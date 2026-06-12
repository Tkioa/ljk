package com.itheima.method;
/**方法重载
 * 优点:适用于工作原理相同，但参数不同的情况，程序员也更好记忆方便调用；
 * */

public class MethodDemo2 {
    public static void main(String args[]){
        print(10);
        print(20.4);
    }
    public static void print(int a){
        System.out.println(a);
    }
    //方法重载
    public static void print(double a){
        System.out.println(a);
    }
    public static void print(String a){
        System.out.println(a);
    }
}

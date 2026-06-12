package com.itheima.loop;
//循环嵌套
public class LoopTest1 {
    public static void main(String[] args) {
        test1();
        test2();
    }
    public static void test1(){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                System.out.print("刘");
            }
            System.out.println();
        }
    }
    public static void test2(){
        for(int i=1;i<=9;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+"*"+i+"="+j*i);
                System.out.print("\t");
            }
            System.out.println();
        }
    }
}

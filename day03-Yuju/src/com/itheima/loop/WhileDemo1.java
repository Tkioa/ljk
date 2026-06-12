package com.itheima.loop;

/**
 * while循环和For循环原理相同
 * For循环适合知道循环次数的场景
 * While循环适合不知道循环次数的场景，例如银行存钱;
 */
public class WhileDemo1 {
    public static void main(String[] args) {
        test1();
    }
    public static void test1(){
        int j = 0;
        int i = 100000;
        while(i<200000){
            i = i+(int)(i*0.017);
            j++;
        }
        System.out.println("资金翻倍需要"+j+"年");
    }
}

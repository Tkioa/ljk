package com.itheima;
//定义静态数组
public class ArrayDemo1 {
    public static void main(String[] args) {
        test1();
    }
    public static void test1(){
        String [] names = {"蒙多","赵信","腕豪","铁男","亚托克斯","诺克萨斯"};
        int index = (int)(Math.random()*names.length);//使用括号将整体括起来,否则一直是index=0;
        String name = names[index];
        System.out.println(name);
    }
}

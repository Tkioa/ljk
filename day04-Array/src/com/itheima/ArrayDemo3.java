package com.itheima;
//制作简易的扑克
public class ArrayDemo3 {
    public static void main(String[] args) {
        test1();
    }
    public static void test1(){
        String [] poker = new String[54];
        String [] number = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        String [] colors = {"♠","♥","♣","♦"};
        int index = 0;
        for(int i=0;i<number.length;i++){
            for(int j=0;j< colors.length;j++){
                poker[index] = colors[j]+number[i];
                System.out.print(poker[index]+"\t");
                index++;
            }
        }
        poker[index]="小王";
        System.out.print(poker[index]+"\t");
        index++;
        poker[index]="大王";
        System.out.println(poker[index]);
        //洗牌:依次遍历，每次遍历与随机选中的数交换;
        for(int i=0;i<poker.length;i++){
           int state = (int)(Math.random()*54);//存取选中的索引,防止后续数据交换时发生改变.
           String temp = poker[i];
           poker[i] = poker[state];
           poker[state] = temp;
        }
        for(int i=0;i<poker.length;i++){
            System.out.print(poker[i]+"\t");
        }
    }
}

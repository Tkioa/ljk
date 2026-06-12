package com.itheima.object;
//对象的数据以及对对象的处理封装在一个类中
public class Student {
    String name;
    int Chinese;
    int Math;
    public void sum(){
        System.out.println(name+"总成绩:"+(Chinese+Math));
    }
    public void avg(){
        System.out.println(name+"平均成绩:"+(Chinese+Math)/2);
    }
}

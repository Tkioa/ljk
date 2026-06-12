package com.itheima.Static;
//static修饰成静态变量,只有一份;适用于只需要一份数据,例如记录创建对象的次数;
public class Student {
    static int count;
    public Student(){
        count++;
    }
}

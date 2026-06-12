package com.itheima.Extends3;

/**方法重写:当父类中的方法不满足需求时,可以对其进行重写。
 * 重写注意:重写不了父类的private和静态方法.
 */
public class Test {
    public static void main(String[] args) {
        Student stu =  new Student("刘十三",22,"男");
        System.out.println(stu);//原本父类Object的toString方法输出的是地址，现在重写后输出的是属性值;
    }
}

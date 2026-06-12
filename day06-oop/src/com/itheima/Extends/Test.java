package com.itheima.Extends;
/*继承的好处:提高代码的复用性。将共有属性写到父类中.
不能继承多个类，支持多层继承，所有类的祖宗类都是Object类。
不能继承多个类的原因：若多个类出现方法名称相同，则继承的子类无法区分，只能继承一个。
 */
public class Test {
    public static void main(String[] args) {
        Teacher te = new Teacher();
        te.setKill("活泼");
        te.setAge(22);
        te.setGender("女");
        System.out.println(te.getKill());
        System.out.println(te.getAge());
        System.out.println(te.getGender());
    }
}

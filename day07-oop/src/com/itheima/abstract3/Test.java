package com.itheima.abstract3;

/**模版方法设计模式
 * 1.相同的内容放至父类
 * 2.不同的内容放至子类(对抽象方法重写实现)
 */
public class Test {
    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal tiger = new Tiger();
        cat.write();
        tiger.write();
    }
}

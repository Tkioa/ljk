package com.itheima.polymorphsm1;
//多态强调对象多态和行为多态,变量不多态。
public class Test {
    public static void main(String[] args) {
        Animal wolf = new Wolf();//编译看左,运行看右.
        wolf.run();
        Animal cat = new Cat();
        cat.run();
        System.out.println(cat.name);
        System.out.println(wolf.name);
        wolf.eat();
    }
}

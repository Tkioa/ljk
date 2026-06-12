package com.itheima.polymorphsm2;
//使用多态的好处
public class Test {
    public static void main(String[] args) {
        Animal cat = new Cat();//1.多态的解耦合,右边的好比组件,若需要替换成狗,只需要换成new Dog();
        Animal dog = new Dog();
        cat.run();
        dog.run();
        eat(cat);
        eat(dog);
    }
    public static void eat(Animal a){//2.使用父类类型的形参,可以接受一切的子类对象,扩展性强。
        System.out.println("吃东西");
    }
}

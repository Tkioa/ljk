package com.itheima.polymorphsm3;

public class Test {
    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal dog = new Dog();
        show(cat);
        show(dog);
    }
    public static void show(Animal a){
        if(a instanceof Cat){
            ((Cat) a).catchMouse();//对于类独有的方法,需要强制转换,才能调用.并且强制转换时,要根据instanceof判断是否类型相同。
        }else if(a instanceof Dog){
            ((Dog)a).eat();
        }
    }
}

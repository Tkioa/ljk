package com.itheima.interface4;

public class Test {
    public static void main(String[] args) {
        B b = new B();
        b.show();
        A.go();
    }
}

class B implements A{}
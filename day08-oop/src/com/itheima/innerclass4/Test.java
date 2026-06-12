package com.itheima.innerclass4;

//匿名内部类的应用。
public class Test {
    public static void main(String[] args) {
        People student = new People(){
            @Override
            public void show(){
                System.out.println("学生游得很快🏊🏾‍♂️");
            }
        };
        People teacher = new People(){
            @Override
            public void show(){
                System.out.println("老师游的很溜🏊🏾");
            }
        };
        water(student);
        water(teacher);
    }
    public static void water(People p){
        System.out.println("开始...");
        p.show();
        System.out.println("结束...");
    }
}


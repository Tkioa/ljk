package com.itheima.enumDemo;
//枚举类很适合做信息分类和标志
public class Test {
    public static void main(String[] args) {
        //System.out.println(A.X);
        //做一个模拟上下左右移动
        move(Direction.UP);
        move(Direction.DOWN);
        move(Direction.RIGHT);
        move(Direction.LEFT);
    }
    public static void move(Direction direction){//枚举类可以有效控制参数的输入范围。
        switch(direction){
            case UP:
                System.out.println("向上移动");
                break;
            case DOWN:
                System.out.println("向下移动");
                break;
            case LEFT:
                System.out.println("向左移动");
                 break;
            case RIGHT:
                System.out.println("向右移动");
                break;
        }
    }
}

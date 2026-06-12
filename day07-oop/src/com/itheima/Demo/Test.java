package com.itheima.Demo;

import java.util.Scanner;

//构建智能家居系统
public class Test {
    public static void main(String[] args) {
        JD [] jd = new JD[4];
        jd[0] = new Lamp("吊灯",true);
        jd[1] = new WashMachine("洗衣机",false);
        jd[2] = new TV("电视机",true);
        jd[3] = new Air("空调",false);
        SmartHomeSystem.printAll(jd);
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("请输入你要控制的设备编号：");
            int number = sc.nextInt();
            switch(number){
                case 1:
                    SmartHomeSystem.SwitchStatus(jd[0]);
                    break;
                case 2:
                    SmartHomeSystem.SwitchStatus(jd[1]);
                    break;
                case 3:
                    SmartHomeSystem.SwitchStatus(jd[2]);
                    break;
                case 4:
                    SmartHomeSystem.SwitchStatus(jd[3]);
                    break;
                case 0:
                    System.out.println("退出APP");
                    return;
                default:
                    System.out.println("输入错误！");
            }
        }
    }
}

package com.itheima.branch;

import java.util.Scanner;

/**
 * 1.Switch中的case表达式不支持浮点型,long;
 * 2.case表达式必须是字面量而不是自变量:例如case b格式错误,case 10格式正确;
 */
public class SwitchDemo2 {
    public static void main(String[] args) {
        /*switch穿透性的应用
        * case语句不加break语句,switch语句会自动向下穿透执行;
        * */
        test1();
    }
    public static void test1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("输入日期:");
        String date = sc.next();
        switch(date){
            case "星期一":
            case "星期二":
            case "星期三":
            case "星期四":
            case "星期五":
                System.out.println("工作日");
                break;
            case "星期六":
            case "星期日":
                System.out.println("休息日");
                break;
            default:
                System.out.println("输入信息有误");
        }
    }
}

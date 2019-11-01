package cn.jmjy.day02;

import java.util.Scanner;

public class Test1 { //类:首字母大写MyAge

    public static final int MY_AGE=18;//常量:全部大写，用下划线隔开
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("请输入基本工资:");
        double baseSalary=input.nextDouble();
        double pSalary=baseSalary*0.3;
        double hSalary=baseSalary*0.4;
        double salary=baseSalary+pSalary+hSalary;
        System.out.println("该员工基本工资明细:");
        System.out.println("基本工资为:"+baseSalary);
        System.out.println("物价津贴为:"+baseSalary*0.3);
        System.out.println("房租津贴为:"+baseSalary*0.4);
        System.out.println("员工薪水为:"+salary);

    }
}

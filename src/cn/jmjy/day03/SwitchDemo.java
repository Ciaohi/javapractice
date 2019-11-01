package cn.jmjy.day03;

import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args) {
        test1();

    }




    public static void test1() {
        Scanner input=new Scanner(System.in);
        System.out.println("请输入星期几：（0：星期天，1：星期一,.....）");
       int day=input.nextInt();
       switch (day){
           case 0:
               System.out.println("星期天");
               break;
           case 1:
               System.out.println("星期一");
               break;
           case 2:
               System.out.println("星期二");
               break;
           case 3:
               System.out.println("星期三");
               break;
           case 4:
               System.out.println("星期四");
               break;
           case 5:
               System.out.println("星期五");
               break;
           case 6:
               System.out.println("星期六");
               break;
           default:
               System.out.println("见鬼....");
               break;

       }
    }


}
